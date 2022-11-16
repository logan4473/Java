abstract class Shapes {
    protected String type;
    protected int dimentions;
    public Shapes(String type,int dimentions){
        this.type = type;
        this.dimentions = dimentions;
    }

    abstract double area();

}

class Circle extends Shapes {
    protected int radius;
    public Circle(int radius){
        super("Circle", 2);
        this.radius = radius;
    }

    @Override public double area(){
        return this.radius*this.radius*Math.PI;
    }

    public int getRadius(){
        return this.radius;
    }

    public String getType(){
        return this.type;
    }

    public int getDimentions(){
        return this.dimentions;
    }
}

class Poly{
    public int mul(int a,int b){
        return a*b;
    }

    public double mul(double a,double b){
        return a*b;
    }

    public int mul(int a,int b,int c){
        return a*b*c;
    }
}

class PolyChild{
    public int mul(int a,int b){
        System.out.println("Using PolyChild");
        return a*b;
    }
}

class PolyGrandChild{
    public int mul(int a,int b,int c){
        System.out.println("Using PolyGrandChild");
        return a*b*c;
    }
}

interface In1{
    final int x = 10;

    void display();
}

public class Test implements In1{

    public void display(){
        System.out.println("Interfacing");
    }

    public static void main(String[] args) {
        Circle c = new Circle(5);

        System.out.println(c.getType());
        System.out.println(c.getDimentions());
        System.out.println(c.getRadius());
        System.out.println(c.area());

        Poly p = new Poly();
        System.out.println(p.mul(3, 3));
        System.out.println(p.mul(3, 3,2));
        System.out.println(p.mul(5, 3.5));

        PolyChild pc = new PolyChild();
        System.out.println(pc.mul(10, 12));

        PolyGrandChild pgc = new PolyGrandChild();
        System.out.println(pgc.mul(10, 12, 5));

        Test t = new Test();
        t.display();
        System.out.println(t.x);
    }
}
