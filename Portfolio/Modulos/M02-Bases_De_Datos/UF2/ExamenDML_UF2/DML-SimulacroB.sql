use motogp;
/* 1. Mostra quins pilots no han pujat mai al podium (1a, 2a, i 3a posició) */
SELECT distinct pi.nombre
FROM pilotos pi, resultados re
WHERE pi.codigo=re.codpiloto AND re.puesto not like 1 AND re.puesto not like 2 AND re.puesto not like 3;

/* 2.Mostra quin pilots, i en quina cursa, han quedat en última posició (tenint en compte els abandonaments).*/
SELECT pi.codigo, pi.nombre, ca.nombregp, ca.año
FROM pilotos pi, resultados re, carreras ca
WHERE pi.codigo=re.codpiloto AND re.anyo=ca.año AND re.nombregp=ca.nombregp /* Igualacion de tablas */
AND re.puesto=(SELECT max(re.puesto) FROM resultados re, carreras ca WHERE re.anyo=ca.año AND re.nombregp=ca.nombregp) /*Declaracion del ultimo puesto*/
AND pi.codigo NOT IN (SELECT pi.codigo FROM pilotos pi, resultados re WHERE re.distanciaganador="Abandono" AND pi.codigo=re.codpiloto); /*Diferenciar de abadono*/

/* 3.Mostra el dissenyador, en el cas de què es sàpiga, del circuit amb menor longitud.*/
SELECT disenyador
FROM circuitos
ORDER BY longitud DESC
LIMIT 1;
/* 4. Mostra el nom dels pilots i la seva escuderia d'aquells que han quedat primers més d'un cop. */
SELECT pi.nombre, es.nombre
FROM pilotos pi, escuderias es, resultados re
WHERE pi.nombreescuderia=es.nombre AND pi.codigo=re.codpiloto
GROUP BY pi.nombre
HAVING count(puesto="1")>1;

/* 5.Mostra el nom dels pilots, majors de 30 anys, que no han guanyat cap cursa (posició 1a) en el 2011.*/
SELECT pi.nombre
FROM pilotos pi
WHERE (year(now())-year(fechanacimiento))>"30" AND pi.nombre NOT IN
(SELECT pi.nombre
FROM pilotos pi, resultados re
WHERE pi.codigo=re.codpiloto AND re.anyo="2011" and re.puesto="1");
/* 6.Mostra els circuits en els quals no ha guanyat cap pilot espanyol. */
SELECT distinct ci.nombre
FROM circuitos ci
WHERE ci.nombre NOT IN
(SELECT ci.nombre
FROM circuitos ci, carreras ca, resultados re, pilotos pi
WHERE ci.nombre=ca.nombrecircuito AND ca.nombregp=re.nombregp AND ca.año=re.anyo AND re.codpiloto=pi.codigo AND pi.nacionalidad="Español" AND re.puesto="1");
/* 7.Mostra per a cadascun dels pilots, el seu codi i quants cops ha quedat tercers al 2010 (ordenats del nombre de vegades de major a menor).*/
SELECT distinct pi.codigo, pi.nombre, count(re.puesto)
FROM resultados re, pilotos pi 
WHERE re.codpiloto=pi.codigo AND re.puesto= 3 AND re.anyo = 2010
GROUP BY pi.nombre
ORDER BY count(re.puesto) DESC;