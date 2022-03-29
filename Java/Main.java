package Java;

class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        Car car = new Car("AMQ123", new Account("Andrés Herrera", "AND123"));
        car.passengers = 4;
        car.printDataCar();

        Car car2 = new Car("QWE567", new Account("Andrea Herrera", "AND456"));
        car2.passengers = 3;
        car2.printDataCar();
    }

}
