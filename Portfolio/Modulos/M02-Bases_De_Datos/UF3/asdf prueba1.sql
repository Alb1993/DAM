DELIMITER //
create trigger examen01 before insert on alumnos for each row
begin 
	declare curs_actual int(1);
    set curs_actual=(select curso from asignaturas cod )
	if((select distinct curso from asignaturas a, notas n where a.cod=n.cod and n.dni = new.dni)<>curs_actual)
    then 
		call raiseapplication_error("No se puede introducir la nota.");
	end if ;
end ;
DELIMITER ;