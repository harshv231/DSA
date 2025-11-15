import java.util.HashMap;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        map.put("Harsh", 72);
        map.put("Nayan", 73);
        map.put("Karan", 55);

        System.out.println(map.get("Karan"));
        System.out.println(map.getOrDefault("karan",99));
        System.out.println(map.containsKey("Karan"));

        map.remove("Nayan");
        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        

    }
}
