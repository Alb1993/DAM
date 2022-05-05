use entidad_bancaria;

DELIMITER //
CREATE TRIGGER insertar_saldo AFTER INSERT ON moviment FOR EACH ROW
BEGIN
	IF((SELECT count(*) FROM saldo WHERE compte = new.compte)=0) THEN 
		INSERT INTO saldo VALUES (new.compte,0);
	IF((SELECT count(*) FROM saldo_diari WHERE dato=now())=0) THEN 
		INSERT INTO saldo_diari VALUES (date(now()),0);
    END IF;    
    END IF;
	IF(new.tipus='H')THEN
		UPDATE saldo SET saldo=saldo+new.valor WHERE compte=new.compte;
		UPDATE saldo_diari SET saldo=saldo+new.valor WHERE dato=date(now());
	ELSE
		UPDATE saldo SET saldo=saldo-new.valor WHERE compte=new.compte;
		UPDATE saldo_diari SET saldo=saldo-new.valor WHERE dato=date(now());
    END IF;
    IF(old.date!=date(now())) THEN
		
    END IF;
    INSERT INTO seguretat VALUES (new.compte,now(),user(),new.descripcio);	
END // /* Si hacemos un SET y no ponemos una opcion WHERE, nos hara un SET para toda la tabla.*/
DELIMITER ;
