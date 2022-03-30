package Java;

import java.util.ArrayList;
import java.util.Map;

public class UberVan extends Car {
    Map<String, Map<String, Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;

    /**
    public UberVan(String license, Account driver, Map<String, Map<String, Integer>> typeCarAccepted, ArrayList<String> seatsMaterial) {
        super(license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }
    */

    public UberVan(String license, Account driver) {
        super(license, driver);
    }

    @Override
    public void setPassengers(Integer passengers) {
        if (passengers == 6) {
            this.passengers = passengers;
        } else {
            System.out.println("You need assign 6 passengers");
        }
    }

}
