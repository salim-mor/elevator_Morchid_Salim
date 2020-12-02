package Beans.elevator;

import Beans.State.Context;
import Beans.State.ElevatorState;
import Beans.State.RestingState;

public class Elevator {
    private int id;
    private int floor;
    private Context context= new Context();

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public Elevator(int id , int floor){
        this.id=id;
        this.floor=floor;
        ElevatorState restingState = new RestingState();
        this.context.setElevatorState(restingState);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }
}
