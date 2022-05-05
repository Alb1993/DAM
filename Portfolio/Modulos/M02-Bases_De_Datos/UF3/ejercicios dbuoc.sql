use dbuoc;
/*Ejercicios dbuoc*/
/*Ejercicio 1*/
create table finalitzat(
nom_projecte	CHAR(20),
finalitzat 		ENUM('S','N'),
FOREIGN KEY (nom_projecte) REFERENCES projectes(nom_proj)
);
DELIMITER //
create trigger ex01 after insert on projectes for each row
BEGIN
IF((new.data_fi)IS NOT NULL) THEN
	INSERT INTO finalitzat VALUES(new.nom_proj,'S');    
ELSE
	INSERT INTO finalitzat VALUES(new.nom_proj,'N');
END IF ;
END //
DELIMITER ;

/*Ejercicio 2*/
DELIMITER //
create trigger ex02 after insert on projectes for each row
BEGIN
IF((new.data.fi)IS NOT NULL) THEN
	INSERT INTO finalitzat VALUES(new.nom_proj,'S');    
ELSE
	INSERT INTO finalitzat VALUES(new.nom_proj,'N');
END IF ; 
END //
DELIMITER ;

/*Ejercicio 3*/
ALTER TABLE projectes ADD numero_de_treballadors INT(4);

DELIMITER //
create trigger ex03 after insert on projectes for each row
BEGIN
    UPDATE projectes SET numero_de_treballadors=(SELECT COUNT(*) FROM projecte pro, empleats emp where pro.codi=emp.num_proj) where nom_proj=new.nom_proj;
END //
DELIMITER ;

/*Ejercicio 4*/
DELIMITER //
create trigger ex03 after insert on projectes for each row
	
    UPDATE projectes SET numero_de_treballadors=(SELECT COUNT(*) FROM projecte pro, empleats emp where pro.codi=emp.num_proj) where nom_proj=new.nom_proj;

DELIMITER ;

/*Exercici 5*/
alter table departament add tipus_sou
DELIMITER //
create trigger ex05 before insert on empleats for each row
BEGIN
	IF(new.sou>=50000)THEN
		UPDATE empleats SET nom_dpt='DIR' WHERE codi_empl=new.codi_empl; 
    ELSE IF(new.sou<50000 and new.sou>30000)THEN
		UPDATE empleats SET nom_dpt='DISS' WHERE codi_empl=new.codi_empl; 
    ELSE IF(new.sou<=30000)THEN
		UPDATE empleats SET nom_dpt='PROG' WHERE codi_empl=new.codi_empl; 
	END IF;
    END IF;
    END IF;
END //
DELIMITER ;

/* EX 05 UPDATE */
DELIMITER //
create trigger ex05 after update on empleats for each row
BEGIN
	IF(new.sou<>old.sou)THEN 
		IF(new.sou>=50000)THEN
			UPDATE empleats SET nom_dpt='DIR' WHERE codi_empl=new.codi_empl; 
		ELSE IF(new.sou<50000 and new.sou>30000)THEN
			UPDATE empleats SET nom_dpt='DISS' WHERE codi_empl=new.codi_empl; 
		ELSE IF(new.sou<=30000)THEN
			UPDATE empleats SET nom_dpt='PROG' WHERE codi_empl=new.codi_empl; 
		END IF;
		END IF;
		END IF;
	END IF;
END //
DELIMITER ;

/*Exercici 6*/
DELIMITER //
CREATE TRIGGER ex06 BEFORE INSERT ON projectes FOR EACH ROW
BEGIN
	DECLARE ciudadCliente=(SELECT ciutat from clients);
	IF(empleats.num_proj IS NULL AND clients.ciutat=empleats.ciutat_dpt)THEN
        UPDATE empleats SET num_proj=new.codi_proj WHERE codi_empl=(SELECT codi_empl FROM empleats, projectes, clients WHERE empleats.num_proj is null and projectes.codi_client=clients.codi_cli and empleats.ciutat_dpt=clients.ciutat);
    END IF;
END //
DELIMITER ;