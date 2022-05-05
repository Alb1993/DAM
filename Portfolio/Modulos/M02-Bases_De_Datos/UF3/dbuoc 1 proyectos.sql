create table proj_final(
codi_proj	TINYINT		PRIMARY KEY,
nom_proj	CHAR(20),
finalitzat	ENUM('Si', 'No'),
FOREIGN KEY (codi_proj)REFERENCES projectes (codi_proj)
);

DELIMITER //
CREATE TRIGGER dbouc1 AFTER INSERT ON  projectes FOR EACH ROW
BEGIN
	IF(SELECT count(*) FROM proj_final WHERE codi_proj=new.codi_proj)=0) THEN
		INSERT INTO proj_final VALUES (new.codi_proj, new.nom_proj, 'No');
	END IF;
IF(new.data_fi IS NOT NULL )THEN
	UPDATE proj_final SET finalitzat='Si' WHERE codi_proj=new.codi_proj; 
END IF;
END ;

CREATE TRIGGER dbouc1 AFTER UPDATE ON  projectes FOR EACH ROW
BEGIN
	IF(old.data_fi<>new.data_fi) THEN
		IF(new.data_fi IS NOT NULL )THEN
			UPDATE proj_final SET finalitzat='Si' WHERE codi_proj=new.codi_proj; 
		END IF;
	END IF;
DELIMITER ;
