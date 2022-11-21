class Method{
    public static int add(int a,int b){
        return a+b;
    }
}

public class Static {
    public static void main(String[] args) {
        System.out.println(Method.add(6, 9));
    }
}
