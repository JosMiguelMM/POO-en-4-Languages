<?php
require_once 'car.php';

class uberX extends car{
    public $brand;
    public $model;
    public $passenger;

    public function __construct($license, $driver, $brand, $model){
        parent::__construct($license, $driver);
        $this->brand = $brand;
        $this->model = $model;
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
    public function printDataCar()
    {
        echo "
        Licencia: $this->license 
        Driver: {$this->driver->name} 
        Número de pasajeros: $this->passenger
        Marca: $this->brand
        Modelo: $this->model";
    }


}

?>