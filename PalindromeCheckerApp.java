public class UseCase10PalindromeCheckerApp {

    public static void main(String[] args) {
        String input = "Malay Alam";

        System.out.println("Palindrome Checker App - UC10");
        System.out.println("Input String: " + input);

        // Normalize string: remove spaces and convert to lowercase
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        boolean isPalindrome = checkRecursive(normalized, 0, normalized.length() - 1);

        if (isPalindrome) {
            System.out.println("Result: The string is a palindrome (ignoring spaces and case).");
        } else {
            System.out.println("Result: The string is not a palindrome.");
        }

        System.out.println("Exiting UC10 flow...");
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