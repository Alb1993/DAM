use dbuoc;
/*Ejercicio 4*/
DELIMITER //
create trigger dbuoc04 before insert on empleats for each row
begin 
/* Haremos el select count en la tabla empleats */
	if(select count(*) from departaments where nom_dpt=new.nom_dpt AND ciutat_dpt=new.ciutat_dpt)==10)
    then 
		call raiseapplication_error("Departament ple");
	end if ;
end ;
DELIMITER ;
