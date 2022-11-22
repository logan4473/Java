abstract class A{
    abstract String m1();
    String m2()
    {
        return "From A";
    }
}

class B extends A{
    String m1(){
        return "From B";
    }
}

public class Abstract {
    public static void main(String[] args) {
        // A a = new A(); Error
        B b = new B();
        System.out.println(b.m1());
        System.out.println(b.m2()); 
    }
}
