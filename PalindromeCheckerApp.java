class PalindromeChecker {

    // Method to check palindrome using internal array
    public boolean checkPalindrome(String input) {

        // Normalize string: remove spaces and convert to lowercase
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        char[] arr = normalized.toCharArray();
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            if (arr[start] != arr[end]) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}

public class UseCase11PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "Malay Alam";

        System.out.println("Palindrome Checker App - UC11");
        System.out.println("Input String: " + input);

        // Create object of PalindromeChecker
        PalindromeChecker checker = new PalindromeChecker();

        // Call service method
        boolean isPalindrome = checker.checkPalindrome(input);

        if (isPalindrome) {
            System.out.println("Result: The string is a palindrome (ignoring spaces and case).");
        } else {
            System.out.println("Result: The string is not a palindrome.");
        }

        System.out.println("Exiting UC11 flow...");
    }
}