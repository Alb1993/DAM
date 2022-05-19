for $atraccio in doc("parc.xml")/parc/atraccions/zona/atraccio 
  where $atraccio/intensitat = "Forta" and $atraccio/edatMinima/@adult = "no" and $atraccio/	edatMinima > 12
return $atraccio/@nom