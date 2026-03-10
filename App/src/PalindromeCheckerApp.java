interface PalindromeStrategy {
    boolean isPalindrome(String str);
}

class ReverseStrategy implements PalindromeStrategy {

    public boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}

class PalindromeContext {

    private PalindromeStrategy strategy;

    public PalindromeContext(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean check(String str) {
        return strategy.isPalindrome(str);
    }
}

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String str = "madam";

        PalindromeContext context =
                new PalindromeContext(new ReverseStrategy());

        if(context.check(str))
            System.out.println("Palindrome String");
        else
            System.out.println("Not a Palindrome String");
    }
}