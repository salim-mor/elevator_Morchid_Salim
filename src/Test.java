import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
      String id1="ff";
      String buff="ggggg";
      String id ="id1:1";
        Map<String,String> test = new HashMap<>();
        test.put(id1,buff);
        System.out.println(test);
        id1="ii";
         buff="dddddd";
        test.put(id1,buff);
        System.out.println(test);

        System.out.println(test.get(id1));
    }
}
