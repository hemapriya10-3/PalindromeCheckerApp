// UC10: Case-Insensitive & Space-Ignored Check - Advanced string preprocessing and data cleaning

public class UC10_AdvancedStringCleaning {
    
    public static void main(String[] args) {
        displayWelcome();
        checkPalindromeWithAdvancedCleaning();
    }
    
    // UC1: Welcome Message Module
    public static void displayWelcome() {
        System.out.println("========================================");
        System.out.println("  WELCOME TO PALINDROME CHECKER APP");
        System.out.println("========================================");
        System.out.println("Use Case 10: Case-Insensitive & Space-Ignored Checker");
        System.out.println("========================================");
        System.out.println();
    }
    
    // UC10: Case-Insensitive & Space-Ignored Palindrome Checker
    public static void checkPalindromeWithAdvancedCleaning() {
        System.out.println("--- ADVANCED STRING CLEANING METHOD ---");
        System.out.println();
        
        String[] testStrings = {
            "A man, a plan, a canal: Panama",
            "race car",
            "Was it a car or a cat I saw?",
            "Madam, I'm Adam",
            "hello world",
            "No 'x' in Nixon",
            "12321"
        };
        
        for (String str : testStrings) {
            boolean isPalindrome = isPalindromeWithAdvancedCleaning(str);
            String result = isPalindrome ? "✓ PALINDROME" : "✗ NOT PALINDROME";
            System.out.println("\"" + str + "\" -> " + result);
        }
        
        System.out.println();
    }
    
    // Method: Advanced string preprocessing (case-insensitive, remove spaces, punctuation, special chars)
    public static boolean isPalindromeWithAdvancedCleaning(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        
        // Clean string: lowercase, remove spaces, special characters, keep only alphanumeric
        String cleaned = cleanString(str);
        
        if (cleaned.isEmpty()) {
            return false;
        }
        
        // Two-pointer approach
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
    
    // Advanced string cleaning helper
    private static String cleanString(String str) {
        // Step 1: Convert to lowercase
        str = str.toLowerCase();
        
        // Step 2: Remove all non-alphanumeric characters and spaces
        // Keep only letters (a-z) and digits (0-9)
        str = str.replaceAll("[^a-z0-9]", "");
        
        return str;
    }
    
    // Alternative: More detailed cleaning statistics
    public static void analyzeAndCheck(String str) {
        System.out.println("Analyzing: \"" + str + "\"");
        
        System.out.print("  Original length: " + str.length());
        String cleaned = cleanString(str);
        System.out.println(" -> Cleaned length: " + cleaned.length());
        
        System.out.println("  Cleaned string: \"" + cleaned + "\"");
        
        boolean isPalindrome = isPalindromeWithAdvancedCleaning(str);
        System.out.println("  Result: " + (isPalindrome ? "✓ PALINDROME" : "✗ NOT PALINDROME"));
        System.out.println();
    }
}
