package homework6.task_2;

// в целом хорошо
public class Main {
    public static void main(String[] args) {
    // пустая строка не нужна
        Car car = new Car();
        car.ride();
        car.getTransmission().changeGearUp();
        car.getEngine().stopEngine();
        car.speed();
    }
}
