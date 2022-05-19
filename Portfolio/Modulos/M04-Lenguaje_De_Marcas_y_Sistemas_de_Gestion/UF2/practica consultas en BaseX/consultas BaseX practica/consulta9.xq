for $menuEspecial in db:open("parc", "parc.xml")/parc/restaurants/zona/restaurant/menuEspecial
where $menuEspecial/text() = "Infantil"

return rename node $menuEspecial as "petitMenu"