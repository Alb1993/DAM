for $atraccio in db:open("parc", "parc.xml")/parc/atraccions/zona/atraccio
where $atraccio/servei/text() = "PassPreferent"
return insert node <vip>1</vip> into $atraccio
