for $espectacle in db:open("parc", "parc.xml")/parc/espectacles/zona/espectacle
where $espectacle/tipus/text()="Passatge del terror"
return insert node <preu>5</preu> before $espectacle/tipus
