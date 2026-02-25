package UC12;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;

// UC12: Strategy Pattern for Palindrome Algorithms - Implementing Design Patterns to swap algorithms at runtime

public class UC12_StrategyPattern {
    
    // Strategy Interface
    interface PalindromeStrategy {
        boolean isPalindrome(String str);
        String getStrategyName();
    }
    
    // Strategy 1: Two-Pointer
    static class TwoPointerStrategy implements PalindromeStrategy {
        @Override
        public boolean isPalindrome(String str) {
            String cleaned = cleanString(str);
            int left = 0, right = cleaned.length() - 1;
            
            while (left < right) {
                if (cleaned.charAt(left) != cleaned.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }
        
        @Override
        public String getStrategyName() {
            return "Two-Pointer Technique";
        }
    }
    
    // Strategy 2: Stack-Based
    static class StackStrategy implements PalindromeStrategy {
        @Override
        public boolean isPalindrome(String str) {
            String cleaned = cleanString(str);
            Stack<Character> stack = new Stack<>();
            
            int mid = cleaned.length() / 2;
            for (int i = 0; i < mid; i++) {
                stack.push(cleaned.charAt(i));
            }
            
            int startIndex = (cleaned.length() % 2 == 0) ? mid : mid + 1;
            for (int i = startIndex; i < cleaned.length(); i++) {
                if (stack.pop() != cleaned.charAt(i)) {
                    return false;
                }
            }
            return true;
        }
        
        @Override
        public String getStrategyName() {
            return "Stack-Based Strategy (LIFO)";
        }
    }
    
    // Strategy 3: Deque-Based
    static class DequeStrategy implements PalindromeStrategy {
        @Override
        public boolean isPalindrome(String str) {
            String cleaned = cleanString(str);
            Deque<Character> deque = new LinkedList<>();
            
            for (char c : cleaned.toCharArray()) {
                deque.add(c);
            }
            
            while (deque.size() > 1) {
                if (!deque.removeFirst().equals(deque.removeLast())) {
                    return false;
                }
            }
            return true;
        }
        
        @Override
        public String getStrategyName() {
            return "Deque-Based Strategy (Double-Ended)";
        }
    }
    
    // Strategy 4: Reverse String
    static class ReverseStrategy implements PalindromeStrategy {
        @Override
        public boolean isPalindrome(String str) {
            String cleaned = cleanString(str);
            String reversed = new StringBuilder(cleaned).reverse().toString();
            return cleaned.equals(reversed);
        }
        
        @Override
        public String getStrategyName() {
            return "String Reverse Strategy";
        }
    }
    
    // Strategy 5: Recursive
    static class RecursiveStrategy implements PalindromeStrategy {
        @Override
        public boolean isPalindrome(String str) {
            String cleaned = cleanString(str);
            return isPalindromeRecursive(cleaned, 0, cleaned.length() - 1);
        }
        
        private boolean isPalindromeRecursive(String str, int left, int right) {
            if (left >= right) return true;
            if (str.charAt(left) != str.charAt(right)) return false;
            return isPalindromeRecursive(str, left + 1, right - 1);
        }
        
        @Override
        public String getStrategyName() {
            return "Recursive Strategy";
        }
    }
    
    // Context: Switcher that uses strategies
    static class StrategyContext {
        private PalindromeStrategy strategy;
        private Map<String, PalindromeStrategy> strategyRegistry;
        
        public StrategyContext() {
            this.strategyRegistry = new HashMap<>();
            registerDefaultStrategies();
            this.strategy = new TwoPointerStrategy(); // Default strategy
        }
        
        // Register different strategies
        private void registerDefaultStrategies() {
            strategyRegistry.put("twopointer", new TwoPointerStrategy());
            strategyRegistry.put("stack", new StackStrategy());
            strategyRegistry.put("deque", new DequeStrategy());
            strategyRegistry.put("reverse", new ReverseStrategy());
            strategyRegistry.put("recursive", new RecursiveStrategy());
        }
        
        // Switch strategy at runtime
        public void switchStrategy(String strategyName) {
            PalindromeStrategy newStrategy = strategyRegistry.get(strategyName.toLowerCase());
            if (newStrategy != null) {
                this.strategy = newStrategy;
                System.out.println("✓ Strategy switched to: " + strategy.getStrategyName());
            } else {
                System.out.println("✗ Strategy not found: " + strategyName);
            }
        }
        
        // Execute current strategy
        public boolean check(String str) {
            return strategy.isPalindrome(str);
        }
        
        public String getCurrentStrategyName() {
            return strategy.getStrategyName();
        }
    }
    
    // Utility
    private static String cleanString(String str) {
        if (str == null || str.isEmpty()) return "";
        return str.toLowerCase().replaceAll("[^a-z0-9]", "");
    }
    
    public static void main(String[] args) {
        displayWelcome();
        demonstrateStrategyPattern();
    }
    
    public static void displayWelcome() {
        System.out.println("========================================");
        System.out.println("  WELCOME TO PALINDROME CHECKER APP");
        System.out.println("========================================");
        System.out.println("Use Case 12: Strategy Pattern - Runtime Algorithm Switching");
        System.out.println("========================================");
        System.out.println();
    }
    
    public static void demonstrateStrategyPattern() {
        System.out.println("--- STRATEGY PATTERN FOR RUNTIME ALGORITHM SWITCHING ---");
        System.out.println();
        
        StrategyContext context = new StrategyContext();
        
        String[] testStrings = {
            "racecar",
            "A man, a plan, a canal: Panama",
            "level",
            "hello"
        };
        
        String[] strategies = {"twopointer", "stack", "deque", "reverse", "recursive"};
        
        for (String strategyName : strategies) {
            context.switchStrategy(strategyName);
            System.out.println();
            
            for (String str : testStrings) {
                boolean result = context.check(str);
                String status = result ? "✓" : "✗";
                System.out.println("  " + status + " \"" + str + "\"");
            }
            System.out.println();
        }
    }
}
