class Singleton{
    static Singleton instance = null;
    public int x = 10;

    private Singleton(){ }

    static public Singleton getInstance(){
        if(instance == null) instance = new Singleton();
        return instance;
    }
}

class Test{
    public static void main(String[] args) {
        Singleton a = Singleton.getInstance();
        Singleton b = Singleton.getInstance();

        a.x = 20;

        System.out.println(a.x);
        System.out.println(b.x);
    }
}