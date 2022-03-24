use hospital;
/* Consulta 1 */

SELECT a.nomArea, count(m.codMetge), count(i.codInf)
FROM metge m, infermer i, area a
WHERE a.numArea=m.numArea AND i.numArea=a.numArea
GROUP BY a.nomArea;

/* Consulta 2 */
SELECT v.diagnostic
FROM visita v
WHERE MONTH(v.data)=03;

/* Consulta 3 */

/* Consulta 4 */
SELECT a.nomArea
FROM area a, metge me
WHERE a.numArea=me.numArea AND me.sou<(SELECT AVG (me.sou) FROM metge me);

/* Consulta 5 */
SELECT MAX(numLlit)-MIN(numLLit) AS diferencia
FROM llit;

/* Consulta 6 */
SELECT numLlit
FROM llit
WHERE numLlit not in (SELECT numL from pacient);

/* Consulta 7 */
SELECT p.nom, p.cognoms
FROM pacient p, visita v
WHERE p.dni=v.dniPac
UNION 
SELECT p.nom, p.cognoms
FROM pacient p, realitzacio r
WHERE p.dni=r.dniPac
GROUP BY p.nom, p.cognoms
HAVING count(dniPac) > 1 OR count(codProv) > 1 ;