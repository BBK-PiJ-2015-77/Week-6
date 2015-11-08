
import java.util.Scanner;

public class Ex2c { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("How many Hanoi discs do you wish to check?");
        int numDiscs = input.nextInt();
        int hanoiNo = hanoi(numDiscs);
        System.out.println("The minimum number of moves is " + hanoiNo);
    }

    private static int hanoi (int n) {
        if (n < 2) {
            return 1;
        } else {
            int result = (1 + (2 * hanoi(n-1)));
            return result;
        }
    }
}