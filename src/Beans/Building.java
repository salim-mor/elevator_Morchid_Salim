package Beans;

import Beans.State.Context;
import Beans.State.DownState;
import Beans.State.ElevatorState;
import Beans.State.UpState;
import Beans.elevator.Elevator;
import Beans.elevator.ElevatorFactory;

import java.util.HashMap;
import java.util.Map;

public class Building {
    private int floors;
    private int i=-1;
    private String key;
    private ElevatorFactory elevatorFactory= new ElevatorFactory();
    private Map<String, Elevator> elevators = new HashMap<String,Elevator>()   ;


    public Building(int floors ,String... ids)
    {
        this.floors = floors;
        this.elevators = elevatorFactory.getElevators(ids);
    }
    public String calculMin(int floor){
        elevators.forEach((s, elevator) -> {
            if( (elevator.getContext().getElevatorState().distance(floor,elevator.getFloor(),this.floors)<= this.i)|| this.i<0) {
                this.i=elevator.getContext().getElevatorState().distance(floor,elevator.getFloor(),this.floors);
                this.key=s;
            }
        });
        return this.key;
    }
    public String requestElevator(){

        return calculMin(10);
    }
    public String requestElevator(int floor){

        return calculMin(floor);
    }
    public void move(String id,String state){
        System.out.println(id);

        if(state.equals("DOWN")){
            ElevatorState downState = new DownState();
        elevators.get(id).getContext().setElevatorState(downState);}
        else {
            ElevatorState upState = new UpState();
        elevators.get(id).getContext().setElevatorState(upState);}
    }

   public  void stopAt(String id , int floor){
        this.elevators.get(id).setFloor(floor);

   }
}
