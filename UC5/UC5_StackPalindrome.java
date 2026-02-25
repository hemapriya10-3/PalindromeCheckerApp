import java.util.Stack;

public class UC5_StackPalindrome {
    
    public static void main(String[] args) {
        displayWelcome();
        checkPalindromeUsingStack();
    }
    
    // UC1: Welcome Message Module
    public static void displayWelcome() {
        System.out.println("========================================");
        System.out.println("  WELCOME TO PALINDROME CHECKER APP");
        System.out.println("========================================");
        System.out.println("Use Case 5: Stack-Based Palindrome Checker");
        System.out.println("========================================");
        System.out.println();
    }
    
    // UC5: Stack-Based Palindrome Checker
    public static void checkPalindromeUsingStack() {
        System.out.println("--- STACK-BASED METHOD (LIFO) ---");
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
            boolean isPalindrome = isPalindromeUsingStack(str);
            String result = isPalindrome ? "✓ PALINDROME" : "✗ NOT PALINDROME";
            System.out.println("\"" + str + "\" -> " + result);
        }
        
        System.out.println();
    }
    
    // Method 3: Using Stack (Last In First Out)
    public static boolean isPalindromeUsingStack(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        
        String cleaned = str.toLowerCase().replaceAll("[^a-z0-9]", "");
        Stack<Character> stack = new Stack<>();
        
        // Push first half of string to stack
        int mid = cleaned.length() / 2;
        for (int i = 0; i < mid; i++) {
            stack.push(cleaned.charAt(i));
        }
        
        // Skip middle character if odd length
        int startIndex = (cleaned.length() % 2 == 0) ? mid : mid + 1;
        
        // Compare second half with stack (LIFO)
        for (int i = startIndex; i < cleaned.length(); i++) {
            if (stack.pop() != cleaned.charAt(i)) {
                return false;
            }
        }
        
        return true;
    }
}
