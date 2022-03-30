<?php
require_once("Car.php");

class UberVan extends Car {
    public $typeCarAccepted;
    public $seatsMaterial;

    public function __construct($license, $driver, $typeCarAccepted, $seatsMaterial) {
        parent::__construct($license, $driver);
        $this->typeCarAcepcted = $typeCarAccepted;
        $this->seatsMaterial = $seatsMaterial;
    }

    public function setPassengers($passengers) {
        if ($passengers == 6) {
            $this->passengers = $passengers;
        } else {
            echo "You need assign 6 passengers";
        }
    }
    
}
?>
