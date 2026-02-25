// UC11: Object-Oriented Palindrome Service - Refactoring code into modular, reusable services

public class UC11_OOPPalindromeService {
    
    // Abstraction: Interface for palindrome checking strategies
    interface PalindromeChecker {
        boolean check(String str);
        String getMethodName();
    }
    
    // Strategy 1: Simple two-pointer approach
    static class TwoPointerChecker implements PalindromeChecker {
        @Override
        public boolean check(String str) {
            if (str == null || str.isEmpty()) return false;
            
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
        public String getMethodName() {
            return "Two-Pointer Approach";
        }
    }
    
    // Strategy 2: String reverse approach
    static class StringReverseChecker implements PalindromeChecker {
        @Override
        public boolean check(String str) {
            if (str == null || str.isEmpty()) return false;
            
            String cleaned = cleanString(str);
            String reversed = new StringBuilder(cleaned).reverse().toString();
            return cleaned.equals(reversed);
        }
        
        @Override
        public String getMethodName() {
            return "String Reverse Approach";
        }
    }
    
    // Strategy 3: Recursive approach
    static class RecursiveChecker implements PalindromeChecker {
        @Override
        public boolean check(String str) {
            if (str == null || str.isEmpty()) return false;
            
            String cleaned = cleanString(str);
            return checkRecursive(cleaned, 0, cleaned.length() - 1);
        }
        
        private boolean checkRecursive(String str, int left, int right) {
            if (left >= right) return true;
            if (str.charAt(left) != str.charAt(right)) return false;
            return checkRecursive(str, left + 1, right - 1);
        }
        
        @Override
        public String getMethodName() {
            return "Recursive Approach";
        }
    }
    
    // Service: Main palindrome service
    static class PalindromeService {
        private PalindromeChecker checker;
        
        public PalindromeService(PalindromeChecker checker) {
            this.checker = checker;
        }
        
        public void setChecker(PalindromeChecker checker) {
            this.checker = checker;
        }
        
        public boolean checkPalindrome(String str) {
            return checker.check(str);
        }
        
        public String getCheckerName() {
            return checker.getMethodName();
        }
        
        public void printResult(String str) {
            boolean result = checkPalindrome(str);
            String status = result ? "✓ PALINDROME" : "✗ NOT PALINDROME";
            System.out.println("\"" + str + "\" -> " + status);
        }
    }
    
    // Utility: String cleaning helper
    private static String cleanString(String str) {
        return str.toLowerCase().replaceAll("[^a-z0-9]", "");
    }
    
    public static void main(String[] args) {
        displayWelcome();
        demonstrateOOPService();
    }
    
    public static void displayWelcome() {
        System.out.println("========================================");
        System.out.println("  WELCOME TO PALINDROME CHECKER APP");
        System.out.println("========================================");
        System.out.println("Use Case 11: Object-Oriented Palindrome Service");
        System.out.println("========================================");
        System.out.println();
    }
    
    public static void demonstrateOOPService() {
        System.out.println("--- OBJECT-ORIENTED DESIGN PATTERN ---");
        System.out.println();
        
        String[] testStrings = {
            "racecar",
            "A man, a plan, a canal: Panama",
            "level",
            "hello",
            "madam",
            "world"
        };
        
        // Create service with two-pointer checker
        PalindromeService service = new PalindromeService(new TwoPointerChecker());
        
        System.out.println("Using Strategy: " + service.getCheckerName());
        System.out.println();
        
        for (String str : testStrings) {
            service.printResult(str);
        }
        
        System.out.println();
        
        // Switch to different strategy at runtime
        System.out.println("Switching to Strategy: String Reverse Approach");
        System.out.println();
        
        service.setChecker(new StringReverseChecker());
        
        for (String str : testStrings) {
            service.printResult(str);
        }
        
        System.out.println();
        
        // Switch to recursive strategy
        System.out.println("Switching to Strategy: Recursive Approach");
        System.out.println();
        
        service.setChecker(new RecursiveChecker());
        
        for (String str : testStrings) {
            service.printResult(str);
        }
        
        System.out.println();
    }
}
