// UC9: Recursive Palindrome Checker - Implementing logic without loops using recursion

public class UC9_RecursivePalindrome {
    
    public static void main(String[] args) {
        displayWelcome();
        checkPalindromeUsingRecursion();
    }
    
    // UC1: Welcome Message Module
    public static void displayWelcome() {
        System.out.println("========================================");
        System.out.println("  WELCOME TO PALINDROME CHECKER APP");
        System.out.println("========================================");
        System.out.println("Use Case 9: Recursive Palindrome Checker");
        System.out.println("========================================");
        System.out.println();
    }
    
    // UC9: Recursive Palindrome Checker
    public static void checkPalindromeUsingRecursion() {
        System.out.println("--- RECURSIVE METHOD (NO LOOPS) ---");
        System.out.println();
        
        String[] testStrings = {
            "racecar",
            "level",
            "hello",
            "madam",
            "world",
            "noon",
            "java"
        };
        
        for (String str : testStrings) {
            boolean isPalindrome = isPalindromeRecursive(str);
            String result = isPalindrome ? "✓ PALINDROME" : "✗ NOT PALINDROME";
            System.out.println("\"" + str + "\" -> " + result);
        }
        
        System.out.println();
    }
    
    // Method: Using Recursion (no loops)
    public static boolean isPalindromeRecursive(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        
        String cleaned = str.toLowerCase().replaceAll("[^a-z0-9]", "");
        return isPalindromeRecursiveHelper(cleaned, 0, cleaned.length() - 1);
    }
    
    // Helper: Recursive comparison from both ends
    private static boolean isPalindromeRecursiveHelper(String str, int left, int right) {
        // Base case: when left and right pointers meet or cross
        if (left >= right) {
            return true;
        }
        
        // Check if characters at both ends match
        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }
        
        // Recursive call: move pointers inward
        return isPalindromeRecursiveHelper(str, left + 1, right - 1);
    }
}
