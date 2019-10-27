package homework6.task_2;

public class Transmission {
    private int numberOfGear;
    // private static final int GEARS_TRANSMISSION = 7;
    private int GEARS_TRANSMISSION = 7;

    public int getNumberOfGear() {
        return numberOfGear;
    }

    public void changeGearUp() {
// пустая строка не нужна
        if (numberOfGear < GEARS_TRANSMISSION) {
            numberOfGear++;
        }
        if (numberOfGear == GEARS_TRANSMISSION) System.out.println("The transmission has 7 gears");
    }

    // 'public' void changeGearDown() {
    void changeGearDown() {
        if (numberOfGear == 0) {
            System.out.println("neutral position");
        } else {
            numberOfGear--;
        }
    }

// пустая строка не нужна
}
