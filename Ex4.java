
import java.util.Scanner;

public class Ex4 { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter your word:");
        String text = input.nextLine();
        boolean check = palcheck(text);
        System.out.println(check);
    }

    private static boolean palcheck(String s){
        int len = s.length();
        if (len <= 1){
            return true;
        } else if(s.charAt(0) != s.charAt(len - 1)) {
            return false;
        } else if (palcheck(s.substring(1 len - 1)) == true) {
            return true;
        } else {
            return false;
        }
    }
}