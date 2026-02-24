import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        String input = "noon";
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        boolean isPalindrome = true;

        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Palindrome Checker App - UC5");
        System.out.println("Input String: " + input);

        if (isPalindrome) {
            System.out.println("Result: The string is a palindrome.");
        } else {
            System.out.println("Result: The string is not a palindrome.");
        }
        System.out.println("Exiting UC5 flow...");
    }
}