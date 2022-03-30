<?php
require_once("Car.php");
require_once("UberX.php");
require_once("UberPool.php");
require_once("Account.php");

$uberX = new UberX("CVB123", new Account("Andrés Herrera", "AND456"), "Chevrolet", "Spark");
$uberX->printDataCar();

$uberPool = new UberPool("TYU567", new Account("Andrea Ferran", "ANDA765"), "Chevrolet", "Spark");
$uberPool->printDataCar();
?>
