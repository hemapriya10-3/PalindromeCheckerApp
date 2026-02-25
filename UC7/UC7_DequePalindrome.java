package UC7;

import java.util.Deque;
import java.util.LinkedList;

// UC7: Deque-Based Optimized Method

public class UC7_DequePalindrome {
    
    public static void main(String[] args) {
        displayWelcome();
        checkPalindromeUsingDeque();
    }
    
    // UC1: Welcome Message Module
    public static void displayWelcome() {
        System.out.println("========================================");
        System.out.println("  WELCOME TO PALINDROME CHECKER APP");
        System.out.println("========================================");
        System.out.println("Use Case 7: Deque-Based Optimized Palindrome Checker");
        System.out.println("========================================");
        System.out.println();
    }
    
    // UC7: Deque-Based Optimized Palindrome Checker
    public static void checkPalindromeUsingDeque() {
        System.out.println("--- DEQUE-BASED OPTIMIZED METHOD ---");
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
            boolean isPalindrome = isPalindromeUsingDeque(str);
            String result = isPalindrome ? "✓ PALINDROME" : "✗ NOT PALINDROME";
            System.out.println("\"" + str + "\" -> " + result);
        }
        
        System.out.println();
    }
    
    // Method 5: Using Deque (Double-Ended Queue)
    // Can access and remove from both ends efficiently
    public static boolean isPalindromeUsingDeque(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        
        String cleaned = str.toLowerCase().replaceAll("[^a-z0-9]", "");
        Deque<Character> deque = new LinkedList<>();
        
        // Fill deque with characters
        for (char c : cleaned.toCharArray()) {
            deque.add(c);
        }
        
        // Compare characters from both ends simultaneously
        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }
        
        return true;
    }
}
