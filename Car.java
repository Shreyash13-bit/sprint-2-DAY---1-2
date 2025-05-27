interface Vehicle {
    default void start() {
        System.out.println("Vehicle is starting");
    }
}
public class Car implements Vehicle {
    @Override
    public void start() {
        Vehicle.super.start();
        System.out.println("Car is ready to drive");
    }
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
    }
}
