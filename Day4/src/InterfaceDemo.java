interface Engine{
    void startEngine();
}

interface Transmission{
    void changeGear(int gear);
}
interface vehicle{
    void accelerate();
    void brake();
}
class Car implements Engine,Transmission,vehicle{
    private int gear;

    @Override
    public void startEngine() {
        System.out.println("Engine is started..");
    }
    @Override
    public void changeGear(int gear) {
        this.gear = gear;
        System.out.println("Changed gear to " + gear);
    }
    @Override
    public void accelerate() {
        System.out.println("car is Accelerating in gear: " + gear);
    }
    @Override
    public void brake() {
        System.out.println("car is slowing down..");
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
        Car car = new Car();
        car.startEngine();
        car.changeGear(3);
        car.accelerate();
        car.brake();
    }
}