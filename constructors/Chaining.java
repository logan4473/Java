class Chain{
    public Chain(){
        this(10);
        System.out.println("W/o arg");
    }

    public Chain(int x){
        this(x,20);
        System.out.println("With arg x");
    }

    public Chain(int x,int y){
        System.out.println("With arg x and y");
    }   
}

public class Chaining {
    public static void main(String[] args) {
        new Chain();
    }
}
