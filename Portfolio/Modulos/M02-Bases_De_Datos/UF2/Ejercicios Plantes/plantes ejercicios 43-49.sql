use plantes;

/* Exercici 43:
Mostra el nom popular de les plantes que tenim algun exemplar que floreixi a
l’estiu.*/
SELECT DISTINCT nom_popular 
FROM planta, exemplar_planta
WHERE nom_cientific=nom_planta AND floracio=’Estiu’;

/* Exercici 44:
 Mostra el nom científic i el tipus de planta de les que són d’exterior que
floreixen a la primavera. */
SELECT nom_cientific, tipus_planta 
FROM planta, planta_exterior
WHERE nom_cientific=nom_planta AND floracio=’Primavera’;

/* Exercici 45:
 Mostra el nom científic de les plantes d’exterior que utilitzen adobs de la firma
comercial CIRSADOB. 
 Mostra també l’adob que utilitzen. */
SELECT nom_cientific, ad.nom_adob 
FROM planta_exterior pe, planta, dosi_adob da, adob ad
WHERE nom_cientific =pe.nom_planta AND nom_cientific=da.nom_planta AND
da.nom_adob=ad.nom_adob AND nom_firma=’CIRSADOB’;

/* Exercici 46:
Mostra els mètodes de reproducció de les plantes que tenim exemplars. */
SELECT DISTINCT metode_reproduccio 
FROM reproduccio re, planta, exemplar_planta ep
WHERE re.nom_planta=nom_cientific AND nom_cientific=ep.nom_planta;

/* Exercici 47:
 De les plantes que utilitzen adobs de la firma UOCADOB, mostra el nom popular 
 i entre parèntesi la quantitat d’adob utilitzat (el resultat l'ha de mostrar en
un sol camp). */
SELECT CONCAT(nom_popular,' (',quantitat_adob,')') 
FROM adob ad, dosi_adob da, planta
WHERE da.nom_adob= ad.nom_adob AND da.nom_planta=nom_cientific AND
nom_firma=’UOCADOB’;

/* Exercici 48:
 Mostra el nom popular i les mètodes de reproducció de les plantes que tenen la
floració al hivern. */
SELECT nom_popular, metode_reproduccio 
FROM planta, reproduccio re
WHERE re.nom_planta=nom_cientific AND floracio=’Hivern’;

/* Exercici 49:
 Mostra el nom científic i les cinc primeres lletres del nom popular 
 de les plantes d’exterior que utilitzen el mètode de reproducció esqueix
 i les plantes d’interior que la seva reproducció té un grau d’èxit baix. */
SELECT DISTINCT nom_cientific, LEFT(nom_popular,5) 
FROM planta, planta_exterior pe, planta_interior pi, reproduccio re
WHERE (pe.nom_planta=nom_cientific AND nom_cientific=re.nom_planta AND
metode_reproduccio=’Esqueix’) OR
(pi.nom_planta=nom_cientific AND nom_cientific=re.nom_planta AND
grau_exit=’Baix’);
