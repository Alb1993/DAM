use exemple_disparadors;

/* Ejercicio 56 */

CREATE TABLE suma_valors{
codi		INT(1)
vegades		INT(3)
}
INSERT suma_valors values(1,0);
INSERT suma_valors values(2,0);
INSERT suma_valors values(3,0);
INSERT suma_valors values(4,0);
INSERT suma_valors values(5,0);
INSERT suma_valors values(6,0);
INSERT suma_valors values(7,0);
INSERT suma_valors values(8,0);
INSERT suma_valors values(9,0);
INSERT suma_valors values(10,0);
DELIMITER //
CREATE TRIGGER exe_56 AFTER INSERT ON prova FOR EACH ROW
BEGIN
	UPDATE suma_valors SET vegades=(Select count(pr.codi) FROM prova pr WHERE sv.codi=new.codi) where codi=new.codi;
END //
DELIMITER ;