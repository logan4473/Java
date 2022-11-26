import java.util.Vector;

public class Vect {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>(10);
        for(int i=1;i<=10;i++){
            v.add(i);
        }

        System.out.println(v);

        for(int i=0;i<v.size();i++){
            System.out.println("v["+i+"] = "+v.get(i));
        }

        for (int i : v) {
            System.out.println(i);
        }
    }
}
