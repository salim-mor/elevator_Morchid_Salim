package Beans.State;

public class Context {
    private ElevatorState elevatorState;

    public Context() {
    }

    public Context(ElevatorState elevatorState) {
        this.elevatorState = elevatorState;
    }

    public ElevatorState getElevatorState() {
        return elevatorState;
    }

    public void setElevatorState(ElevatorState elevatorState) {
        this.elevatorState = elevatorState;
        this.elevatorState.setContext(this);
    }
}
