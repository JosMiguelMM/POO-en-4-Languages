<?php
require_once 'Account.php';
require_once 'car.php';
require_once 'Payment.php';
require_once 'Route.php';

$car = new car("AMQ123", new Account("Andres Herrera", "AND123"));
$car->printDataCar();
?>