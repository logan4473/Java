public class Loops {
    public static void main(String[] args) {
        int d[] = {1,2,3,4,5};

        System.out.println("Using for loop :");
        for(int i=0;i<d.length;i++)
        {
            System.out.println(d[i]);
        }
        System.out.println("Using forEach loop :");
        for(int i:d)
        {
            System.out.println(i);
        }
    }
}
