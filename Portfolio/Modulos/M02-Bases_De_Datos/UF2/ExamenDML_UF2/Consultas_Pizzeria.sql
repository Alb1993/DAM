use pizzeria;

/* 1.Mostreu el nom de la pizza que porta mes ingredients */
SELECT pr.nom, count(fo.ingredient)	
FROM producte pr, pizza pi, forma fo
WHERE pr.codi=pi.codi AND pi.codi=fo.pizza
GROUP BY pr.nom
HAVING count(fo.ingredient)
ORDER BY count(fo.ingredient) DESC
LIMIT 1;

/* 2. mostreu el nom dels ingredients que no s'utilitzen en cap pizza */
SELECT i.nom /* no sale nada */
FROM ingredient i
WHERE i.codi not in (SELECT i.codi FROM ingredient i, forma fo WHERE i.codi=fo.ingredient);

/* 3. muestra el numero de comandes hechas para cadauna de las poblaciones */
SELECT 
    cli.poblacio, COUNT(co.numero)
FROM
    client cli,
    comanda co
WHERE
    cli.telefon = co.telefon_client
GROUP BY cli.poblacio
HAVING COUNT(co.numero);

/* 4.Mostreu quantes comandes s'han fet que contenien postre */
SELECT count(*) /* Sale 5*/
FROM comanda co, conte con, producte pr, postre pos
WHERE co.numero=con.comanda AND con.producte=pr.codi AND pr.codi=pos.codi;

/* 5.Mostreu el nom i els cognoms dels empleats que han fet menys comandes */
SELECT em.nom, em.cognoms, count(*)
FROM empleat em, comanda co
WHERE em.codi=co.empleat
GROUP BY em.nom, em.cognoms
HAVING count(*)
ORDER BY count(*)
LIMIT 1;
/* 6.Mostreu cuantes comandes s'han fet a domicili i també quantes s'han fet de recollida en local */
SELECT count(*)	/* Muestra 2 */
FROM comanda
WHERE domicili_local="L"
UNION
SELECT count(*) /* Muestra 8 */
FROM comanda
WHERE domicili_local="D";
/* 7.Mostreu la capacitat mitja de les begudes alcoholiques */
SELECT avg(capacitat)	/* Muestra 33.0000 */
FROM beguda
WHERE beguda_alcoholica="S";
/* 8.Mostreu el nom dels client/s que han fet mes comandes */
SELECT cli.nom, count(*)	/* Josep Vila 3, Carme Garcia 2*/
FROM client cli, comanda co
WHERE cli.telefon=co.telefon_client
GROUP BY cli.nom
HAVING count(*)
ORDER BY count(*) DESC
LIMIT 2;
/* 9.Mostreu les comandes on s'hagin demanat mes de 3 pizzes diferents */
SELECT co.numero, count(pi.codi) /* No mmuestra nada*/
FROM comanda co, conte con, producte pr, pizza pi
WHERE co.numero=con.comanda AND con.producte=pr.codi AND pr.codi=pi.codi
GROUP BY co.numero
HAVING count(pi.codi)>3;
/* 10.Mostreu el nom del client/s que han fet comandes a domicili pero no de recollida a local */
SELECT cli.nom, domicili_local
FROM client cli, comanda co
WHERE cli.telefon=co.telefon_client AND domicili_local="D" AND cli.nom NOT IN (SELECT cli.nom
FROM client cli, comanda co
WHERE cli.telefon=co.telefon_client AND domicili_local="L")
GROUP BY cli.nom;
