package UC13;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

// UC13: Performance Comparison - Benchmarking different methods for speed and memory

public class UC13_PerformanceComparison {
    
    interface PalindromeMethod {
        boolean check(String str);
        String getName();
    }
    
    // Method 1: Two-Pointer
    static class TwoPointerMethod implements PalindromeMethod {
        @Override
        public boolean check(String str) {
            String cleaned = cleanString(str);
            int left = 0, right = cleaned.length() - 1;
            while (left < right) {
                if (cleaned.charAt(left) != cleaned.charAt(right)) return false;
                left++;
                right--;
            }
            return true;
        }
        
        @Override
        public String getName() { return "Two-Pointer"; }
    }
    
    // Method 2: Stack
    static class StackMethod implements PalindromeMethod {
        @Override
        public boolean check(String str) {
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
        
        @Override
        public String getName() { return "Stack (LIFO)"; }
    }
    
    // Method 3: Deque
    static class DequeMethod implements PalindromeMethod {
        @Override
        public boolean check(String str) {
            String cleaned = cleanString(str);
            Deque<Character> deque = new LinkedList<>();
            for (char c : cleaned.toCharArray()) deque.add(c);
            while (deque.size() > 1) {
                if (!deque.removeFirst().equals(deque.removeLast())) return false;
            }
            return true;
        }
        
        @Override
        public String getName() { return "Deque"; }
    }
    
    // Method 4: Reverse
    static class ReverseMethod implements PalindromeMethod {
        @Override
        public boolean check(String str) {
            String cleaned = cleanString(str);
            String reversed = new StringBuilder(cleaned).reverse().toString();
            return cleaned.equals(reversed);
        }
        
        @Override
        public String getName() { return "String Reverse"; }
    }
    
    // Method 5: Recursive
    static class RecursiveMethod implements PalindromeMethod {
        @Override
        public boolean check(String str) {
            String cleaned = cleanString(str);
            return checkRecursive(cleaned, 0, cleaned.length() - 1);
        }
        
        private boolean checkRecursive(String str, int left, int right) {
            if (left >= right) return true;
            if (str.charAt(left) != str.charAt(right)) return false;
            return checkRecursive(str, left + 1, right - 1);
        }
        
        @Override
        public String getName() { return "Recursive"; }
    }
    
    // Performance benchmark
    static class Benchmark {
        private PalindromeMethod method;
        private String testString;
        private int iterations;
        
        public Benchmark(PalindromeMethod method, String testString, int iterations) {
            this.method = method;
            this.testString = testString;
            this.iterations = iterations;
        }
        
        public BenchmarkResult run() {
            long startMem = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
            long startTime = System.nanoTime();
            
            for (int i = 0; i < iterations; i++) {
                method.check(testString);
            }
            
            long endTime = System.nanoTime();
            long endMem = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
            
            long duration = endTime - startTime;
            long memUsed = endMem - startMem;
            double avgTime = duration / (double) iterations / 1000.0; // microseconds
            
            return new BenchmarkResult(method.getName(), duration, memUsed, avgTime);
        }
    }
    
    static class BenchmarkResult {
        String methodName;
        long totalTime; // nanoseconds
        long memoryUsed;
        double avgTimePerCall; // microseconds
        
        BenchmarkResult(String methodName, long totalTime, long memoryUsed, double avgTimePerCall) {
            this.methodName = methodName;
            this.totalTime = totalTime;
            this.memoryUsed = memoryUsed;
            this.avgTimePerCall = avgTimePerCall;
        }
        
        @Override
        public String toString() {
            return String.format("%-20s | Avg Time: %8.3f μs | Total: %10d ns",
                methodName, avgTimePerCall, totalTime);
        }
    }
    
    private static String cleanString(String str) {
        if (str == null || str.isEmpty()) return "";
        return str.toLowerCase().replaceAll("[^a-z0-9]", "");
    }
    
    public static void main(String[] args) {
        displayWelcome();
        performanceComparison();
    }
    
    public static void displayWelcome() {
        System.out.println("========================================");
        System.out.println("  WELCOME TO PALINDROME CHECKER APP");
        System.out.println("========================================");
        System.out.println("Use Case 13: Performance Comparison & Benchmarking");
        System.out.println("========================================");
        System.out.println();
    }
    
    public static void performanceComparison() {
        System.out.println("--- PERFORMANCE BENCHMARKING ---");
        System.out.println();
        
        // Test cases with different sizes
        String[] testCases = {
            "racecar",
            "A man, a plan, a canal: Panama",
            "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
        };
        
        PalindromeMethod[] methods = {
            new TwoPointerMethod(),
            new StackMethod(),
            new DequeMethod(),
            new ReverseMethod(),
            new RecursiveMethod()
        };
        
        for (String testStr : testCases) {
            System.out.println("Test String: \"" + (testStr.length() > 50 ? testStr.substring(0, 50) + "..." : testStr) + "\" (Length: " + testStr.length() + ")");
            System.out.println("─".repeat(80));
            
            int iterations = 100000;
            
            for (PalindromeMethod method : methods) {
                Benchmark bench = new Benchmark(method, testStr, iterations);
                BenchmarkResult result = bench.run();
                System.out.println(result);
            }
            
            System.out.println();
        }
        
        // Complexity Analysis
        System.out.println("╔══════════════════════════════════════════════════════════════╗");
        System.out.println("║              COMPLEXITY ANALYSIS                             ║");
        System.out.println("╠══════════════════════════════════════════════════════════════╣");
        System.out.println("║ Method             │ Time Complexity │ Space Complexity       ║");
        System.out.println("├────────────────────┼─────────────────┼──────────────────────┤");
        System.out.println("║ Two-Pointer        │ O(n)            │ O(1)  ✓ BEST         ║");
        System.out.println("║ Stack (LIFO)       │ O(n)            │ O(n)                 ║");
        System.out.println("║ Deque              │ O(n)            │ O(n)                 ║");
        System.out.println("║ String Reverse     │ O(n)            │ O(n)                 ║");
        System.out.println("║ Recursive          │ O(n)            │ O(n) stack depth     ║");
        System.out.println("╚══════════════════════════════════════════════════════════════╝");
        System.out.println();
        
        System.out.println("RECOMMENDATION: Two-Pointer method is MOST EFFICIENT");
        System.out.println("  ✓ Fastest execution time");
        System.out.println("  ✓ No extra memory allocation (O(1) space)");
        System.out.println("  ✓ Best for production code");
        System.out.println();
    }
}
