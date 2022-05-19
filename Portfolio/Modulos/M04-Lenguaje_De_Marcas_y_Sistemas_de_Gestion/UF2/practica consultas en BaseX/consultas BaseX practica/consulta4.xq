for $espectacles in doc("parc.xml")/parc/espectacles
  let $num_passi := count($espectacles/zona/espectacle/horari/passi/horaInici = "12:30")
return concat("Total passis que començin a les 12:30: ", count($num_passi))