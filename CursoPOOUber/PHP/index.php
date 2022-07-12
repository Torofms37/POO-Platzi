<?php
require_once("car.php");
require_once("uberX.php");
require_once("uberPool.php");
require_once("account.php");

$uberX = new UberX("CVB123", new Account("Andres Herrera ", "AND456"), "Chevrolet", "Spark");
$uberX->printDataCar();

$uberX = new UberX("OJL395", new Account("Raúl Ramírez", "AND456"), "Nissan", "Versa");
$uberX->setPassenger(6);
$uberX->printDataCar();
?>