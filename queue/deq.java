import java.util.*;

public class deq {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<Integer>();

        for (int i = 1; i <= 10; i++) {
            dq.add(i);
        }

        System.out.println(dq);
    }
}
