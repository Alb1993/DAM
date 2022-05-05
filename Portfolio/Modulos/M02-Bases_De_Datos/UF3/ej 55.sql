use exemple_disparadors;

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
DELIMITER ;

DELIMITER //
CREATE TRIGGER exe_55_update AFTER UPDATE ON prova FOR EACH ROW
BEGIN
	INSERT INTO prova_log VALUES (now(), user(), (concat("Modificació ",old.codi,">",new.codi)));
END //
DELIMITER ;

DELIMITER //
CREATE TRIGGER exe_55_delete AFTER DELETE ON prova FOR EACH ROW
BEGIN
	INSERT INTO prova_log VALUES (now(), user(), (concat("Eliminació ",old.codi)));
END //
DELIMITER ;