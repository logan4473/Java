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

        l.set(6, 12);
        System.out.println(l);

        Object[] arr = l.toArray();
        for (Object i : arr)
            System.out.print(i + " ");
        System.out.println();

        String s = l.toString();
        System.out.println(s);

    }
}
