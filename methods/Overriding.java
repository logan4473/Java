class Parent{
    String m1(){
        return "From Parent";
    }
}

class Child extends Parent{
    @Override
    String m1(){
        return "From Child";
    }
}
public class Overriding{
    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();
        System.out.println(p.m1());
        System.out.println(c.m1());
    }
}