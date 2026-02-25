package UC6;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// UC6: Queue + Stack Hybrid Method

public class UC6_QueueStackPalindrome {
    
    public static void main(String[] args) {
        displayWelcome();
        checkPalindromeUsingQueueAndStack();
    }
    
    // UC1: Welcome Message Module
    public static void displayWelcome() {
        System.out.println("========================================");
        System.out.println("  WELCOME TO PALINDROME CHECKER APP");
        System.out.println("========================================");
        System.out.println("Use Case 6: Queue + Stack Based Palindrome Check");
        System.out.println("========================================");
        System.out.println();
    }
    
    // UC6: Queue + Stack Based Palindrome Check
    public static void checkPalindromeUsingQueueAndStack() {
        System.out.println("--- QUEUE + STACK HYBRID METHOD ---");
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
            boolean isPalindrome = isPalindromeUsingQueueAndStack(str);
            String result = isPalindrome ? "✓ PALINDROME" : "✗ NOT PALINDROME";
            System.out.println("\"" + str + "\" -> " + result);
        }
        
        System.out.println();
    }
    
    // Method 4: Using Queue (FIFO) and Stack (LIFO)
    // Queue reads forward, Stack reads backward
    public static boolean isPalindromeUsingQueueAndStack(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        
        String cleaned = str.toLowerCase().replaceAll("[^a-z0-9]", "");
        
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();
        
        // Fill both queue and stack with all characters
        for (char c : cleaned.toCharArray()) {
            queue.add(c);
            stack.push(c);
        }
        
        // Compare: Queue gives forward order, Stack gives reverse order
        while (!queue.isEmpty()) {
            if (!queue.poll().equals(stack.pop())) {
                return false;
            }
        }
        
        return true;
    }
}
