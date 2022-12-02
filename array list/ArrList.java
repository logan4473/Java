import java.util.ArrayList;

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

    }
}
