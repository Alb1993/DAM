use plantes;

/* Exercici 56:
Mostra el nom popular, l’adob i la quantitat d’aquest més 10 unitats,
de les plantes que utilitzen un adob de la firma PRISADOB
o que la quantitat és menor o igual a 30 unitats.*/
SELECT DISTINCT nom_popular, ad.nom_adob, quantitat_adob+10 
FROM planta, dosi_adob da, adob ad
WHERE nom_cientific=da.nom_planta AND da.nom_adob=ad.nom_adob AND 
(ad.nom_firma='PRISADOB' OR quantitat_adob<=30);

/*Exercici 57:
Mostra el nom popular de les plantes que utilitzen un adob
d'acció immediata i que floreixen a la primavera. */
SELECT DISTINCT nom_popular 
FROM planta, dosi_adob da, adob ad
WHERE nom_cientific=da.nom_planta AND da.nom_adob=ad.nom_adob AND 
floracio=’Primavera’ AND tipus_adob=’AI’;

/*Exercici 58:
Mostra el nom científic i el mètode de reproducció de les 
plantes que no utilitzen l’adob Casadob.*/
SELECT DISTINCT nom_cientific, metode_reproduccio 
FROM planta, dosi_adob da, reproduccio re
WHERE nom_cientific=re.nom_planta AND da.nom_planta=nom_cientific AND 
nom_adob<>’Casadob’;

/*Exercici 59:
Mostra les estacions de floració de les quals tenim algun exemplar de planta.*/
SELECT DISTINCT floracio 
FROM planta, exemplar_planta ep
WHERE nom_cientific=ep.nom_planta AND floracio<>’NULL’;

/*Exercici 60:
Mostra el nom popular, el mètode de reproducció i la primera lletra 
del grau d’èxit de les plantes que no tenen un grau d’èxit alt. */
SELECT nom_popular, metode_reproduccio, LEFT(grau_exit,1)
FROM planta, reproduccio
WHERE nom_cientific= nom_planta AND grau_exit<>'Alt';

/*Exercici 61:
Mostra el nom de les plantes que se’ls hi ha afegit adob 
en la mateixa estació que la seva floració.*/
SELECT DISTINCT nom_cientific
FROM planta, dosi_adob
WHERE nom_cientific= nom_planta AND nom_estacio=floracio;

/*Exercici 62:
Mostra en minúscules el nom científic de les plantes d’exterior 
que utilitzen adobs de la firma CIRSADOB i les plantes 
d’interior que utilitzen el mètode de reproducció per capficats. */
SELECT DISTINCT LOWER(nom_cientific)
FROM planta, planta_interior pi, planta_exterior pe, adob ad, dosi_adob da, 
reproduccio re
WHERE (nom_cientific= pe.nom_planta AND nom_cientific=da.nom_planta AND
da.nom_adob=ad.nom_adob AND nom_firma='CIRSADOB') OR
(nom_cientific=pi.nom_planta AND nom_cientific=re.nom_planta AND 
metode_reproduccio='Capficats');