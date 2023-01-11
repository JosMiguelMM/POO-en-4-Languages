public class Car {
    Integer id;
    String license;
    Account driver;
    private Integer passenger;

    public Car(String license, Account driver) {
        this.license = license;
        this.driver = driver;
        this.passenger = 3;
    }

    //METODO
     void printDataCar() {
        System.out.println("License: " + license + " Driver: " + driver.document + " Pasajeros:  " + passenger);

    }

    void cambiarplaca(String license) {
        this.license = license;
    }

    void cmabiopa(Integer passenger) {
        if (passenger<=4){
            System.out.println("El numero de pasajeros es correcto");
            this.passenger=passenger;
        }else if(passenger>3){
            System.out.println("El numero de pasajeros es incorrecto");
        }
    }

    public Integer getPassenger() {
        return passenger;
    }

}
