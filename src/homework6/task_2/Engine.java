package homework6.task_2;

public class Engine {

    private boolean working;

    public void startEngine() {
        if (working) {
            System.out.println("Engine is already started");
        } else {
            working = true;
        }

    }

    public void stopEngine() {
        if (working) {
            working = false;
        } else {
            System.out.println("Engine is already stopped");
        }
    }

    public boolean isWorking() {
        return working;
    }

}
