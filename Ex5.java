
import java.util.Scanner;

public class Ex5 { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Power exponent Calculator");
        System.out.println("Please enter the base component");
        int baseNo = input.nextInt();
        System.out.println("Please enter the exponent");
        int exponentNo = input.nextInt();
        int poo = pow(baseNoexponentNo);
    }

    private static int pow(int baseNo,int exponentNo) {
        for(int count = 1; count < exponent; count++){
            int result = result * base;
        }
        return result;
    }
}