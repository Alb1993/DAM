<?php

session_start();

if (isset($_SESSION['LAST_ACTIVITY']) && (time() - $_SESSION['LAST_ACTIVITY'] > 300)) {
  session_unset();
  session_destroy();
  header('Location: index.php');
}

$_SESSION['LAST_ACTIVITY'] = time();

$_SESSION['users'] = array(
  'Jose' => '123',
  'Marc' => '456',
  'Albert' => '789',
);

$error_msg = '';

if (isset($_POST['txtusuario']) && isset($_POST['txtpassword'])) {
  $nombre = $_POST['txtusuario'];
  $pass = $_POST['txtpassword'];

  if (strcmp($_SESSION['users'][$nombre], $pass) == 0) {
    $_SESSION['logged'] = true;
    $_SESSION['user_logged'] = $nombre;

    require_once 'formulari.php';
  } else {
    $error_msg = "L'usuari o contrasenya no són vàlids.";
    require_once 'index.php';
  }
} elseif ($_SESSION['logged']) {
  require_once 'formulari.php';
}

?>