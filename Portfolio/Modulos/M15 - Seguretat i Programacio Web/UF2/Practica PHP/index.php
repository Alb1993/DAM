<?php

session_start();

if (isset($_SESSION['LAST_ACTIVITY']) && (time() - $_SESSION['LAST_ACTIVITY'] > 300)) {
    session_unset();
    session_destroy();
    header('Location: index.php');
}

$_SESSION['LAST_ACTIVITY'] = time();

if ($_SESSION['logged']) {
    require_once 'formulari.php';
} else {
    $_SESSION['logged'] = false;
?>
<html>
<!DOCTYPE html>
<html lang="es">
<meta charset="UTF-8">
<title>Login</title>
<meta name="viewport" content="width=device-width,initial-scale=1">
<style>
    table {
        border: 2px solid #353A46;
        background-color: #3ABAF1;
        text-align: center;
    }

    input[type=text], input[type=password] {
        width: 100%;
        padding: 8px 20px;
    }

    p {
        text-align: center;
    }
</style>
<body>
<p style="color:red;"><?php echo $error_msg; ?></p>

<center>
    <form method="post" action="login.php">
        <table>
            <tr><td colspan="2"><label><b>Login</b></label></td></tr>
            <tr><td><label>Usuario</label></td></tr>
            <tr><td><input type="text" name="txtusuario" required/></td></tr>
            <tr><td><label>Password</label></td></tr>
            <tr><td><input type="password" name="txtpassword" required/></td></tr>
            <tr><td><input type="submit" value="Ingresar"/></td></tr>
        </table>
    </form>
</center>
</body>
</html>

<?php
}
?>