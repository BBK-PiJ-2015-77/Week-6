
import java.util.Scanner;

public class Ex2b { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter which fibonacci number you wish to find: ");
        int f = input.nextInt();
        int fibno = fib(f);
        System.out.println("The fibonacci number in position " + f + " is: " + fibno);
    }

    private static int fib (int n) {
        if((n == 1) || (n == 2)){
            return 1;
        } else {
            int result = fib(n-1) + fib(n-2);
            return result;
        }
    }
}