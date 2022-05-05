CREATE DATABASE exemple_disparadors;
USE exemple_disparadors;
CREATE TABLE prova (codi INT);
CREATE TABLE suma (suma INT);
INSERT INTO prova VALUES (6);
DELIMITER //
CREATE TRIGGER actual AFTER DELETE ON prova FOR EACH ROW
BEGIN
    UPDATE suma SET suma=suma-1;
END //
DELIMITER ;