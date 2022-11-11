class Shapes {
    public String type;
    public int dimentions;
    public Shapes(String type,int dimentions){
        this.type = type;
        this.dimentions = dimentions;
    }
}

class Circle extends Shapes {
    public int radius;
    public Circle(int radius){
        super("Circle", 2);
        this.radius = radius;
    }
}

public class Test{
    public static void main(String[] args) {
        Circle c = new Circle(5);

        System.out.println(c.type);
        System.out.println(c.dimentions);
        System.out.println(c.radius);
    }
}
