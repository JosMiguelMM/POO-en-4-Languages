public class UberX extends Car{
    String brand;
    String model;
    private Integer passenger;

    public UberX(String license, Account driver, String brand, String model) {
        super(license, driver);
        this.brand = brand;
        this.model = model;
    }

    public void validarpasajeros(Integer passenger)
    {
        if(passenger>=4){
            System.out.println("El numero de pasajeros es correcto");
        }else{
            System.out.println("El numero de pasajeros es incorrecto");
        }
    }
    @Override
    void printDataCar() {
        System.out.println("License: " + license + " Driver: " + driver.document + " Nombre: " + driver.name + " Pasajeros:  " + passenger+" Marca: " + brand + " Modelo: " + model);
    }
}
