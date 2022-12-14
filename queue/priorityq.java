import java.util.*;

public class priorityq {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for (int i = 10; i >= 0; i--) {
            pq.add(i);
        }

        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq.peek());
    }
}
