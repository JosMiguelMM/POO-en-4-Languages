public class Main {
    public static void main(String[] args) {

        UberX uberX=new UberX("AMQ123", new Account("Andres Herrera", "AND123"), "Chevrolet", "Spark");
        uberX.cmabiopa(5);
        uberX.printDataCar();

        System.out.println(" ");

        UberVan uberVan=new UberVan("FGH345", new Account("Andrea Herrera", "ANDA765"), "Chevrolet", "Sonic");
        uberVan.cmabiopa(6);
        uberVan.printDataCar();

    }
}