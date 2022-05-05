use exemple_disparadors;

DELIMITER //
CREATE TRIGGER exe_54 AFTER INSERT ON prova FOR EACH ROW
BEGIN
	IF((SELECT COUNT(*) FROM suma_text)=0) THEN INSERT INTO suma_text VALUES (NEW.codi);
    
    ELSE UPDATE suma_text set suma=concat(suma,'+',new.codi);
    END IF ;
END //
DELIMITER ;

INSERT INTO suma VALUES (6);
INSERT INTO suma VALUES (7);
INSERT INTO suma VALUES (8);