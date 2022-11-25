import java.util.Vector;

public class Vect {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>(10);
        for(int i=1;i<=10;i++){
            v.add(i);
        }

        System.out.println(v);
    }
}
