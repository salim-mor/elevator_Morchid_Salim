package Beans.elevator;

import java.util.HashMap;
import java.util.Map;

public class ElevatorFactory {




public Map<String, Elevator> getElevators(String... ids){
    Map<String, Elevator> elev= new HashMap<>();
    for (String id:ids) {
        elev.put(id.split(":")[0],
                new Elevator(Integer.valueOf(id.split(":")[0].replace("id","")),
                        Integer.valueOf(id.split(":")[1])));
    }
    return elev;
}

    public ElevatorFactory() {
    }
}
