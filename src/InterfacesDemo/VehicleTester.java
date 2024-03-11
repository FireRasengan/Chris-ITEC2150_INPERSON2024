package InterfacesDemo;

public class VehicleTester {
    public static void main(String[] args) {
        Vehicle c1 = new Car();
        Vehicle b1 = new Bike();

        //Vehicle v1 = new Vehicle();

        c1.start();
        c1.forward();

        b1.stop();
        b1.turnToRight();
    }
}
