package UC3;

// UC3: String Reverse Method

public class UC3_StringReversePalindrome {
    
    public static void main(String[] args) {
        displayWelcome();
        checkPalindromeUsingStringReverse();
    }
    
    // UC1: Welcome Message Module
    public static void displayWelcome() {
        System.out.println("========================================");
        System.out.println("  WELCOME TO PALINDROME CHECKER APP");
        System.out.println("========================================");
        System.out.println("Use Case 3: Palindrome Check Using String Reverse");
        System.out.println("========================================");
        System.out.println();
    }
    
    // UC3: Palindrome Check Using String Reverse
    public static void checkPalindromeUsingStringReverse() {
        System.out.println("--- STRING REVERSE METHOD ---");
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
            boolean isPalindrome = isPalindromeUsingReverse(str);
            String result = isPalindrome ? "✓ PALINDROME" : "✗ NOT PALINDROME";
            System.out.println("\"" + str + "\" -> " + result);
        }
        
        System.out.println();
    }
    
    // Method 1: Using String Reverse (StringBuilder)
    public static boolean isPalindromeUsingReverse(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        
        String cleaned = str.toLowerCase().replaceAll("[^a-z0-9]", "");
        String reversed = new StringBuilder(cleaned).reverse().toString();
        
        return cleaned.equals(reversed);
    }
}
