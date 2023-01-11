<?php

session_start();

if (isset($_SESSION['LAST_ACTIVITY']) && (time() - $_SESSION['LAST_ACTIVITY'] > 300)) {
   session_unset();
   session_destroy();
   header('Location: index.php');
}

$_SESSION['LAST_ACTIVITY'] = time();

function verificarCorreu($email) {
   if (filter_var($email, FILTER_VALIDATE_EMAIL)) {
      return true;
   } else {
      $_POST['email'] = '';
      return false;
   }
}

if (!$_SESSION['user_logged']) {
   require_once "index.php";
} elseif (!isset($_POST['enviar']) || !verificarCorreu($_POST['email'])) { ?>

<html>
<!DOCTYPE html>
<html lang="es">
<meta charset="UTF-8">
<title>Formulari</title>
<meta name="viewport" content="width=device-width,initial-scale=1">
<body>
   <header>
      <form method="post" action="acomiadament.php">
         <?php echo '<b>Usuario:</b> ' . $_SESSION['user_logged']; ?>
         <button type="submit" name="logout">Tancar Sessió</button>
      </form>
   </header>
   
   <p style="color:red;"><?php echo (isset($_POST['email']))? "L'adreça no és correcta." : ''; ?></p>
   
   <form method="post" action="formulari.php">
      <label for = "email"><b>Email:</b></label>
      <input type = "text" name = "email" value="<?php echo $_POST['email']; ?>">
      
      <br><br>
      
      <label for = "data"><b>Data:</b></label>
      <input type="date" name="data" value="<?php echo $_POST['data'] ?>" required/>
      
      <br><br>
      
      <fieldset style="width:200px">
         <legend><b>Cual es tu deporte favorito:</b></legend>
         
         <input type="checkbox" id="Futbol" name="deportes[]" value="Futbol" <?php echo (in_array("Futbol", $_POST["deportes"]))? "checked" : "" ?>/>
         <label for = "Futbol">Futbol</label><br>
         
         <input type="checkbox" id="Baloncesto" name="deportes[]" value="Baloncesto" <?php echo (in_array("Baloncesto", $_POST["deportes"]))? "checked" : "" ?>/>
         <label for = "Baloncesto">Baloncesto</label><br>
         
         <input type="checkbox" id="Tenis" name="deportes[]" value="Tenis" <?php echo (in_array("Tenis", $_POST["deportes"]))? "checked" : "" ?>/>
         <label for = "Tenis">Tenis</label><br>
         
         <input type="checkbox" id="Ciclismo" name="deportes[]" value="Ciclismo" <?php echo (in_array("Ciclismo", $_POST["deportes"]))? "checked" : "" ?>/>
         <label for = "Ciclismo">Ciclismo</label><br>
         
         <input type="checkbox" id="Balonmano" name="deportes[]" value="Balonmano" <?php echo (in_array("Balonmano", $_POST["deportes"]))? "checked" : "" ?>/>
         <label for = "Balonmano">Balonmano</label>
      </fieldset>
      
      <p><b>Valoración del formulario:</b></p>
      
      <fieldset style="width:125px">
         <label><input type="radio" name="valoracion" value = "1" <?php echo ($_POST["valoracion"] == "1")? "checked" : "" ?>/>
         <label><input type="radio" name="valoracion" value = "2" <?php echo ($_POST["valoracion"] == "2")? "checked" : "" ?>/>
         <label><input type="radio" name="valoracion" value = "3" <?php echo ($_POST["valoracion"] == "3")? "checked" : "" ?>/>
         <label><input type="radio" name="valoracion" value = "4" <?php echo ($_POST["valoracion"] == "4")? "checked" : "" ?>/>
         <label><input type="radio" name="valoracion" value = "5" <?php echo ($_POST["valoracion"] == "5")? "checked" : "" ?>/>
      </fieldset>
      
      <p><b>Asignaturas:</b></p>
      
      <select multiple name="Asignaturas[]">
         <option value="Sistemas Operativos" <?php echo (in_array("Sistemas Operativos", $_POST["Asignaturas"]))? "selected" : ""; ?>>Sistemas Operativos</option>
         <option value="Programacion" <?php echo (in_array("Programacion", $_POST["Asignaturas"]))? "selected" : ""; ?>>Programacion</option>
         <option value="Bases de datos" <?php echo (in_array("Bases de datos", $_POST["Asignaturas"]))? "selected" : ""; ?>>Bases de datos</option>
         <option value="Lenguaje de Marcas" <?php echo (in_array("Lenguaje de Marcas", $_POST["Asignaturas"]))? "selected" : ""; ?>>Lenguaje de Marcas</option>
      </select>
      
      <br><br>
      
      <button type="submit" name="enviar">Enviar Dades</button>
   </form>
</body>
</html>

<?php

} else {
   require_once "final.php";
}

?>