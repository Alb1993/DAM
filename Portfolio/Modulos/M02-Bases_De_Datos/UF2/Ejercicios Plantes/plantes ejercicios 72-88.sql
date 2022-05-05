use plantes;

/*Ejercicio 72*/ 
/*Muestra la cantidad de plantas que utilizan cada firma comercial de adobo*/
SELECT nom_firma, count(*) nom_plantes
FROM adob ad, dosi_adob da
WHERE da.nom_adob=ad.nom_adob
GROUP BY nom_firma;

/*Ejercicio 73*/ 
/*Muestra el nom popular de les plantas que se les abona tres o mes vegades a l'any.
Mostra també el nombre de vegades que se les abona, ordenats primer per aquest nombre i després pel nom.*/
SELECT nom_popular, count(*) vegades_adob
FROM planta, dosi_adob da
WHERE nom_planta=nom_cientific
GROUP BY nom_popular
HAVING vegades_adob>=3
ORDER BY vegades_adob, nom_popular;

/*Ejercicio 74*/ 
/*Muestra el nombre de las plantas y la cantidad total de abono, ordenado en orden inverso, 
de las plantas que utilizan una cantidad de adobo entre 60 */
SELECT nom_planta, SUM(quantitat_adob) AS total_adob
FROM dosi_adob
GROUP BY nom_planta
HAVING total_adob BETWEEN 60 AND 90
ORDER BY total_adob DESC;

/*Ejercicio 75*/ 
/* Mostra el nom científic de les plantes, ordenats alfabeticament, l'estació de floració*i la quantitat total d'adob
'Casadob' que utilitzen. */
SELECT nom_cientific, floracio, SUM(quantitat_adob) AS total_Casadob
FROM planta, dosi_adob
WHERE nom_planta=nom_cientific AND nom_adob=’Casadob’
GROUP BY nom_cientific
ORDER BY nom_cientific;

/*Ejercicio 76*/ 
/*  Mostra el nom científic, ordenat alfabèticament, l’estació de floració i la quantitat total d’adob de les plantes que utilitzen alguna
vegada a l’any l’adob ‘Casadob’. */
SELECT nom_cientific, floracio, SUM(quantitat_adob) AS total_adob
FROM planta, dosi_adob
WHERE nom_planta=nom_cientific AND nom_planta IN
(SELECT DISTINCT nom_planta
FROM dosi_adob
WHERE nom_adob=’Casadob’)
GROUP BY nom_planta;

/* Exercici 77:
 Mostra el nom popular i el nombre d’exemplars de les plantes
 d’interior que necessiten 17 graus de temperatura i totes les d’exterior. */
SELECT nom_popular, COUNT(*)
FROM planta, planta_interior pi, exemplar_planta ep
WHERE nom_cientific=pi.nom_planta AND nom_cientific=ep.nom_planta AND Temperatura=17
GROUP BY nom_popular
UNION
SELECT nom_popular, COUNT(*)
FROM planta, planta_exterior pe, exemplar_planta ep
WHERE nom_cientific=pe.nom_planta AND nom_cientific=ep.nom_planta
GROUP BY nom_popular;

/* Exercici 78:
Mostra les vegades que hem d’abonar les plantes en cada estació. */
SELECT nom_estacio, COUNT(*)
FROM dosi_adob
GROUP BY nom_estacio;

/* Exercici 79:
 Mostra el nom científic i popular de les plantes, ordenades per nom científic,
 que utilitzen adob ‘Casadob’ i que no l’han utilitzat a Primavera. */
SELECT nom_cientific, nom_popular, nom_adob, nom_estacio
FROM dosi_adob, planta
WHERE nom_planta=nom_cientific AND nom_adob='Casadob'
 AND nom_planta NOT IN
 (SELECT nom_planta FROM dosi_adob WHERE nom_adob='Casadob' AND
nom_estacio='Primavera')
 ORDER BY nom_cientific;
 
