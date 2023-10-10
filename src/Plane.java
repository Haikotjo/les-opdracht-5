public class Plane extends Vehicle implements Driveable, Flyable{

    public Plane(int speed, float weight) {
        super(speed, weight);
    }

    @Override
    public void accelerate() {
        System.out.println("from 0 to 50 in 10 seconds");
    }

    @Override
    public void brake() {
        System.out.println("Stop! Break now!");
    }

    @Override
    public void changeGear() {
        System.out.println("Shift up or down!");
    }

    @Override
    public void takeOff() {
        System.out.println("Rady fot take off!");
    }

    @Override
    public void land() {
        System.out.println("Landing in 10 minutes");
    }

    @Override
    public void changeHeight() {
        System.out.println("Changing altitude!");
    }

    @Override
    void speed() {
        System.out.println("Your going way to fast " + speed);
    }

    @Override
    void turnOffEngine() {
        System.out.println("Turn car off");
    }
}
