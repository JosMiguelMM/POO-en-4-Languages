<?php
require_once('uberX.php');
require_once('car.php');
require_once('uberX.php');
require_once('uberPool.php');
require_once ('uberVan.php');


$uberX = new uberX("WUOP-IU", new Account("Andres Herrera", "AND123"), "Chevrolet", "Spark");
$uberX->printDataCar();

espacio();

$uberPool = new uberPool("WUOP-IU", new Account("Andres Herrera  ", "AND123"), "Chevrolet", "Spark");
$uberPool->printDataCar();

espacio();

$uberVan =new UberVan(" rtolp", new Account("Ismael hernandez", "1715252"), "Nissan","Versa");
$uberVan->validarpasajeros(6);
$uberVan->printDataCar();

function espacio(){
    for ($i = 0; $i < 2; $i++) {
        echo "<br>";
    }
}
?>