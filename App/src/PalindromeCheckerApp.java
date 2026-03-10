
import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num, reversed = 0, remainder, original;

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        original = num;

        while (num != 0) {
            remainder = num % 10;
            reversed = reversed * 10 + remainder;
            num = num / 10;
        }

        if (original == reversed) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not a Palindrome Number");
        }

        sc.close();
    }
}
