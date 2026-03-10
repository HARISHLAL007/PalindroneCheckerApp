import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        str = str.toLowerCase().replaceAll("\\s+", "");

        int start = 0;
        int end = str.length() - 1;

        boolean isPalindrome = true;

        while(start < end){
            if(str.charAt(start) != str.charAt(end)){
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if(isPalindrome)
            System.out.println("Palindrome String");
        else
            System.out.println("Not a Palindrome String");

        sc.close();
    }
}