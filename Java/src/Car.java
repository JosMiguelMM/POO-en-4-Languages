public class Car {
    Integer id;
    String license;
    Account driver;
    Integer passenger;

    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;
    }

    //METODO
    void printDataCar(){
        System.out.println("License: "+license+" Driver: "+driver.document);
    }

    void cambiarplaca(String license){
        this.license = license;
    }

}
