package Java;

class Car {
    Integer id;
    String license;
    Account driver;
    private Integer passengers;

    public Car(String license, Account driver) {
        this.license = license;
        this.driver = driver;
    }

    void printDataCar() {
        if (passengers != null) {
            System.out.println("License: " + license + " - " + "Driver: " + driver.name  + " - " + "Passengers: " + passengers);
        }   
    }

    public Integer getPassengers() {
        return this.passengers;
    }

    public void setPassengers(Integer passengers) {
        if (passengers == 4) {
            this.passengers = passengers;
        } else {
            System.out.println("You need assign 4 passengers");
        }
    }
    
}
