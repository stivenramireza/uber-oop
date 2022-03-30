package Java;

class Car {
    private Integer id;
    private String license;
    private Account driver;
    protected Integer passengers;

    public Car(String license, Account driver) {
        this.license = license;
        this.driver = driver;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLicense() {
        return this.license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Account getDriver() {
        return this.driver;
    }

    public void setDriver(Account driver) {
        this.driver = driver;
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

    void printDataCar() {
        if (passengers != null) {
            System.out.println("License: " + license + " - " + "Driver: " + driver.name  + " - " + "Passengers: " + passengers);
        }   
    }
    
}
