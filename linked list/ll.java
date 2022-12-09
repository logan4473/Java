import java.util.*;

public class ll {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<Integer>();

        for (int i = 1; i <= 10; i++) {
            l.add(i);
        }

        System.out.println(l);

        l.addFirst(6);
        l.addLast(9);

        System.out.println(l);
        System.out.println("First element : " + l.getFirst());
        System.out.println("Last element : " + l.getLast());

    }
}
