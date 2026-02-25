public class UC4_CharArrayPalindrome {
    
    public static void main(String[] args) {
        displayWelcome();
        checkPalindromeUsingCharArray();
    }
    
    // UC1: Welcome Message Module
    public static void displayWelcome() {
        System.out.println("========================================");
        System.out.println("  WELCOME TO PALINDROME CHECKER APP");
        System.out.println("========================================");
        System.out.println("Use Case 4: Character Array Based Palindrome Check");
        System.out.println("========================================");
        System.out.println();
    }
    
    // UC4: Character Array Based Palindrome Check
    public static void checkPalindromeUsingCharArray() {
        System.out.println("--- CHARACTER ARRAY METHOD ---");
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
            boolean isPalindrome = isPalindromeUsingCharArray(str);
            String result = isPalindrome ? "✓ PALINDROME" : "✗ NOT PALINDROME";
            System.out.println("\"" + str + "\" -> " + result);
        }
        
        System.out.println();
    }
    
    // Method 2: Using Character Array
    public static boolean isPalindromeUsingCharArray(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        
        String cleaned = str.toLowerCase().replaceAll("[^a-z0-9]", "");
        char[] charArray = cleaned.toCharArray();
        
        int left = 0;
        int right = charArray.length - 1;
        
        while (left < right) {
            if (charArray[left] != charArray[right]) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
}
