import java.util.*;

public class Test {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 1; i <= 10; i++) {
            stack.push(i);
        }

        System.out.println(stack);
        System.out.println("Top of stack : " + stack.peek());
    }
}
