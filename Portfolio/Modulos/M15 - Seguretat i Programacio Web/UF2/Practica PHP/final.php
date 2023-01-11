<?php

session_start();

if (isset($_SESSION['LAST_ACTIVITY']) && (time() - $_SESSION['LAST_ACTIVITY'] > 300)) {
   session_unset();
   session_destroy();
   header('Location: index.php');
}

$_SESSION['LAST_ACTIVITY'] = time();

$nombre = $_SESSION['user_logged'];
$email = $_POST['email'];
$data = $_POST['data'];

?>

<!DOCTYPE html>
<html lang="en">
<meta charset="UTF-8">
<title>Final</title>
<meta name="viewport" content="width=device-width,initial-scale=1">
<body>
   <div class="">
      <?php echo '<p><b>Nombre: </b>' . $nombre . '</p>'; ?>
      <?php echo '<p><b>Email: </b>' .  $email . '</p>'; ?>
      <?php echo '<p><b>Data: </b>' .  $data . '</p>'; ?>
   </div>

   <p><b>Deporte Escogido:</b></p>
   
   <ul>
   <?php
      if (isset($_POST['deportes']) && is_array($_POST['deportes'])) {
         foreach($_POST['deportes'] as $deportes) {
            echo "<li>{$deportes}</li>";
         }
      }
   ?>
   </ul>

   <p><b>Valoracion de la enquesta:</b> <?php echo $_POST['valoracion']; ?></p>

   <p><b>Asignaturas:</b></p>

   <ul>
   <?php
      if (isset($_POST['Asignaturas']) && is_array($_POST['Asignaturas'])) {
         foreach($_POST['Asignaturas'] as $asignatura) {
            echo "<li>{$asignatura}</li>";
         }
      }
   ?>
   </ul>
</div>

</body>
</html>
