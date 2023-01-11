import java.util.ArrayList;
import java.util.Map;

public class UberVan extends Car {
    Map<String, ArrayList<String>> typeCarAccepted;
    ArrayList<String> seatsMaterial; //MATERIAL DE LOS ASIENTOS

    public UberVan(String license, Account driver, Map<String, ArrayList<String>> typeCarAccepted, ArrayList<String> seatsMaterial) {
        super(license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }
}
