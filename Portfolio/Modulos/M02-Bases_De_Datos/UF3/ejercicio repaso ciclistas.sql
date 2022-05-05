create database ciclismo;

create table equipos{
codEquipo		int(4),
nombre			varchar(30),
nacionalidad	varchar(20),
nombredirector	varchar(20)
}

create table ciclistas{
dorsal			int(4),
nombre			varchar(30),
nacionalidad	varchar(20),
codequipo		varchar(20),
fechanacimiento	date
}

DELIMITER //
CREATE TRIGGER exciclismo BEFORE INSERT ON projectes FOR EACH ROW
BEGIN
	IF((SELECT count(*) FROM ciclistas WHERE codEquipo=new.codEquipo)>4)THEN
		call raiseapplication_error("No se puede introducir el ciclista, el equipo esta lleno.");
    END IF;
END //
DELIMITER ;