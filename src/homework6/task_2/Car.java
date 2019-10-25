package homework6.task_2;

public class Car {
    private Transmission transmission;
    private Engine engine;
    private boolean carRide = false;
    private boolean gasPedal = false;

    public Car() {
        this.transmission = new Transmission();
        this.engine = new Engine();
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public Engine getEngine() {
        return engine;
    }

    public void ride() {
        if (getEngine().isWorking() && carRide == false) {
            carRide = true;
            engine.startEngine();
            transmission.changeGearUp();
            gasPedal();
            speed();
        }
        return;
    }

    public void gasPedal() {
        gasPedal = true;
        System.out.println("Gas pedal depressed");
    }

    public void speed() {

        if (carRide == true) {
            System.out.println("Speed = " + getTransmission().getNumberOfGear() * 20);
        } else System.out.println("Speed = 0");
    }
}
