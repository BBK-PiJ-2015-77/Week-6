
import java.util.Scanner;

public class Ex2a { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
            //iterative

            System.out.println("Please enter a number you wish to find the factorial of: ");
        int f = input.nextInt();
        for(int i = (f-1); i > 0; i--) {
            f = f * i;
        }
        System.out.println(f);
    }

    private static int factorial(int n){
        if (n ==1) {
            return 1;
        } else {
            int result = n * factorial(n-1);
            return result;
        }
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