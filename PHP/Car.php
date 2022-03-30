<?php
require_once("Account.php");

class Car {
    public $id;
    public $license;
    public $driver;
    protected $passengers;

    public function __construct($license, $driver) {
        $this->license = $license;
        $this->driver = $driver;
    }

    public function getPassengers() {
        return $this->passengers;
    }

    public function setPassengers($passengers) {
        if ($passengers == 4) {
            $this->passengers = $passengers;
        } else {
            echo "You need assign 4 passengers";
        }
    }

    public function printDataCar() {
        echo "
            License: $this->license
            Driver: {$this->driver->name}
            Passengers: $this->passengers
        
        ";
    }
    
}
?>
