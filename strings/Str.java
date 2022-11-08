public class Str {
    public static void main(String[] args) {
        String a = "Logan";
        String b = new String("4473");
        byte ascii[] = {97,98,99,100};
        System.out.println(new String(ascii));
        a.concat(b); // a+b

        System.out.println(a); //String is Immutable
        a = a.concat(b);
        System.out.println(a);
    }
}
