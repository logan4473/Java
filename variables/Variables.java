public class Variables {
    public String b;
    public static String c = "Static Variable";
    public Variables()
    {
        this.b = "Instance Variable";
    }
    public static void main(String[] args) {
        String a = "Local Variable";
        Variables obj = new Variables();

        System.out.println(a);
        System.out.println(obj.b);
        System.out.println(c);
        
    }    
}
