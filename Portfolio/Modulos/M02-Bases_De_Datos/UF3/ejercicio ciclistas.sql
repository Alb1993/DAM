
DELIMITER //
CREATE TRIGGER exciclismo BEFORE INSERT ON ciclistas FOR EACH ROW
BEGIN
	IF(select count(*) from ciclistas where codEquipo=new.codEquipo and nacionalidad<>(SELECT nacionalidad FROM equipos WHERE codEquipo=new.codEquipo)>4)THEN
		call raiseapplication_error("No se puede introducir el ciclista, el equipo esta lleno.");
    END IF;
END //
DELIMITER ;