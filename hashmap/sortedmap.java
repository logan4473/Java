import java.util.*;

public class sortedmap {
    public static void main(String[] args) {
        SortedMap<Integer, String> sm = new TreeMap<Integer, String>();

        sm.put(4, "a");
        sm.put(2, "b");
        sm.put(5, "c");
        sm.put(1, "d");
        sm.put(3, "e");

        System.out.println(sm);
    }
}
