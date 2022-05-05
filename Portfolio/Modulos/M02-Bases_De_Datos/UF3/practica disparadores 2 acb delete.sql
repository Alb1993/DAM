use acb;

DELIMITER //
CREATE TRIGGER delete_partido AFTER DELETE ON partit2 FOR EACH ROW
BEGIN   
	IF equip_local=(SELECT new.equip_local FROM classificacio WHERE old.equip_local=new.equip_local) 
    AND equip_visitant=(SELECT new.equip_visitant FROM classificacio WHERE old.equip_visitant=new.equip_visitant) THEN
		UPDATE classificacio SET (0,'','',0,0) WHERE equip_local=new.equip_local AND equip_visitant=new.equip_visitant;
    END IF;
END // /* Si hacemos un SET y no ponemos una opcion WHERE, nos hara un SET para toda la tabla.*/
DELIMITER ;