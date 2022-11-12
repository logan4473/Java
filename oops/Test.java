abstract class Shapes {
    public String type;
    public int dimentions;
    public Shapes(String type,int dimentions){
        this.type = type;
        this.dimentions = dimentions;
    }

    abstract double area();

}

class Circle extends Shapes {
    public int radius;
    public Circle(int radius){
        super("Circle", 2);
        this.radius = radius;
    }

    @Override public double area(){
        return this.radius*this.radius*Math.PI;
    }
}

public class Test{
    public static void main(String[] args) {
        Circle c = new Circle(5);

        System.out.println(c.type);
        System.out.println(c.dimentions);
        System.out.println(c.radius);
        System.out.println(c.area());
    }
}
