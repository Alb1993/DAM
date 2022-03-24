use motogp;
/* EXAMEN A PARTE DML */
/* 1.Mostra quins pilots no han abandonat mai en cap cursa. */
SELECT DISTINCT pi.nombre
FROM pilotos pi, resultados re
WHERE pi.codigo=re.codpiloto AND re.distanciaganador not like "Abandono"; 
/* 2.Mostra quin pilots, i en quina cursa, han quedat en última posició (tenint en compte els abandonaments).*/
SELECT pi.codigo, pi.nombre, ca.nombregp, ca.año
FROM pilotos pi, resultados re, carreras ca
WHERE pi.codigo=re.codpiloto AND re.anyo=ca.año AND re.nombregp=ca.nombregp /* Igualacion de tablas */
AND re.distanciaganador="Abandono" /* Declaracion de Abandono */
OR re.puesto=(SELECT max(re.puesto) FROM resultados re, carreras ca WHERE re.anyo=ca.año AND re.nombregp=ca.nombregp) /* Declaracion de ultimo puesto */
GROUP BY ca.nombregp, ca.año; /* Agrupamos para que solo salga 1 */
/* 3.Mostra el dissenyador, en el cas de què es sàpiga, del circuit amb menor longitud.*/
SELECT disenyador
FROM circuitos
ORDER BY longitud
LIMIT 1;

/* 4. Mostra el nom dels pilots i la seva escuderia d'aquells que han quedat primers més d'un cop. */
SELECT p.nombre, p.nombreescuderia, count(*)
FROM pilotos p, resultados r
WHERE p.codigo=r.codpiloto AND r.puesto=1 /* Usamos el WHERE para filtrar */
GROUP BY p.nombre /* El GROUP BY lo usaremos para agrupar i le pondremos las columnas que queremos que no se repitan */
HAVING count(*)>1; /* En el HAVING pondremos una condicion aplicada a la agrupacion */

/* 5.Mostra el nom dels pilots, menors de 30 anys, que no han guanyat cap cursa (posició 1a) en el 2011.*/
SELECT pi.nombre
FROM pilotos pi
WHERE (year(now())-year(fechanacimiento))<"30" AND pi.nombre NOT IN
(SELECT pi.nombre
FROM pilotos pi, resultados re
WHERE pi.codigo=re.codpiloto AND re.anyo="2011" and re.puesto="1");
/* 6.Mostra els circuits en els quals no ha guanyat cap pilot alemany. */
SELECT distinct ci.nombre
FROM circuitos ci
WHERE ci.nombre NOT IN /* En el NOT IN hay que poner los pilotos alemanes que han ganado */
(SELECT ci.nombre
FROM circuitos ci, carreras ca, resultados re, pilotos pi
WHERE ci.nombre=ca.nombrecircuito AND ca.nombregp=re.nombregp AND ca.año=re.anyo AND re.codpiloto=pi.codigo AND pi.nacionalidad="Alemana" AND re.puesto="1");
/* 7.Mostra per a cadascun dels pilots, el seu codi i quants cops ha quedat tercers al 2010 (ordenats del nombre de vegades de major a menor).*/
SELECT distinct pi.nombre, pi.codigo, count(re.puesto)
FROM resultados re, pilotos pi 
WHERE re.codpiloto=pi.codigo AND re.puesto=3 AND re.anyo=2010
GROUP BY pi.nombre
ORDER BY count(re.puesto) DESC;

/* EXAMEN A PARTE DDL */
/* 1.Digues quines són les instruccions necessàries per afegir als insert de "resultados" a la columna "distanciaganador"
00:00.00 als que han quedat en 1a posició. */
UPDATE resultados SET distanciaganador="00:00:00" WHERE puesto='1';
/* 2.Digues les instruccions necessàries per introduir les tres primeres posicions als resultats del GP Àfrica celebrat al 2012. */
UPDATE resultados SET puesto='1' WHERE nombregp='GP de Africa' AND anyo='2012';
UPDATE resultados SET puesto='2' WHERE nombregp='GP de Africa' AND anyo='2012';
UPDATE resultados SET puesto='3' WHERE nombregp='GP de Africa' AND anyo='2012';
/* 3.Afegeix la columna puntuació a la taula resultados on es podran emmagatzemar números enters positius. */
ALTER TABLE resultados ADD puntuacio INT(20);

