public class PalindromeCheckerApp {

    public static boolean checkPalindrome(String str) {

        int start = 0;
        int end = str.length() - 1;

        while(start < end){
            if(str.charAt(start) != str.charAt(end))
                return false;

            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

        String str = "madam";

        long startTime = System.nanoTime();

        boolean result = checkPalindrome(str);

        long endTime = System.nanoTime();

        if(result)
            System.out.println("Palindrome String");
        else
            System.out.println("Not a Palindrome String");

        System.out.println("Execution Time: " + (endTime - startTime) + " ns");
    }
}