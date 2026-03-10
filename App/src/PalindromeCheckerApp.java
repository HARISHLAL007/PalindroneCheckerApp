import java.util.*;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        LinkedList<Character> list = new LinkedList<>();

        for(int i = 0; i < str.length(); i++){
            list.add(str.charAt(i));
        }

        boolean isPalindrome = true;

        while(list.size() > 1){
            if(list.removeFirst() != list.removeLast()){
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome)
            System.out.println("Palindrome String");
        else
            System.out.println("Not a Palindrome String");

        sc.close();
    }
}