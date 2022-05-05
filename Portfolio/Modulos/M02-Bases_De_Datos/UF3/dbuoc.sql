CREATE DATABASE IF NOT EXISTS dbuoc;

CREATE TABLE IF NOT EXISTS dbuoc.clients 
  (codi_cli TINYINT PRIMARY KEY, 
   nom_cli VARCHAR(30) NOT NULL,
   nif CHAR(9) UNIQUE NOT NULL UNIQUE,
   adreca VARCHAR(30),
   ciutat VARCHAR(20),
   telefon CHAR(9)
) ENGINE=InnoDB;

CREATE TABLE IF NOT EXISTS dbuoc.departaments 
  (nom_dpt VARCHAR(20),
   ciutat_dpt VARCHAR(20),
   telefon CHAR(9),
   PRIMARY KEY(nom_dpt,ciutat_dpt)
) ENGINE=InnoDB;
 
CREATE TABLE IF NOT EXISTS dbuoc.projectes 
  (codi_proj TINYINT PRIMARY KEY,
   nom_proj CHAR(20) NOT NULL UNIQUE,
   preu DECIMAL(9,2),
   data_inici DATE,
   data_prev_fi DATE,
   data_fi DATE, 
   codi_client TINYINT,
   FOREIGN KEY (codi_client) REFERENCES clients(codi_cli) ON DELETE SET NULL ON UPDATE CASCADE,
   CHECK (data_inici < data_prev_fi),
   CHECK (data_inici < data_fi)
) ENGINE=InnoDB;

CREATE TABLE IF NOT EXISTS dbuoc.empleats 
  (codi_empl TINYINT PRIMARY KEY,
   nom_empl VARCHAR(20) NOT NULL,
   cognom_empl VARCHAR(20) NOT NULL,
   sou DECIMAL(9,2) CHECK (sou>12500.00),
   nom_dpt CHAR(20),
   ciutat_dpt CHAR(20), 
   num_proj TINYINT,
   FOREIGN KEY (nom_dpt,ciutat_dpt) REFERENCES departaments(nom_dpt,ciutat_dpt) ON DELETE SET NULL ON UPDATE CASCADE,
   FOREIGN KEY (num_proj) REFERENCES projectes(codi_proj) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB;


INSERT INTO dbuoc.clients
VALUES (10, 'ECIGSA', '38567893C', 'Aragó 242 4t 1ª', 'Barcelona', '932301520');

INSERT INTO dbuoc.clients
VALUES (20, 'CME', '38123898E', 'València 22', 'Girona', '972235721');

INSERT INTO dbuoc.clients
VALUES (30, 'ACME', '36432127A', 'Mallorca 33', 'LLeida', '973234567');

INSERT INTO dbuoc.clients
VALUES (40, 'JGM', '38782345B', 'Rosselló 44', 'Tarragona', '977337143');

INSERT INTO dbuoc.departaments
VALUES ('DIR', 'Barcelona', '934226070');

INSERT INTO dbuoc.departaments
VALUES ('DIR', 'Girona', '972238970');

INSERT INTO dbuoc.departaments
VALUES ('DISS', 'Lleida', '973235040');

INSERT INTO dbuoc.departaments
VALUES ('DISS', 'Barcelona', '932248523');

INSERT INTO dbuoc.departaments
VALUES ('PROG', 'Tarragona', '977333852');

INSERT INTO dbuoc.departaments
VALUES ('PROG', 'Girona', '972235091');

INSERT INTO dbuoc.projectes
VALUES (1,'GESCOM',600000.00, '2004-1-1', '2005-1-1', NULL, 10);

INSERT INTO dbuoc.projectes
VALUES (2,'PESCI',1200000.00, '2002-1-1', '2004-5-31', '2004-5-1', 10);

INSERT INTO dbuoc.projectes
VALUES (3,'SALSA',600000.00, '2004-2-10', '2005-1-2', NULL, 20);

INSERT INTO dbuoc.projectes
VALUES (4,'TINELL',2400000.00, '2003-1-1', '2005-1-12', NULL, 20);

INSERT INTO dbuoc.empleats
VALUES (1, 'Maria', 'Puig', 60000.00, 'DIR', 'Girona', 1);

INSERT INTO dbuoc.empleats
VALUES (2, 'Pere', 'Mas', 54000.00, 'DIR', 'Barcelona', 4);

INSERT INTO dbuoc.empleats
VALUES (3, 'Anna', 'Ros', 42000.00, 'DISS', 'Lleida', 3);

INSERT INTO dbuoc.empleats
VALUES (4, 'Jordi', 'Roca', 42000.00, 'DISS', 'Barcelona', 4);

INSERT INTO dbuoc.empleats
VALUES (5, 'Clara', 'Blanc', 24000.00, 'PROG', 'Tarragona', 1);

INSERT INTO dbuoc.empleats
VALUES (6, 'Laura', 'Tort', 18000.00, 'PROG', 'Tarragona', 3);

INSERT INTO dbuoc.empleats
VALUES (7, 'Roger', 'Salt', 24000.00, NULL, NULL, 4);

INSERT INTO dbuoc.empleats
VALUES (8, 'Sergi', 'Grau', 18000.00, 'PROG', 'Tarragona', NULL);
