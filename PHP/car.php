<?php
require_once 'Account.php';

class car
{
    public $id;
    public $license;
    public $driver;
    public $passenger;

    public function __construct($license, $driver)
    {
        $this->license = $license;
        $this->driver = $driver;
    }

    public function printDataCar()
    {
        echo "
        Licencia: $this->license 
        Driver: {$this->driver->name} 
        Número de pasajeros: $this->passenger
        
    ";
    }

    public function validarpasajeros($passanger)
    {
        if($passanger>=4){
            echo"El numero de pasajeros es correcto";
            $this->passenger=$passanger;
        }else{
            echo"El numero de pasajeros es incorrecto";
        }
    }
}

?>