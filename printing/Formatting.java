import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Formatting {
    public static void main(String[] args) {
        
        System.out.printf("Using printf : %.2f \n", Math.PI);

        DecimalFormat df = new DecimalFormat("###,###,###");
        int num = 123456789;
        System.out.println(df.format(num));

        SimpleDateFormat dt = new SimpleDateFormat("dd-mm-yyyy");
        System.out.println(dt.format(new Date()));


    }
}
