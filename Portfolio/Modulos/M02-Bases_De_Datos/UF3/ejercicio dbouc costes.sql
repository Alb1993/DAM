use dbuoc;
/*Ejercicio 2*/

DELIMITER //

create trigger ex02 after insert on projectes for each row
BEGIN
IF((new.data.fi)IS NOT NULL) THEN
	INSERT INTO finalitzat VALUES(new.nom_proj,'S');    
ELSE
	INSERT INTO finalitzat VALUES(new.nom_proj,'N');
END IF ; 
END //
DELIMITER ;
ALTER TABLE projectes ADD coste_proj INT(10);
DELIMITER //
CREATE TRIGGER ex03 AFTER INSERT ON projectes FOR EACH ROW
BEGIN
	IF(new.data_fi IS NOT NULL) THEN
		UPDATE coste_proj SET coste_proj = coste_proj + (SELECT TIMESTAMPDIFF(month, new.data_fi, new.data_inici)*(SELECT sou FROM empleats emp, projectes pro WHERE pro.)) WHERE projecte=new.projecte; 
    END IF ;
END
DELIMITER ;

CREATE TRIGGER ex03 AFTER UPDATE ON projectes FOR EACH ROW
BEGIN
	IF(new.data_fi IS NOT NULL) THEN
		UPDATE coste_proj SET coste_proj = coste_proj +  WHERE projecte=new.projecte; 
    END IF ;
END

CREATE TRIGGER ex03 AFTER DELETE ON projectes FOR EACH ROW
BEGIN
	IF(new.data_fi IS NOT NULL) THEN
		UPDATE coste_proj SET coste_proj = coste_proj - (SELECT sou FROM empleats WHERE sou=old.sou) WHERE projecte=new.projecte; 
    END IF ;
END

DELIMITER ; 