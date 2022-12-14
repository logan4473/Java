import java.util.ArrayList;
import java.util.ListIterator;

public class ArrList {
    public static void main(String[] args) {
        int n = 5;
        ArrayList<Integer> arrli = new ArrayList<>(n);
        for (int i = 1; i <= n; i++)
            arrli.add(i);

        System.out.println(arrli);

        arrli.remove(3);
        System.out.println(arrli);

        for (int i = 0; i < arrli.size(); i++) {
            System.out.print(arrli.get(i) + " ");
        }
        System.out.println();

        arrli.forEach(x -> System.out.print(x + " "));
        System.out.println();

        arrli.add(2, 5);

        System.out.println(arrli.indexOf(5));
        System.out.println(arrli.lastIndexOf(5));

        ListIterator<Integer> it = arrli.listIterator();

        while (it.hasNext())
            System.out.print(it.next() + " ");
        System.out.println();

        it = arrli.listIterator(2);

        while (it.hasNext())
            System.out.print(it.next() + " ");
        System.out.println();

        System.out.println(arrli.subList(1, 4));

        Object[] obj = arrli.toArray();
        for (Object i : obj) {
            System.out.print(i + " ");
        }
        System.out.println();

    }
}
