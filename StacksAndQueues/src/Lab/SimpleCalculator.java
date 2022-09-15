package Lab;

import java.lang.reflect.Array;
import java.util.*;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr = scanner.nextLine().split("\\s+");

        ArrayDeque<String> stack = new ArrayDeque<>();
        Collections.addAll(stack, arr);
        int sum = 0;

        while (stack.size() > 1){
            int first = Integer.parseInt(stack.pop());
            String pOrM = stack.pop();
            int second = Integer.parseInt(stack.pop());

            switch (pOrM){
                case"+":
                    stack.push(String.valueOf(first + second));
                    break;
                case"-":
                    stack.push(String.valueOf(first - second));
            }
        }
        System.out.println(stack.pop());
    }
}
