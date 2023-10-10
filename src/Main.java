public class Main {
    public static void main(String[] args) {

        Car merc = new Car(100, 1566);
        Plane airbus = new Plane(1000, 5000000);

        merc.speed();
        airbus.accelerate();
        airbus.turnOffEngine();
    }
}