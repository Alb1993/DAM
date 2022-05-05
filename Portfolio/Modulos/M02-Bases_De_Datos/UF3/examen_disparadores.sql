use examen_disparadors;

// DELIMITER 
create trigger exHoresDia before insert on hores_dia for each row
begin
	IF((SELECT count(*) from hores_dia where IDtargeta=new.IDtargeta and dia=date(now())=2) THEN
        declare tempsDiari;
        tempsDiari=(SELECT new.temps-old.temps FROM hores_dia WHERE IDtargeta=new.IDtargeta and dia=date(now()))
		tempsTotal=tempsTotal+tempsDiari;
    end if;
end
DELIMITER ;