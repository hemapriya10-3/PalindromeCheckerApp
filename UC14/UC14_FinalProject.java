package UC14;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

// UC14: Final Project Submission/Review - Consolidating all features into a final product

public class UC14_FinalProject {
    
    static class PalindromeChecker {
        private String method;
        
        public PalindromeChecker(String method) {
            this.method = method.toLowerCase();
        }
        
        public boolean check(String str) {
            if (str == null || str.isEmpty()) return false;
            
            return switch (method) {
                case "twopointer" -> checkTwoPointer(str);
                case "stack" -> checkStack(str);
                case "deque" -> checkDeque(str);
                case "reverse" -> checkReverse(str);
                case "recursive" -> checkRecursive(str);
                default -> checkTwoPointer(str); // Default
            };
        }
        
        private String cleanString(String str) {
            return str.toLowerCase().replaceAll("[^a-z0-9]", "");
        }
        
        private boolean checkTwoPointer(String str) {
            String cleaned = cleanString(str);
            int left = 0, right = cleaned.length() - 1;
            while (left < right) {
                if (cleaned.charAt(left) != cleaned.charAt(right)) return false;
                left++;
                right--;
            }
            return true;
        }
        
        private boolean checkStack(String str) {
            String cleaned = cleanString(str);
            Stack<Character> stack = new Stack<>();
            int mid = cleaned.length() / 2;
            for (int i = 0; i < mid; i++) stack.push(cleaned.charAt(i));
            int startIdx = (cleaned.length() % 2 == 0) ? mid : mid + 1;
            for (int i = startIdx; i < cleaned.length(); i++) {
                if (stack.pop() != cleaned.charAt(i)) return false;
            }
            return true;
        }
        
        private boolean checkDeque(String str) {
            String cleaned = cleanString(str);
            Deque<Character> deque = new LinkedList<>();
            for (char c : cleaned.toCharArray()) deque.add(c);
            while (deque.size() > 1) {
                if (!deque.removeFirst().equals(deque.removeLast())) return false;
            }
            return true;
        }
        
        private boolean checkReverse(String str) {
            String cleaned = cleanString(str);
            String reversed = new StringBuilder(cleaned).reverse().toString();
            return cleaned.equals(reversed);
        }
        
        private boolean checkRecursive(String str) {
            String cleaned = cleanString(str);
            return recursiveHelper(cleaned, 0, cleaned.length() - 1);
        }
        
        private boolean recursiveHelper(String str, int left, int right) {
            if (left >= right) return true;
            if (str.charAt(left) != str.charAt(right)) return false;
            return recursiveHelper(str, left + 1, right - 1);
        }
    }
    
    static class PalindromeApp {
        private PalindromeChecker checker;
        private Scanner scanner;
        
        public PalindromeApp() {
            this.scanner = new Scanner(System.in);
            this.checker = new PalindromeChecker("twopointer");
        }
        
        public void run() {
            displayBanner();
            
            boolean running = true;
            while (running) {
                displayMenu();
                String choice = scanner.nextLine().trim();
                
                running = handleMenuChoice(choice);
            }
            
            System.out.println("\n✓ Thank you for using Palindrome Checker App!");
            scanner.close();
        }
        
        private void displayBanner() {
            System.out.println("\n╔══════════════════════════════════════════════════════════════╗");
            System.out.println("║       PALINDROME CHECKER APP - FINAL PROJECT (UC14)          ║");
            System.out.println("║         All 14 Use Cases Consolidated                       ║");
            System.out.println("╚══════════════════════════════════════════════════════════════╝\n");
        }
        
        private void displayMenu() {
            System.out.println("\n┌─────────────────────────────────────────┐");
            System.out.println("│           MAIN MENU                     │");
            System.out.println("├─────────────────────────────────────────┤");
            System.out.println("│ 1. Check Palindrome (Interactive)       │");
            System.out.println("│ 2. Run All Use Cases Demo               │");
            System.out.println("│ 3. Compare All Methods                  │");
            System.out.println("│ 4. Select Algorithm                     │");
            System.out.println("│ 5. Run Test Suite                       │");
            System.out.println("│ 6. Performance Benchmark                │");
            System.out.println("│ 7. Exit                                 │");
            System.out.println("└─────────────────────────────────────────┘");
            System.out.print("Enter choice (1-7): ");
        }
        
        private boolean handleMenuChoice(String choice) {
            return switch (choice) {
                case "1" -> {
                    interactiveCheck();
                    yield true;
                }
                case "2" -> {
                    runAllUseCasesDemo();
                    yield true;
                }
                case "3" -> {
                    compareAllMethods();
                    yield true;
                }
                case "4" -> {
                    selectAlgorithm();
                    yield true;
                }
                case "5" -> {
                    runTestSuite();
                    yield true;
                }
                case "6" -> {
                    benchmarkPerformance();
                    yield true;
                }
                case "7" -> false;
                default -> {
                    System.out.println("✗ Invalid choice. Please try again.");
                    yield true;
                }
            };
        }
        
