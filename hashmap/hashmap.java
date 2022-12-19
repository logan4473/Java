import java.util.*;

public class hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> m = new HashMap<String, Integer>();

        m.put("logan", 100);
        m.put("captain", 101);
        m.put("levis", 102);

        System.out.println(m);

        System.out.println(m.size());

        System.out.println(m.get("logan"));

        System.out.println(m.containsKey("superman"));

    }
}
