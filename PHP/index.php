<?php
require_once('uberX.php');
require_once('car.php');
require_once('uberX.php');
require_once('uberPool.php');

$uberX = new uberX("WUOP-IU", new Account("Andres Herrera", "AND123"), "Chevrolet", "Spark");
$uberX->printDataCar();

//salto de linea
for ($i = 0; $i < 2; $i++) {
    echo "<br>";
}

$uberPool = new uberPool("WUOP-IU", new Account("Andres Herrera", "AND123"), "Chevrolet", "Spark");
$uberPool->printDataCar();
?>