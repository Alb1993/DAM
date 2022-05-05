DROP DATABASE entidad_bancaria;
CREATE DATABASE entidad_bancaria;
USE entidad_bancaria;

CREATE TABLE moviment
	(compte		VARCHAR(10)		NOT NULL,
	dato		TIMESTAMP		NOT NULL DEFAULT CURRENT_TIMESTAMP(),
	descripcio	VARCHAR(30)		NOT NULL,
	tipus		ENUM('H','D')	NOT NULL,
	valor		DECIMAL(7,2)	NOT NULL
	);
    
CREATE TABLE seguretat
	(compte				VARCHAR(10)		NOT NULL,
	dato				TIMESTAMP		NOT NULL,
	usuari				VARCHAR(20)		NOT NULL,
    descripcio_valor	VARCHAR(30)		NOT NULL
	);
    
CREATE TABLE saldo
	(compte		VARCHAR(10)		PRIMARY KEY,
	saldo		DECIMAL(7,2)	NOT NULL
	);
    
CREATE TABLE saldo_diari
	(dato	DATE			PRIMARY KEY,
	saldo	DECIMAL(7,2)	NOT NULL
	);
    
    
    