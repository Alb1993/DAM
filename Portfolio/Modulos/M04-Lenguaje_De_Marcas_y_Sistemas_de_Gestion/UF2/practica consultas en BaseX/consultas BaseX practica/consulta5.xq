for $botiga in doc("parc.xml")/parc/botigues/zona/botiga
  let $nombotiga1 := $botiga/@nom
  let $producte1 := $botiga/producte
    for $botiga in doc("parc.xml")/parc/botigues/zona/botiga
      let $nombotiga2 := $botiga/@nom
      let $producte2 := $botiga/producte
        where $producte1 = $producte2 and $nombotiga1 != $nombotiga2
return concat($nombotiga1," ven el mateix producte que ",$nombotiga2," y el producte es ", $producte1)