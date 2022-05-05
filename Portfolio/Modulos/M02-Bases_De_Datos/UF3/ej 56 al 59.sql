

/* Ejercicio 57 */
DELIMITER //
CREATE TRIGGER exe_57 AFTER INSERT ON prova FOR EACH ROW
	BEGIN
		INSERT INTO prova_log(hora_i_data) VALUES (now(), user(), (concat("Inserció ",new.codi)));
	END //
DELIMITER ;

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



INSERT INTO  VALUES()


DELIMITER //


CREATE TABLE prova_puntuacio; /* Creamos una tabla llamado prova_puntuacio */
(lletra enum ('A','B','C','D','E'),
puntuacio INT check(puntuacio<=1 AND puntuacio >=50) /* Con check miramos si cumplen las condiciones especificadas dentro del parentesis. */
);


CREATE TABLE prova_puntuacio_seg;
(lletra enum ('A','B','C','D','E'),
puntuacio INT check(puntuacio<=1 AND puntuacio >=50) /* Con check miramos si cumplen las condiciones especificadas dentro del parentesis. */
INSERT INTO prova_puntuacio_seg VALUES('A',null);
INSERT INTO prova_puntuacio_seg VALUES('B',null);
INSERT INTO prova_puntuacio_seg VALUES('C',null);
INSERT INTO prova_puntuacio_seg VALUES('D',null);
INSERT INTO prova_puntuacio_seg VALUES('E',null);
);
CREATE TRIGGER ex58 AFTER INSERT ON prova_puntuacio FOR EACH ROW
BEGIN
	UPDATE INTO prova_puntuacio_seg values puntuacio=new.puntuacio WHERE lletra=new.lletra;
END // 
DELIMITER ;

/* Ejercicio 59 */
DELIMITER //
CREATE TRIGGER ex59 AFTER INSERT ON prova_puntuacio FOR EACH ROW
BEGIN
	UPDATE prova_puntuacio_seg SET puntuacio=(SELECT COUNT(*) from lletra WHERE lletra=new.lletra) WHERE lletra=new.lletra; 
END //
DELIMITER ;