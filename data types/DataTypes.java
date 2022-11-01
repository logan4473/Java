public class DataTypes{
    public static void main(String[] args) {
        //Primitive Data Types
        boolean bool = true;
        System.out.println(!bool);
        
        byte bytevar = 127;
        System.out.println(bytevar);
        bytevar++;
        System.out.println(bytevar);

        short sortvar = 32000;
        System.out.println(sortvar);

        int integer = 1000000000;
        System.out.println(integer);

        long longvar = (long)Math.pow(10, 18);
        System.out.println(longvar);
        
        float f = 3.14f;
        System.out.println(f);

        double d = 22.0/7;
        System.out.println(d);

        char uni = 2314;
        System.out.println(uni);

        //Non-Primitive

        String s = "Hello 😊";
        System.out.println(s);

        int[] array = {1,2,3,4};
        for(int i=0;i<4;i++)
        System.out.println(array[i]);

    }
}