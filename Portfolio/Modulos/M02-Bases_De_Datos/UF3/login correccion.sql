use login;
drop database login;
DELIMITER //
/*Correccion login*/
create trigger login after insert on alumnes for each row
begin 
	insert into login_alumnes values (new.codi,concat(LEFT(new.nom,2),LEFT(new.nomcognom,2),new.codi));
end
DELIMITER ;

