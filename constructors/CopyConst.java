class A {
    private int a;
    private int b;

    public A(int a,int b){
        this.a = a;
        this.b = b;
    }

    public A(A x){
        a = x.a;
        b = x.b;
    }

    @Override public String toString(){
        return "a : "+a+" b : "+b;
    }
    
}

public class CopyConst{
    public static void main(String[] args) {
        A a = new A(1,2);
        A b = new A(a);

        System.out.println(b);
    }
}