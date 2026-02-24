public class PalindromeCheckerApp {

    public static void main(String[] args) {
        String input = "malayalam";

        System.out.println("Palindrome Checker App - UC9");
        System.out.println("Input String: " + input);

        boolean isPalindrome = checkRecursive(input, 0, input.length() - 1);

        if (isPalindrome) {
            System.out.println("Result: The string is a palindrome.");
        } else {
            System.out.println("Result: The string is not a palindrome.");
        }

        System.out.println("Exiting UC9 flow...");
    }

    public static boolean checkRecursive(String str, int start, int end) {
        if (start >= end) {
            return true;
        }

        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        return checkRecursive(str, start + 1, end - 1);
    }
}