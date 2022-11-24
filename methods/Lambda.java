
interface Fun{
    int cal(int x);
}

public class Lambda{
    public static void main(String[] args) {
        Fun f1 = (int x) -> x*x;
        System.out.println(f1.cal(10));
    }
}