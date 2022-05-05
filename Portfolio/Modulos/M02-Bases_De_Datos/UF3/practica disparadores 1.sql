use exemple_disparadors;

DELIMITER //
CREATE TRIGGER exe_50 AFTER INSERT ON prova FOR EACH ROW
BEGIN
	UPDATE suma SET suma=new.codi;
END
DELIMITER ;

/* Ejercicio 54 */
CREATE TABLE sumatext(suma VARCHAR(200));

DELIMITER //
CREATE TRIGGER exe_54 AFTER INSERT ON prova FOR EACH ROW
BEGIN
	IF((SELECT COUNT(*) FROM suma_text)=0) THEN INSERT INTO suma_text VALUES (NEW.codi); 
    ELSE() UPDATE suma_text set suma=concat(suma,'+',new.codi);
END //
DELIMITER ;

/* Ejercicio 55 */

CREATE TABLE prova_log{
hora_i_data	DATETIME
usuari		VARCHAR(9)
accio		VARCHAR(9)
}

DELIMITER //
CREATE TRIGGER exe_55_insert AFTER INSERT ON prova FOR EACH ROW
BEGIN
	INSERT INTO prova_log(hora_i_data) VALUES (now(), user(), (concat("Inserció ",new.codi)));
END //

CREATE TRIGGER exe_55_update AFTER UPDATE ON prova FOR EACH ROW
BEGIN
	INSERT INTO prova_log VALUES (now(), user(), (concat("Modificació ",old.codi,">",new.codi)));
END //

CREATE TRIGGER exe_55_delete AFTER DELETE ON prova FOR EACH ROW
BEGIN
	INSERT INTO prova_log VALUES (now(), user(), (concat("Eliminació ",old.codi)));
END //
DELIMITER ;

/* Ejercicio 56 */

CREATE TABLE suma_valors{
codi		INT(1)
vegades		INT(3)
}
INSERT suma_valors values(1,0);
INSERT suma_valors values(2,0);
INSERT suma_valors values(3,0);
INSERT suma_valors values(4,0);
INSERT suma_valors values(5,0);
INSERT suma_valors values(6,0);
INSERT suma_valors values(7,0);
INSERT suma_valors values(8,0);
INSERT suma_valors values(9,0);
INSERT suma_valors values(10,0);
DELIMITER //
CREATE TRIGGER exe56_insert AFTER INSERT ON prova FOR EACH ROW
BEGIN
	UPDATE suma_valors SET vegades=(Select count(*) FROM prova WHERE codi=new.codi) where codi=new.codi;
END //

CREATE TRIGGER exe56_delete AFTER DELETE ON prova FOR EACH ROW
BEGIN
	UPDATE suma_valors SET vegades=(Select count(*) FROM prova WHERE codi=new.codi) where codi=new.codi;
END //
DELIMITER ;

/* Ejercicio 57 */
DELIMITER //
CREATE TRIGGER exe_57 AFTER INSERT ON prova FOR EACH ROW
BEGIN
		INSERT INTO prova_log(hora_i_data) VALUES (now(), user(), (concat("Inserció ",new.codi)));
END //
DELIMITER ;

/* Ejercicio 57 */
DELIMITER //
CREATE TRIGGER exe_57 AFTER INSERT ON prova FOR EACH ROW
BEGIN
		INSERT INTO prova_log(hora_i_data) VALUES (now(), user(), (concat("Inserció ",new.codi)));
END //

CREATE TRIGGER exe_57 AFTER INSERT ON prova FOR EACH ROW
BEGIN
		INSERT INTO prova_log(hora_i_data) VALUES (now(), user(), (concat("Inserció ",new.codi)));
END //

CREATE TRIGGER exe_57 AFTER INSERT ON prova FOR EACH ROW
BEGIN
		INSERT INTO prova_log(hora_i_data) VALUES (now(), user(), (concat("Inserció ",new.codi)));
END //
DELIMITER ;

