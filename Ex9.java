
import java.util.Scanner;

public class Ex9 { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int eno = 0;
        System.out.println("Enter your text");
        String s = input.nextLine();
        int len = s.length();
        System.out.println("Enter the letter you wish to count");
        String s2 = input.nextLine();
        char c = s2.charAt(0);
        for (int count = 0; count < len; count++) {
            char charcheck = s.charAt(count);
            if (charcheck == c) {
                eno = eno + 1;
            }
        }
        System.out.println("The total number of " + c + "'s is " + eno);
    }
}