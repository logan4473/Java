import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class abstqueue {
    public static void main(String[] args) {
        AbstractQueue<Integer> absq = new LinkedBlockingQueue<>();

        for (int i = 1; i <= 10; i++) {
            absq.add(i);
        }

        System.out.println(absq);

    }
}
