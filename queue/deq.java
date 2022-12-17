import java.util.*;

public class deq {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<Integer>();

        for (int i = 1; i <= 10; i++) {
            dq.add(i);
        }

        System.out.println(dq);

        dq.addFirst(6);
        dq.addLast(7);
        dq.push(8);
        dq.offer(9);
        dq.offerFirst(10);

        System.out.println(dq);

        dq.removeFirst();
        dq.removeLast();

        System.out.println(dq);

    }
}
