
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        String input = "Madam";

        String standardized = input.toLowerCase();
        char[] chars = standardized.toCharArray();

        int start = 0;
        int end = chars.length - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        System.out.println("Palindrome Checker App - UC4");
        System.out.println("Original Input: " + input);
        if (isPalindrome) {
            System.out.println("Result: The string is a palindrome (Case-Insensitive).");
        } else {
            System.out.println("Result: The string is not a palindrome.");
        }
        System.out.println("Exiting UC4 flow...");
    }
}