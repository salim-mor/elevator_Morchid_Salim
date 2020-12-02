package Beans.State;

public class RestingState implements ElevatorState {

    private Context context;

    public Context getContext() {
        return context;
    }

    @Override
    public void setContext(Context context) {
        this.context = context;
    }

    @Override
    public int distance(int floor, int elevatorFloor, int floors) {
        System.out.println("Methode distance Resting State");
        return Math.abs(floor-elevatorFloor);
    }
}
