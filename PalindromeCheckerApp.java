import java.util.Stack;

public class UseCase13PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "Malay Alam";
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        System.out.println("Palindrome Checker App - UC13");
        System.out.println("Input String: " + input);
        System.out.println();

        // Reverse String Method
        long start1 = System.nanoTime();
        boolean result1 = checkUsingReverse(normalized);
        long end1 = System.nanoTime();
        long time1 = end1 - start1;

        // Stack Method
        long start2 = System.nanoTime();
        boolean result2 = checkUsingStack(normalized);
        long end2 = System.nanoTime();
        long time2 = end2 - start2;

        // Two Pointer Method
        long start3 = System.nanoTime();
        boolean result3 = checkUsingTwoPointer(normalized);
        long end3 = System.nanoTime();
        long time3 = end3 - start3;

        System.out.println("Reverse Method Result: " + result1 + " | Time: " + time1 + " ns");
        System.out.println("Stack Method Result: " + result2 + " | Time: " + time2 + " ns");
        System.out.println("Two Pointer Method Result: " + result3 + " | Time: " + time3 + " ns");

        System.out.println("\nExiting UC13 flow...");
    }

    // Method 1: Reverse String
    public static boolean checkUsingReverse(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    // Method 2: Stack
    public static boolean checkUsingStack(String str) {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            stack.push(c);
        }

        for (char c : str.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    // Method 3: Two Pointer
    public static boolean checkUsingTwoPointer(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}