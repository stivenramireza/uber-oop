<?php
require_once("Car.php");
require_once("UberX.php");
require_once("UberVan.php");
require_once("UberPool.php");
require_once("Account.php");

$uberX = new UberX("CVB123", new Account("Andrés Herrera", "AND456"), "Chevrolet", "Spark");
$uberX->setPassengers(4);
$uberX->printDataCar();

// $uberPool = new UberPool("TYU567", new Account("Andrea Ferran", "ANDA765"), "Chevrolet", "Spark");
// $uberPool->printDataCar();

$uberVan = new UberVan("OJL395", new Account("Raúl Ramírez", "RRM123"), "Nissan", "Versa");
$uberVan->setPassengers(6);
$uberVan->printDataCar();
?>
