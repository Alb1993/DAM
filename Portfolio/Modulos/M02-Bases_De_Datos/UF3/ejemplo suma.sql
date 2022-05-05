use exemple_disparadors;

insert into prova(codi) values(0);
insert into suma(suma) values(0); 
DELIMITER //
/* Ejercicio */
CREATE TRIGGER ex57 AFTER INSERT ON prova FOR EACH ROW
	BEGIN
		INSERT INTO SUMA VALUES (new.codi);   /* Primero insertamos el valor de codi en la tabla suma*/
        IF ((SELECT COUNT(*) FROM suma)>10)  /* contamos si hay mas de 10 inserts en suma */
			THEN DELETE FROM suma LIMIT 1;   /* Usamos el limit 1 para encontrar el primer valor i lo borramos con delete from */
        END IF;
    END //    
DELIMITER ;    
INSERT INTO prova values (1);
INSERT INTO prova values (2);
INSERT INTO prova values (3);
INSERT INTO prova values (4);
INSERT INTO prova values (5);
INSERT INTO prova values (6);
INSERT INTO prova values (7);
INSERT INTO prova values (8);
INSERT INTO prova values (9);
INSERT INTO prova values (10);
INSERT INTO prova values (11);
