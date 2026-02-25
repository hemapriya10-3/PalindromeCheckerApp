package UC8;

public class UC8_LinkedListPalindrome {
    
    static class Node {
        char data;
        Node next;
        
        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }
    
    public static void main(String[] args) {
        displayWelcome();
        checkPalindromeUsingLinkedList();
    }
    
    // UC1: Welcome Message Module
    public static void displayWelcome() {
        System.out.println("========================================");
        System.out.println("  WELCOME TO PALINDROME CHECKER APP");
        System.out.println("========================================");
        System.out.println("Use Case 8: Linked List-Based Palindrome Checker");
        System.out.println("========================================");
        System.out.println();
    }
    
    // UC8: Linked List-Based Palindrome Checker
    public static void checkPalindromeUsingLinkedList() {
        System.out.println("--- LINKED LIST-BASED METHOD ---");
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
            boolean isPalindrome = isPalindromeUsingLinkedList(str);
            String result = isPalindrome ? "✓ PALINDROME" : "✗ NOT PALINDROME";
            System.out.println("\"" + str + "\" -> " + result);
        }
        
        System.out.println();
    }
    
    // Method: Using Linked List with two-pointer (slow/fast pointer technique)
    public static boolean isPalindromeUsingLinkedList(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        
        String cleaned = str.toLowerCase().replaceAll("[^a-z0-9]", "");
        
        // Build linked list
        Node head = buildLinkedList(cleaned);
        
        // Find middle using slow and fast pointers
        Node slow = head;
        Node fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // Reverse second half
        Node secondHalf = reverseLinkedList(slow);
        
        // Compare first half with reversed second half
        Node first = head;
        Node second = secondHalf;
        
        while (second != null) { // second half is shorter or equal
            if (first.data != second.data) {
                return false;
            }
            first = first.next;
            second = second.next;
        }
        
        return true;
    }
    
    // Helper: Build linked list from string
    private static Node buildLinkedList(String str) {
        if (str.isEmpty()) return null;
        Node head = new Node(str.charAt(0));
        Node current = head;
        
        for (int i = 1; i < str.length(); i++) {
            current.next = new Node(str.charAt(i));
            current = current.next;
        }
        
        return head;
    }
    
    // Helper: Reverse linked list (modifies original list)
    private static Node reverseLinkedList(Node head) {
        Node prev = null;
        Node current = head;
        
        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        
        return prev;
    }
}
