import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        int number = 121;
        int reversed = 0;
        int remainder;
        int original = number;

        while (number != 0) {
            remainder = number % 10;
            reversed = reversed * 10 + remainder;
            number = number / 10;
        }

        if (original == reversed) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not a Palindrome Number");
        }

    }
}