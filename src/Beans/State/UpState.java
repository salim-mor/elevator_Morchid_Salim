package Beans.State;

public class UpState implements ElevatorState {

private Context context ;

    public Context getContext() {
        return context;
    }


    @Override
    public void setContext(Context context) {
        this.context = context;
    }

    @Override
    public int distance(int floor, int elevatorFloor,int floors) {

        System.out.println("method distance du up ");
        if (floor>=elevatorFloor)return floor-elevatorFloor;
        else return (2*floors)-elevatorFloor-floor ;

    }
}
