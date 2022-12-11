import java.util.*;

public class absl {
    public static void main(String[] args) {

        AbstractList<Integer> al = new ArrayList<Integer>();

        for (int i = 1; i <= 10; i++) {
            al.add(i);
        }

        System.out.println(al);
    }
}
