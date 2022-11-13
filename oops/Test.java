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

public class Test{
    public static void main(String[] args) {
        Circle c = new Circle(5);

        System.out.println(c.getType());
        System.out.println(c.getDimentions());
        System.out.println(c.getRadius());
        System.out.println(c.area());
    }
}
