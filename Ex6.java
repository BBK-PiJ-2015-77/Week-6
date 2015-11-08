
import java.util.Scanner;

public class Ex6 { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("EWe are going to check what the GCD is for 2 numbers.");
        System.out.println("Enter the first (higher) number you wish to check:");
        int p = input.nextInt();
        System.out.println("Enter the second (lower) number you wish to check:");
        int q = input.nextInt();
        int gcdNo = gcd(pq);
        System.out.println("The minimum number of moves is " + gcdNo);
    }

    private static int gcd (int p, int q) {
        if (p%q == 0) {
            return q;
        } else {
            int result = gcd(qp%q);
            return result;
        }
    }
}