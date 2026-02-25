// UC2: Hardcoded Palindrome Check

public class UC2_PalindromeChecker {
    
    public static void main(String[] args) {
        displayWelcome();
        checkHardcodedPalindromes();
    }
    
    // UC1: Welcome Message Module
    public static void displayWelcome() {
        System.out.println("========================================");
        System.out.println("  WELCOME TO PALINDROME CHECKER APP");
        System.out.println("========================================");
        System.out.println("Check if any string is a Palindrome");
        System.out.println("A palindrome reads the same forwards and backwards");
        System.out.println("========================================");
        System.out.println();
    }
    
    // UC2: Hardcoded Palindrome Check
    public static void checkHardcodedPalindromes() {
        System.out.println("--- HARDCODED PALINDROME TESTS ---");
        System.out.println();
        
        // Test cases
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
            boolean isPalindrome = isPalindrome(str);
            String result = isPalindrome ? "✓ PALINDROME" : "✗ NOT PALINDROME";
            System.out.println("\"" + str + "\" -> " + result);
        }
        
        System.out.println();
    }
    
    // Helper method to check if a string is palindrome
    public static boolean isPalindrome(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        
        String cleaned = str.toLowerCase().replaceAll("[^a-z0-9]", "");
        int left = 0;
        int right = cleaned.length() - 1;
        
        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
}
