package Beans.State;

public class DownState implements ElevatorState{
    private Context context;

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public int distance(int floor, int elevatorFloor, int floors) {
        System.out.println("Methode destance du down");
        if (floor<=elevatorFloor)return elevatorFloor-floor;
        else return floor+floors ;

    }
}
