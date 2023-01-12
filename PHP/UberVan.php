<?php
require_once('car.php');

class UberVan extends Car
{
    public $typeCarAccepted;
    public $seatsMaterial;
    public $passenger;

    public function __construct($license, $driver, $typeCarAccepted, $seatsMaterial)
    {
        parent::__construct($license, $driver);
        $this->typeCarAccepted = $typeCarAccepted;
        $this->seatsMaterial = $seatsMaterial;
        $this->passenger = 6;
    }

    public function validarpasajeros($passanger)
    {
        if ($passanger <= 6) {
            echo "El numero de pasajeros es correcto";
            $this->passenger = $passanger;
        } else {
            echo "El numero de pasajeros es incorrecto";
        }
    }

}

?>