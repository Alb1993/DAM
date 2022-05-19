for $restaurant in doc("parc.xml")/parc/restaurants/zona/restaurant
  for $botiga in doc("parc.xml")/parc/botigues/zona/botiga
  where $restaurant/../@nom = $botiga/../@nom
return concat($restaurant/../@nom, " esta en la mateixa zona que ",$botiga/../@nom)