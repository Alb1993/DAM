use dbuoc;
ALTER TABLE projectes ADD coste_proj INT(10);
DELIMITER //
CREATE TRIGGER ex03 AFTER INSERT ON projectes FOR EACH ROW
BEGIN
	IF(new.data_fi IS NOT NULL) THEN
		UPDATE coste_proj SET coste_proj = coste_proj + (SELECT TIMESTAMPDIFF(month, data_fi, data_inici)*empleats.sou) WHERE projecte=new.projecte; 
    END IF ;
END
DELIMITER ;