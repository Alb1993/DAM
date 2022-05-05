use plantes;
/* Exercici 50:
Mostra el nom popular i la estació de floració de les plantes 
que utilitzen més de 40 unitats d’adob. */
SELECT DISTINCT nom_popular, floracio 
FROM planta, dosi_adob da
WHERE nom_cientific=da.nom_planta AND quantitat_adob>40;

/*Exercici 51:
Mostra el nom popular de les plantes d’interior que necessiten llum indirecta 
i les plantes d’exterior que són de temporada. */
SELECT DISTINCT nom_popular 
FROM planta, planta_exterior pe, planta_interior pi
WHERE (nom_cientific=pi.nom_planta AND ubicacio='Llum indirecta')
OR (nom_cientific=pe.nom_planta AND tipus_planta='T');

/*Exercici 52:
Mostra el nom científic i l’estació de floració de les plantes
que tenim algun exemplar. */
SELECT DISTINCT nom_cientific, floracio 
FROM planta, exemplar_planta ep
WHERE nom_cientific=ep.nom_planta;

/*Exercici 53:
Mostra l’adob i la firma comercial que el comercialitza de les plantes 
que reben una quantitat d’adob entre 20 i 40 unitats (inclosos).*/
SELECT DISTINCT da.nom_adob, nom_firma 
FROM adob ad, dosi_adob da
WHERE ad.nom_adob=da.nom_adob AND quantitat_adob>=20 AND quantitat_adob<=40;

/*Exercici 54:
Mostra en majúscules el nom popular de les plantes que 
tenim exemplars que utilitzen adobs d’acció immediata.*/
SELECT DISTINCT UPPER(nom_popular) 
FROM planta, exemplar_planta ep, dosi_adob da, adob ad
WHERE ep.nom_planta=nom_cientific AND nom_cientific=da.nom_planta 
AND da.nom_adob=ad.nom_adob AND tipus_adob='AI';

/*Exercici 55:
Mostra el nom popular i la ubicació de les plantes d’interior 
de les que tenim algun exemplar.*/
SELECT DISTINCT nom_popular, ubicacio 
FROM planta, exemplar_planta ep, planta_interior pi
WHERE ep.nom_planta=nom_cientific AND nom_cientific=pi.nom_planta;