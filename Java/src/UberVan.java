import java.util.ArrayList;
import java.util.Map;

public class UberVan extends Car {
    String typeCarAccepted;
    String seatsMaterial; //MATERIAL DE LOS ASIENTOS

    Integer passenger;
    public UberVan(String license, Account driver, String typeCarAccepted, String seatsMaterial) {
        super(license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }

    @Override
    public void cmabiopa(Integer passenger) {
        if (passenger<=6){
            System.out.println("El numero de pasajeros es correcto");
            this.passenger=passenger;
        }else if(passenger>7){
            System.out.println("El numero de pasajeros es incorrecto");
        }
    }
}
