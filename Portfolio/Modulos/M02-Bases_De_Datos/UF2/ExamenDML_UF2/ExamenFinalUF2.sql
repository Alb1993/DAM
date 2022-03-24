use motogp;

/* Mostra el nom dels pilots, de les escuderies amb seu a Itàlia, i que hagin guanyat més d'una carrera. */
SELECT pi.nombre, es.sede /* no muestra nada */
FROM pilotos pi, escuderias es, resultados re
WHERE pi.nombreescuderia=es.nombre AND pi.codigo=re.codpiloto 
AND es.sede="%Italia%" AND re.puesto="1"
GROUP BY pi.nombre
HAVING count(*)>1;
/* Mostra els pilots, i les seves corresponents escuderies, i el nombre de carreres guanyades, d'aquells pilots que han guanyat més 
d'una carrera celebrada a partir de les 15:00h */
SELECT pi.nombre, pi.nombreescuderia, count(re.codpiloto)
FROM pilotos pi, resultados re
WHERE pi.nombre=re.codpiloto AND re.codpiloto IN (SELECT re.codpiloto FROM resultados re, carreras ca 
WHERE re.nombregp=ca.nombregp AND re.anyo=ca.año AND re.puesto="1" AND TIME(ca.fechahorarioinicio)>"15:00")
group by pi.nombre
having count(re.codpiloto)>1;

/* Mostra el número de pilots de cada escuderia, incloent les que no tnguin cap */
SELECT es.nombre, count(*)
FROM escuderias es, pilotos pi
WHERE es.nombre=pi.nombreescuderia
GROUP BY es.nombre
HAVING count(*);
/* Mostra el nombre de carreres guanyades en 2010 per cada pilot, ordenades de major a menor, incloent els pilots que no han guanyat cap. */
SELECT pi.nombre, count(*)
FROM pilotos pi, resultados re, carreras ca
WHERE ca.año=re.anyo AND ca.nombregp=re.nombregp AND re.anyo="2010" AND re.puesto="1"
GROUP BY pi.nombre
ORDER BY count(*) DESC;

/* Mostra el nom i l'any de debut (solament l'any) del pilot que ha guanyat més grans premis. */
SELECT pi.nombre, pi.carreradebut
FROM pilotos pi
WHERE pi.carreradebut="% 2%" OR pi.carreradebut="% 1%"
ORDER BY pi.nombre
LIMIT 1;

/* Mostra el nom i l'any de debut (solament l'any) del pilot que ha guanyat més grans premis. */
SELECT es.nombreescuderia, pi.codigo
from pilotos
WHERE pi.codigo=es.codpiloto AND nombreescuderia="2___" or nombreescuderia="1___";

/* Mostra el nom dels pilots que han arribat en més de 10 segons de diferència del guanyador en la cursa del 2010 que s'han recorregut menys voltes. */
SELECT pi.nombre
FROM pilotos pi, resultados re, carreras ca
WHERE pi.codigo=re.codpiloto AND re.nombregp=ca.nombregp AND re.anyo=ca.año AND re.anyo="2010" AND re.distanciaganador>"10:00.00"
GROUP BY pi.nombre
HAVING min(numvueltas);

/* Mostra amb quina/es quines escuderia/es s’han guanyat més curses */
SELECT es.nombre, count(*)
FROM escuderias es, pilotos pi, resultados re
WHERE es.nombre=pi.nombreescuderia AND pi.codigo=re.codpiloto AND re.puesto="1"
ORDER BY count(*)
LIMIT 1;

/* Mostra quina nacionalitat/s hi ha més pilots. */
SELECT nacionalidad, count(*)
FROM pilotos pi
GROUP BY nacionalidad
ORDER BY count(*) DESC
LIMIT 2;

/* Explica quines dades mostra la següent consulta:

select distinct c.nombrecircuito from resultados r, carreras c
where (r.nombregp=c.nombregp) and (c.año=r.anyo) and (r.puesto=1) and r.codpiloto NOT IN (select codigo from pilotos
where nacionalidad='Española'); */

/* Muestra el nombre de los circuitos donde los ganadores no sean de nacionalidad Española */

/* Afegeix una taula a la BD:

Caldrà que tingui sentit la informació que s'emmagatzema
I per supost, haurà d'estar relacionada amb una o més taules.
Afegeix 2 inserts a la taula creada. */

CREATE TABLE moto(
	matricula		VARCHAR(9),
	codpiloto   	VARCHAR(15)		NOT NULL,
	escuderia		VARCHAR(15)		NOT NULL,
	antiguedad		INT(2) 			NOT NULL,
    mecanico		VARCHAR(25)		NOT NULL,
	PRIMARY KEY (matricula),
    FOREIGN KEY (codpiloto) REFERENCES pilotos(codpiloto),
    FOREIGN KEY (escuderia) REFERENCES escuderias(nombre)
	);
INSERT INTO moto(matricula, codpiloto, escuderia, antiguedad, mecanico)VALUES('115372ETR','5', 'Mercedes', '5', 'Albert');
INSERT INTO moto(matricula, codpiloto, escuderia, antiguedad, mecanico)VALUES('375484WCD','3', 'Red Bull', '8', 'Marc');