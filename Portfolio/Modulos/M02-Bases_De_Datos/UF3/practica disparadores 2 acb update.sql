use acb;

DELIMITER //
CREATE TRIGGER modif_partido AFTER UPDATE ON partit2 FOR EACH ROW
BEGIN       
    IF(new.puntuacio<>old.puntuacio) THEN 
		UPDATE classificacio SET partits_guanyats=(SELECT COUNT(*) FROM partit2 WHERE gols_local>gols_visitant AND equip_local=new.equip_local) WHERE old.equip_local=new.equip_local;
		UPDATE classificacio SET partits_perduts=(SELECT COUNT(*) FROM partit2 WHERE gols_local<gols_visitant AND equip_visitant=new.equip_visitant) WHERE equip=new.equip_visitant;

		UPDATE classificacio SET partits_empatats=(SELECT COUNT(*) FROM partit2 WHERE gols_local=gols_visitant AND equip_local=new.equip_local) WHERE equip=new.equip_local;
        UPDATE classificacio SET partits_empatats=(SELECT COUNT(*) FROM partit2 WHERE gols_local=gols_visitant AND equip_visitant=new.equip_visitant) WHERE equip=new.equip_visitant;

		UPDATE classificacio SET partits_perduts=(SELECT COUNT(*) FROM partit2 WHERE gols_local<gols_visitant AND equip_local=new.equip_local) WHERE equip=new.equip_local;
        UPDATE classificacio SET partits_guanyats=(SELECT COUNT(*) FROM partit2 WHERE gols_local<gols_visitant AND equip_visitant=new.equip_visitant) WHERE equip=new.equip_visitant;

		UPDATE classificacio SET gols_favor=(SELECT SUM(gols_local) FROM partit2 WHERE new.equip_local=equip_local) WHERE equip=new.equip_local;
		UPDATE classificacio SET gols_contra=(SELECT SUM(gols_visitant) FROM partit2 WHERE new.equip_local=equip_local) WHERE equip=new.equip_local;
		UPDATE classificacio SET gols_favor=(SELECT SUM(gols_visitant) FROM partit2 WHERE new.equip_visitant=equip_visitant) WHERE equip=new.equip_visitant;
		UPDATE classificacio SET gols_contra=(SELECT SUM(gols_local) FROM partit2 WHERE new.equip_visitant=equip_visitant) WHERE equip=new.equip_visitant;

		UPDATE classificacio SET puntuacio=(SELECT partits_guanyats FROM classificacio WHERE equip=new.equip_local)*3;
		UPDATE classificacio SET puntuacio=puntuacio+(SELECT partits_empatats FROM classificacio WHERE equip=new.equip_local);
    END IF; 
    
END // /* Si hacemos un SET y no ponemos una opcion WHERE, nos hara un SET para toda la tabla.*/
DELIMITER ;