package CursoPOOUber.Java;

class Main {
    public static void main(String[] args) {
        System.out.println("Hola weyes");
        UberX uberX = new UberX("AMQ123", new Account("Teterete", "AND123"), "LAMBORGHINI", "TAURUS");
        uberX.setPassenger(4);
        uberX.printDataCar();

        UberVan uberVan = new UberVan("FGH567", new Account("Andres H ", "AND123"));
        uberVan.setPassenger(6);    
        uberVan.printDataCar();    // Car car2 = new Car("$#EWSG4", new Account("Tretet", "AND8676"));
        // car2.passegenger = 3;
        // car2.printDataCar();
    }
}