        private void interactiveCheck() {
            System.out.print("\nEnter string to check: ");
            String input = scanner.nextLine().trim();
            
            if (input.isEmpty()) {
                System.out.println("✗ Empty string not allowed.");
                return;
            }
            
            boolean result = checker.check(input);
            String status = result ? "✓ PALINDROME" : "✗ NOT PALINDROME";
            System.out.println("\n\"" + input + "\" -> " + status);
        }
        
        private void runAllUseCasesDemo() {
            System.out.println("\n╔══════════════════════════════════════════════════════════════╗");
            System.out.println("║            ALL USE CASES DEMONSTRATION                      ║");
            System.out.println("╚══════════════════════════════════════════════════════════════╝\n");
            
            String[] samples = {
                "racecar",
                "A man, a plan, a canal: Panama",
                "level",
                "hello",
                "Was it a car or a cat I saw?",
                "12321"
            };
            
            String[] algorithms = {"twopointer", "stack", "deque", "reverse", "recursive"};
            
            for (String algo : algorithms) {
                PalindromeChecker checker = new PalindromeChecker(algo);
                System.out.println("Method: " + algo.toUpperCase());
                for (String sample : samples) {
                    boolean result = checker.check(sample);
                    String status = result ? "✓" : "✗";
                    System.out.println("  " + status + " \"" + sample + "\"");
                }
                System.out.println();
            }
        }
        
        private void compareAllMethods() {
            System.out.println("\n╔══════════════════════════════════────────────────────────────╗");
            System.out.println("║          ALGORITHM COMPARISON MATRIX                        ║");
            System.out.println("╚══════════════════════════════════════════════════════════════╝\n");
            
            String[] methods = {"twopointer", "stack", "deque", "reverse", "recursive"};
            String[] complexity = {
                "Time: O(n) | Space: O(1)  ✓ BEST",
                "Time: O(n) | Space: O(n)",
                "Time: O(n) | Space: O(n)",
                "Time: O(n) | Space: O(n)",
                "Time: O(n) | Space: O(n)"
            };
            
            for (int i = 0; i < methods.length; i++) {
                System.out.printf("%-15s -> %s\n", methods[i], complexity[i]);
            }
        }
        
        private void selectAlgorithm() {
            System.out.println("\nAvailable Algorithms:");
            System.out.println("  1. twopointer");
            System.out.println("  2. stack");
            System.out.println("  3. deque");
            System.out.println("  4. reverse");
            System.out.println("  5. recursive");
            System.out.print("Select algorithm (enter name): ");
            
            String algo = scanner.nextLine().trim().toLowerCase();
            this.checker = new PalindromeChecker(algo);
            System.out.println("✓ Algorithm switched to: " + algo);
        }
        
        private void runTestSuite() {
            System.out.println("\n╔══════════════════════════════════════════════════════════════╗");
            System.out.println("║            COMPREHENSIVE TEST SUITE                         ║");
            System.out.println("╚══════════════════════════════════════════════════════════════╝\n");
            
            String[] testCases = {
                "racecar",
                "level",
                "A man, a plan, a canal: Panama",
                "Was it a car or a cat I saw?",
                "12321",
                "hello",
                "world",
                "Madam, I'm Adam"
            };
            
            String[] methods = {"twopointer", "stack", "deque", "reverse", "recursive"};
            int passed = 0, failed = 0;
            
            for (String method : methods) {
                PalindromeChecker checker = new PalindromeChecker(method);
                System.out.println("Testing: " + method);
                
                for (String test : testCases) {
                    boolean result = checker.check(test);
                    System.out.println("  " + (result ? "✓" : "✗") + " " + test);
                    if (result) passed++; else failed++;
                }
                System.out.println();
            }
            
            System.out.printf("Total Tests: %d | Passed: %d | Failed: %d\n", 
                passed + failed, passed, failed);
        }
        
        private void benchmarkPerformance() {
            System.out.println("\nRunning benchmark (100,000 iterations)...");
            
            String testString = "A man, a plan, a canal: Panama";
            String[] methods = {"twopointer", "stack", "deque", "reverse", "recursive"};
            int iterations = 100000;
            
            System.out.println("\n" + "─".repeat(60));
            for (String method : methods) {
                PalindromeChecker checker = new PalindromeChecker(method);
                
                long startTime = System.nanoTime();
                for (int i = 0; i < iterations; i++) {
                    checker.check(testString);
                }
                long endTime = System.nanoTime();
                
                long totalTime = endTime - startTime;
                double avgTime = totalTime / (double) iterations;
                
                System.out.printf("%-15s: %.3f μs per call (%.2f ms total)\n", 
                    method, avgTime / 1000.0, totalTime / 1_000_000.0);
            }
            System.out.println("─".repeat(60));
        }
    }
    
    public static void main(String[] args) {
        PalindromeApp app = new PalindromeApp();
        app.run();
    }
}