/* Exercici 80:
Mostra el nom popular de les plantes d'interior que necessiten Llum directa
i de les plantes d'exterior que són de temporada. */
SELECT nom_popular
FROM planta, planta_interior
WHERE nom_cientific=nom_planta AND ubicacio='Llum directa'
UNION
SELECT nom_popular
FROM planta, planta_exterior
WHERE nom_cientific=nom_planta AND tipus_planta='T';

/* Exercici 81:
 Mostra el nom popular i el nombre d'exemplars que tenim de les plantes que
 han utilitzat alguna vegada adob de Casadob o Sanexplant. */
SELECT nom_popular, COUNT(*) 'nombre plantes'
FROM planta, exemplar_planta ep
WHERE nom_cientific=ep.nom_planta
AND nom_cientific IN (SELECT nom_planta FROM dosi_adob WHERE
nom_adob IN ('Casadob','Sanexplant'))
GROUP BY nom_popular;
/* Exercici 82:
De les plantes que tenim més de 3 exemplars, mostra el nom científic
 i la mitjana d'adob que han utilitzat cadascuna i ordena-les per la mitjana
 d'adob utilitzat de major a menor. */
SELECT nom_planta, AVG(quantitat_adob) 'mitjana adob'
FROM planta, dosi_adob
WHERE nom_cientific=nom_planta AND nom_cientific IN (SELECT nom_planta FROM
exemplar_planta GROUP BY nom_planta HAVING COUNT(*)>3)
GROUP BY nom_planta
ORDER BY AVG(quantitat_adob) DESC;

/* Exercici 83:
 Mostra el nom popular, ordenat alfabèticament, i la quantitat total d’adob
 de les plantes que alguna vegada les hem adobat amb 40 o més unitats d'adob. */
SELECT nom_popular, SUM(quantitat_adob) 'quantitat adob'
FROM planta, dosi_adob
WHERE nom_cientific=nom_planta AND nom_cientific IN (SELECT nom_planta FROM
dosi_adob WHERE quantitat_adob>=40)
GROUP BY nom_popular
ORDER BY nom_popular;

/* Exercici 84:
 Mostra la quantitat total d'adob que utilitza cada planta d'interior */
SELECT nom_cientific, SUM(quantitat_adob) 'total adob'
FROM planta_interior pi, planta pl, dosi_adob da
WHERE pi.nom_planta=nom_cientific AND nom_cientific=da.nom_planta
GROUP BY nom_cientific;

/* Exercici 85:
De les plantes que han utilitzat més de 100 unitats d'adob, mostra
el nom de les plantes i els seus mètodes de reproducció que han utilitzat. */
SELECT nom_planta, metode_reproduccio
FROM reproduccio
WHERE nom_planta IN (SELECT nom_planta FROM dosi_adob GROUP BY nom_planta
HAVING SUM(quantitat_adob)>100);

/* Exercici 86:
Mostra quants exemplars tenim de les plantes que utilitzen el màxim d'adob
(el màxim es refereix al total anual). */
SELECT nom_cientific, COUNT(*)
FROM dosi_adob da, planta pl, exemplar_planta ep
WHERE da.nom_planta=nom_cientific AND nom_cientific=ep.nom_planta
GROUP BY nom_cientific
HAVING SUM(quantitat_adob)=(SELECT SUM(quantitat_adob) FROM dosi_adob
GROUP BY nom_planta ORDER BY SUM(quantitat_adob) DESC LIMIT 1);
/* Exercici 87:
De la planta d'interior que necessita una temperatura mínima, mostra
quants mètodes de reproducció obté amb grau d'èxit 'Alt'. */
SELECT COUNT(*)
FROM planta_interior pi, planta pl, reproduccio re
WHERE pi.nom_planta=nom_cientific AND nom_cientific=re.nom_planta
AND temperatura=(SELECT MIN(temperatura) FROM planta_interior) AND
grau_exit='Alt';

/* Exercici 88:
Mostra els mètodes de reproducció que hem utilitzat més de
3 vegades amb un grau d'èxit 'Mitjà' o 'Alt'. */
SELECT metode_reproduccio 
    FROM reproduccio 
    WHERE grau_exit IN ('Mitjà','Alt') 
    GROUP BY metode_reproduccio 
    HAVING COUNT(*)>3;


