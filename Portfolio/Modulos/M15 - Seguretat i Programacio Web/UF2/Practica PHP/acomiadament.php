<?php session_start(); ?>

<html>
<!DOCTYPE html>
<html lang="es">
<meta charset="UTF-8">
<title>Acomiadament</title>
<meta name="viewport" content="width=device-width,initial-scale=1">
<body>
    <header>
        <?php echo '<p>Fins a un altre ' .  $_SESSION['user_logged'] . '.</p>';?>
        <form method="post" action="index.php">
            <button type="submit" name="sortir">Sortir</button>
        </form>
    </header>
</body>
</html>

<?php
    $_SESSION['logged'] = false;
    session_unset();
    session_destroy();
?>