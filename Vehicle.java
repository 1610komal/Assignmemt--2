package assign2;


class VehicleST{
    public void start() {
        System.out.println("Vehicle is starting.");
    }
    public void stop() {
        System.out.println("Vehicle is stopping.");
    }
}
class Car extends VehicleST {
    @Override
    public void start() {
        System.out.println("Car is starting.");
    }
    @Override
    public void stop() {
        System.out.println("Car is stopping.");
    }
}
class Bike extends VehicleST {
    @Override
    public void start() {
        System.out.println("Bike is starting.");
    }
    @Override
    public void stop() {
        System.out.println("Bike is stopping.");
    }
}
public class Vehicle {
    public static void main(String[] args) {
        VehicleST myCar = new Car();
        VehicleST myBike = new Bike();
        myCar.start();
        myCar.stop();
        myBike.start();
        myBike.stop();
    }
}
