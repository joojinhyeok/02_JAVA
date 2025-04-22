package main.java.sec10.exam02;

public class CastingExample {
    public static void main(String[] args) {
        Vehicle vehicle = new Bus();

        vehicle.run();
        if(vehicle instanceof Bus){
            ((Bus) vehicle).checkFare();
        }

        Bus bus = new Bus();
        bus.run();
        bus.checkFare();
    }
}
