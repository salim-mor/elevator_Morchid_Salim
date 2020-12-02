package Beans.State;

public interface ElevatorState {
    public int distance(int floor,int elevatorFloor,int floors);
    public void setContext(Context context);
}
