public class Car extends Vehicle implements Driveable{

    public Car(int speed, float weight) {
        super(speed, weight);
    }

    @Override
    public void accelerate() {
        System.out.println("from 0 to 60 in 10 seconds");
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
    void speed() {
        System.out.println("Your going way to fast " + speed);
    }

    @Override
    void turnOffEngine() {
        System.out.println("Turn car off");
    }
}