// DELIMITER
CREATE TRIGGER ex56_ins AFTER INSERT ON prova FOR EACH ROW
	BEGIN
		IF((SELECT(*)FROM suma_valors WHERE codi=new.codi)=0)
			INSERT INTO suma_valors VALUES(new.codi, 1),
		ELSE
			UPDATE suma_valors SET vegades=(select count(*)from prova where codi=new.codi) where codi=new.codi
        END IF ;    
    END //
CREATE TRIGGER ex56_del AFTER DELETE ON prova FOR EACH ROW
	BEGIN
		IF((SELECT(*)FROM suma_valors WHERE codi=old.codi)=0) THEN
			DELETE FROM suma_valors WHERE codi=old.codi
		ELSE
			UPDATE suma_valors SET vegades=(select count(*)from prova where codi=old.codi) where codi=old.codi
        END IF ;    
    END //    
DELIMITER ;


/* Ejercicio */
CREATE TRIGGER ex56_del AFTER INSERT ON prova FOR EACH ROW
	BEGIN
		INSERT INTO SUMA VALUES (new.codi);
        IF (SELECT COUNT(codi)FROM prova)>10 
            THEN LIMIT 1 AND DELETE codi, suma   
        END IF;
    END //    
DELIMITER ;


CREATE TRIGGER ex56_del AFTER DELETE ON prova FOR EACH ROW
	BEGIN
		IF((SELECT * FROM suma_valors WHERE codi=old.codi)=0) THEN
			DELETE FROM suma_valors WHERE codi=old.codi
		ELSE 
			UPDATE suma_valors SET vegades=(select count(*)from prova where codi=old.codi) where codi=old.codi
        END IF ;    
    END //    
DELIMITER ;

DELIMITER //
/* Ejercicio 57 correccion*/
CREATE TRIGGER ex57 AFTER INSERT ON prova FOR EACH ROW
	BEGIN
		INSERT INTO SUMA VALUES (new.codi);  /* Primero insertamos el valor de codi en la tabla suma*/
        IF ((SELECT COUNT(*) FROM suma)>10)  /* contamos si hay mas de 10 inserts en suma */
			THEN DELETE FROM suma LIMIT 1;   /* Usamos el limit 1 para encontrar el primer valor i lo borramos con delete from */
        END IF;
    END //    
DELIMITER ; 


/* Ejercicio 59 */
DELIMITER //
CREATE TRIGGER ex59_update AFTER UPDATE ON prova_puntuacio FOR EACH ROW
BEGIN
		IF (new.lletra<>old.lletra) THEN /* Este IF nos indica que actualicemos el valor solo si se ha cambiado la letra, ya que de la manera convencional es ineficiente. */ 
        	UPDATE prova_puntuacio_seg SET puntuacio=(SELECT COUNT(*) from prova_puntuacio WHERE lletra=old.lletra) WHERE lletra=new.lletra;
			UPDATE prova_puntuacio_seg SET puntuacio=(SELECT COUNT(*) from prova_puntuacio WHERE lletra=old.lletra) WHERE lletra=new.lletra;
        END IF; 
END // /* Si hacemos un SET y no ponemos una opcion WHERE, nos hara un SET para toda la tabla.*/
CREATE TRIGGER ex59_insert AFTER INSERT ON prova_puntuacio FOR EACH ROW
BEGIN
	UPDATE prova_puntuacio_seg SET puntuacio=(SELECT COUNT(*) from prova_puntuacio WHERE lletra=new.lletra) WHERE lletra=new.lletra; 
END // /* Si hacemos un SET y no ponemos una opcion WHERE, nos hara un SET para toda la tabla.*/
CREATE TRIGGER ex59_delete AFTER DELETE ON prova_puntuacio FOR EACH ROW
BEGIN
	UPDATE prova_puntuacio_seg SET puntuacio=(SELECT COUNT(*) from prova_puntuacio WHERE lletra=old.lletra) WHERE lletra=new.lletra; 
END // /* Si hacemos un SET y no ponemos una opcion WHERE, nos hara un SET para toda la tabla.*/
DELIMITER ;