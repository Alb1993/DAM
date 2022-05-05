USE dbuoc;
/*Exercici 6*/
DELIMITER //
CREATE TRIGGER ex06 BEFORE INSERT ON projectes FOR EACH ROW
BEGIN
	IF(empleats.num_proj IS NULL AND clients.ciutat=empleats.ciutat_dpt)THEN
        UPDATE empleats SET num_proj=new.codi_proj WHERE codi_empl=(SELECT codi_empl FROM empleats, projectes, clients WHERE empleats.num_proj is null and projectes.codi_client=clients.codi_cli and empleats.ciutat_dpt=clients.ciutat);
    END IF;
END //
DELIMITER ;
