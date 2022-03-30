package Java;

class Main {

    public static void main(String[] args) {
        UberX uberX = new UberX("AMQ123", new Account("Andrés Herrera", "AND123"), "Chevrolet", "Spark");
        uberX.setPassengers(3);
        uberX.printDataCar();

        // Car car2 = new Car("QWE567", new Account("Andrea Herrera", "AND456"));
        // car2.passengers = 3;
        // car2.printDataCar();
    }

}
