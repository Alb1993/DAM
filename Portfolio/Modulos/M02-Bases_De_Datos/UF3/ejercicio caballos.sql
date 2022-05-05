create database carreraCaballos;

create table carreras(
codCarrera		VARCHAR(4),
fechaYHora 		DATE,
nombre 			VARCHAR(20), 
importePremio 	INT(6),
apuestaLimite 	NUMERIC(5,2)
);

create table participaciones(
codCaballo		VARCHAR(4),
codCarrera		VARCHAR(4),
dorsal			NUMERIC(2),
jockey			VARCHAR(10),
posicionFinal	NUMERIC(2)
);

create table apuestas(
DNICliente	VARCHAR(10),
codCaballo	VARCHAR(4),
codCarrera	VARCHAR(4),
Importe		NUMERIC(4),
tantoPorUno	NUMERIC(4,2)
codCaballo REFERENCES ()
);

/*Realiza un trigger que impida hacer una apuesta si el caballo no participa en la carrera correspondiente, 
además debe controlar que el importe apostado no supere el límite fijado para dicha carrera.*/

// DELIMITER 
create trigger excaballo before insert on apuestas for each row
begin
	IF((SELECT count(*) from participaciones where codCaballo=new.codCaballo AND codCarrera=new.codCarrera) = 0) THEN
				call raiseapplication_error("No se puede introducir el caballo.");
	OR(new.importe > (SELECT apuestaLimite FROM carreras WHERE codCarrera=new.codCarrera)) THEN
	
		call raiseapplication_error("No se puede introducir la apuesta.");
    end if;
end
DELIMITER ;