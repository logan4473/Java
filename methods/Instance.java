public class Instance {
    String name = "";
    
    public void instanceMethod(String x){
        this.name = x;
    }

    public static void main(String[] args) {
        Instance i = new Instance();
        i.instanceMethod("Hemlo");
        System.out.println(i.name);
    }
}

