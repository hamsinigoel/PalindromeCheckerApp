
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        String input = "madam";
        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        System.out.println("Palindrome Checker App - UC3");
        System.out.println("input String: " + input);
        System.out.println("Reversed String: " + reversed);

        if (input.equals(reversed)) {
            System.out.println("Result: The string is a palindrome.");
        } else {
            System.out.println("Result: The string is not a palindrome.");
        }
        System.out.println("Exiting UC3 flow...");
    }
}