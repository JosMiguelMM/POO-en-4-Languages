public class UberBlack extends Car{
    String brand;
    String model;

    public UberBlack(String license, Account driver, String brand, String model) {
        super(license, driver);
        this.brand = brand;
        this.model = model;
    }
}
