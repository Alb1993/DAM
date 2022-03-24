use acb;
/*Crear dos tablas, partit2 y classificacio y crear un disparador que cada vez que yo inserte un partido,
me actualice la tabla classificacio con los datos de ambos equipos.*/
CREATE TABLE partit2
	(jornada		INT,
    equip_local		VARCHAR(20),
    equip_visitant	VARCHAR(20),
    gols_local		INT,
    gols_visitant	INT,
    PRIMARY KEY(jornada,equip_local)
    );

CREATE TABLE classificacio
	(equip				VARCHAR(20)			PRIMARY KEY,
	partits_guanyats	INT					DEFAULT 0,
	partits_empatats	INT					DEFAULT 0,
	partits_perduts		INT					DEFAULT 0,
	gols_favor			INT					DEFAULT 0,
	gols_contra			INT					DEFAULT 0
	);

ALTER TABLE classificacio ADD puntuacio INT(4);

DELIMITER //
CREATE TRIGGER intro_partido AFTER INSERT ON partit2 FOR EACH ROW
BEGIN
    /* Si con el Select Count es = 0 es que no existe en la base de datos. */
	IF((SELECT count(*) FROM classificacio WHERE new.equip_local=classificacio.equip)=0) THEN 
		INSERT INTO classificacio VALUES (new.equip_local,0,0,0,0,0,0);
    END IF;     
	IF((SELECT count(*) FROM classificacio WHERE new.equip_visitant=classificacio.equip)=0) THEN 
		INSERT INTO classificacio VALUES (new.equip_visitant,0,0,0,0,0,0);
    END IF;    
    IF(new.gols_local>new.gols_visitant) THEN
		UPDATE classificacio SET partits_guanyats=(SELECT COUNT(*) FROM partit2 WHERE gols_local>gols_visitant AND equip_local=new.equip_local) WHERE equip=new.equip_local;
		UPDATE classificacio SET partits_perduts=(SELECT COUNT(*) FROM partit2 WHERE gols_local<gols_visitant AND equip_visitant=new.equip_visitant) WHERE equip=new.equip_visitant;
        UPDATE classificacio SET puntuacio=puntuacio+3 WHERE equip=new.equip_local;
    ELSE IF(new.gols_local=new.gols_visitant) THEN
		UPDATE classificacio SET partits_empatats=(SELECT COUNT(*) FROM partit2 WHERE gols_local=gols_visitant AND equip_local=new.equip_local) WHERE equip=new.equip_local;
        UPDATE classificacio SET partits_empatats=(SELECT COUNT(*) FROM partit2 WHERE gols_local=gols_visitant AND equip_visitant=new.equip_visitant) WHERE equip=new.equip_visitant;
		UPDATE classificacio SET puntuacio=puntuacio+1 WHERE equip=new.equip_local;
        UPDATE classificacio SET puntuacio=puntuacio+1 WHERE equip=new.equip_visitant;
	ELSE IF(new.gols_local<new.gols_visitant) THEN
		UPDATE classificacio SET partits_perduts=(SELECT COUNT(*) FROM partit2 WHERE gols_local<gols_visitant AND equip_local=new.equip_local) WHERE equip=new.equip_local;
        UPDATE classificacio SET partits_guanyats=(SELECT COUNT(*) FROM partit2 WHERE gols_local<gols_visitant AND equip_visitant=new.equip_visitant) WHERE equip=new.equip_visitant;
	    UPDATE classificacio SET puntuacio=puntuacio+3 WHERE equip=new.equip_visitant;
    END IF; 
	END IF; 
	END IF; 
    /* Tambien podemos hacer gols_favor = gols_favor + new.gols_local y indicariamos lo mismo. */
    UPDATE classificacio SET gols_favor=(SELECT SUM(gols_local) FROM partit2 WHERE new.equip_local=equip_local) WHERE equip=new.equip_local;
    UPDATE classificacio SET gols_contra=(SELECT SUM(gols_visitant) FROM partit2 WHERE new.equip_local=equip_local) WHERE equip=new.equip_local;
    UPDATE classificacio SET gols_favor=(SELECT SUM(gols_visitant) FROM partit2 WHERE new.equip_visitant=equip_visitant) WHERE equip=new.equip_visitant;
    UPDATE classificacio SET gols_contra=(SELECT SUM(gols_local) FROM partit2 WHERE new.equip_visitant=equip_visitant) WHERE equip=new.equip_visitant;
    
    
    UPDATE classificacio SET puntuacio=(SELECT partits_guanyats FROM classificacio WHERE equip=new.equip_local)*3;
    UPDATE classificacio SET puntuacio=puntuacio+(SELECT partits_empatats FROM classificacio WHERE equip=new.equip_local);
END // /* Si hacemos un SET y no ponemos una opcion WHERE, nos hara un SET para toda la tabla.*/
DELIMITER ;

