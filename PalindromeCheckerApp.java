
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        String input = "madam";
        boolean isPalindrome = true;
        int length = input.length();

        for (int i = 0; i < length / 2; i++) {
            if (input.charAt(i) != input.charAt(length - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Palindrome Checker App - UC2");
        System.out.println("Checking string: " + input);

        if (isPalindrome) {
            System.out.println("Result: The string is a palindrome.");
        } else {
            System.out.println("Result: The string is not a palindrome.");
        }
        System.out.println("Exiting UC2 flow...");
    }
}