# Quick Reference: UC8-UC14 Commands

---

## 🚀 FASTEST START

### Option 1: Run the Script (Recommended)
```bash
cd c:\Users\vjk51\Desktop\step\PalindromeCheckerApp
RUN_UC8_UC14.bat
```
This opens an interactive menu where you can:
- Choose individual UC to run
- Run all 7 demos in sequence
- View detailed guide
- Exit gracefully

---

## 📋 MANUAL COMMANDS

### Compile All UC8-UC14
```bash
cd c:\Users\vjk51\Desktop\step\PalindromeCheckerApp

javac UC8/UC8_LinkedListPalindrome.java
javac UC9/UC9_RecursivePalindrome.java
javac UC10/UC10_AdvancedStringCleaning.java
javac UC11/UC11_OOPPalindromeService.java
javac UC12/UC12_StrategyPattern.java
javac UC13/UC13_PerformanceComparison.java
javac UC14/UC14_FinalProject.java
```

---

## ▶️ RUN INDIVIDUAL USE CASES

### UC8: Linked List Based Palindrome Checker
```bash
cd c:\Users\vjk51\Desktop\step\PalindromeCheckerApp
javac UC8/UC8_LinkedListPalindrome.java
java -cp . UC8.UC8_LinkedListPalindrome
```

**Output Example:**
```
========================================
  WELCOME TO PALINDROME CHECKER APP
========================================
Use Case 8: Linked List-Based Palindrome Checker
========================================

--- LINKED LIST-BASED METHOD ---

"racecar" -> ✓ PALINDROME
"level" -> ✓ PALINDROME
"hello" -> ✗ NOT PALINDROME
```

---

### UC9: Recursive Palindrome Checker
```bash
cd c:\Users\vjk51\Desktop\step\PalindromeCheckerApp
javac UC9/UC9_RecursivePalindrome.java
java -cp . UC9.UC9_RecursivePalindrome
```

**Output Example:**
```
========================================
  WELCOME TO PALINDROME CHECKER APP
========================================
Use Case 9: Recursive Palindrome Checker
========================================

--- RECURSIVE METHOD (NO LOOPS) ---

"racecar" -> ✓ PALINDROME
"level" -> ✓ PALINDROME
"hello" -> ✗ NOT PALINDROME
```

---

### UC10: Advanced String Cleaning
```bash
cd c:\Users\vjk51\Desktop\step\PalindromeCheckerApp
javac UC10/UC10_AdvancedStringCleaning.java
java -cp . UC10.UC10_AdvancedStringCleaning
```

**Output Example:**
```
========================================
  WELCOME TO PALINDROME CHECKER APP
========================================
Use Case 10: Case-Insensitive & Space-Ignored Checker
========================================

--- ADVANCED STRING CLEANING METHOD ---

"A man, a plan, a canal: Panama" -> ✓ PALINDROME
"race car" -> ✓ PALINDROME
"Was it a car or a cat I saw?" -> ✓ PALINDROME
"hello world" -> ✗ NOT PALINDROME
```

---

### UC11: OOP Palindrome Service
```bash
cd c:\Users\vjk51\Desktop\step\PalindromeCheckerApp
javac UC11/UC11_OOPPalindromeService.java
java -cp . UC11.UC11_OOPPalindromeService
```

**Output Example:**
```
========================================
  WELCOME TO PALINDROME CHECKER APP
========================================
Use Case 11: Object-Oriented Palindrome Service
========================================

--- OBJECT-ORIENTED DESIGN PATTERN ---

Using Strategy: Two-Pointer Approach

"racecar" -> ✓ PALINDROME
"A man, a plan, a canal: Panama" -> ✓ PALINDROME
"level" -> ✓ PALINDROME
"hello" -> ✗ NOT PALINDROME

Switching to Strategy: String Reverse Approach
[... continues with each strategy ...]
```

---

### UC12: Strategy Pattern
```bash
cd c:\Users\vjk51\Desktop\step\PalindromeCheckerApp
javac UC12/UC12_StrategyPattern.java
java -cp . UC12.UC12_StrategyPattern
```

**Output Example:**
```
========================================
  WELCOME TO PALINDROME CHECKER APP
========================================
Use Case 12: Strategy Pattern - Runtime Algorithm Switching
========================================

--- STRATEGY PATTERN FOR RUNTIME ALGORITHM SWITCHING ---

✓ Strategy switched to: Two-Pointer Technique

  ✓ "racecar"
  ✓ "A man, a plan, a canal: Panama"
  ✓ "level"
  ✗ "hello"

[... continues for each strategy ...]
```

---

### UC13: Performance Comparison
```bash
cd c:\Users\vjk51\Desktop\step\PalindromeCheckerApp
javac UC13/UC13_PerformanceComparison.java
java -cp . UC13.UC13_PerformanceComparison
```

**Output Example:**
```
========================================
  WELCOME TO PALINDROME CHECKER APP
========================================
Use Case 13: Performance Comparison & Benchmarking
========================================

--- PERFORMANCE BENCHMARKING ---

Test String: "racecar" (Length: 7)
────────────────────────────────────────────────────────────────────────────
Two-Pointer          | Avg Time:    0.025 μs | Total:     2500000 ns
Stack (LIFO)         | Avg Time:    0.045 μs | Total:     4500000 ns
Deque                | Avg Time:    0.052 μs | Total:     5200000 ns
String Reverse       | Avg Time:    0.061 μs | Total:     6100000 ns
Recursive            | Avg Time:    0.038 μs | Total:     3800000 ns

COMPLEXITY ANALYSIS
════════════════════════════════════════════════════════════════
Method             │ Time Complexity │ Space Complexity       
────────────────────┼─────────────────┼──────────────────────
Two-Pointer        │ O(n)            │ O(1)  ✓ BEST         
Stack (LIFO)       │ O(n)            │ O(n)                 
Deque              │ O(n)            │ O(n)                 
String Reverse     │ O(n)            │ O(n)                 
Recursive          │ O(n)            │ O(n) stack depth     
════════════════════════════════════════════════════════════════

RECOMMENDATION: Two-Pointer method is MOST EFFICIENT
  ✓ Fastest execution time
  ✓ No extra memory allocation (O(1) space)
  ✓ Best for production code
```

---

### UC14: Final Project (Interactive)
```bash
cd c:\Users\vijkdsk\Desktop\step\PalindromeCheckerApp
javac UC14/UC14_FinalProject.java
java -cp . UC14.UC14_FinalProject
```

**Usage:**
```
╔══════════════════════════════════════════════════════════════╗
║       PALINDROME CHECKER APP - FINAL PROJECT (UC14)          ║
║         All 14 Use Cases Consolidated                       ║
╚══════════════════════════════════════════════════════════════╝

┌─────────────────────────────────────────┐
│           MAIN MENU                     │
├─────────────────────────────────────────┤
│ 1. Check Palindrome (Interactive)       │
│ 2. Run All Use Cases Demo               │
│ 3. Compare All Methods                  │
│ 4. Select Algorithm                     │
│ 5. Run Test Suite                       │
│ 6. Performance Benchmark                │
│ 7. Exit                                 │
└─────────────────────────────────────────┘
Enter choice (1-7): 
```

---

## 🔧 BATCH OPERATIONS

### Compile All at Once
```bash
cd c:\Users\vjk51\Desktop\step\PalindromeCheckerApp
for /d %d in (UC*) do javac %d\%d_*.java
```

### Run All Demos (No Menu)
```bash
cd c:\Users\vjk51\Desktop\step\PalindromeCheckerApp

echo Running UC8...
java -cp . UC8.UC8_LinkedListPalindrome
echo.
echo Running UC9...
java -cp . UC9.UC9_RecursivePalindrome
echo.
echo Running UC10...
java -cp . UC10.UC10_AdvancedStringCleaning
echo.
echo Running UC11...
java -cp . UC11.UC11_OOPPalindromeService
echo.
echo Running UC12...
java -cp . UC12.UC12_StrategyPattern
echo.
echo Running UC13...
java -cp . UC13.UC13_PerformanceComparison
echo.
echo Running UC14...
java -cp . UC14.UC14_FinalProject
```

---

## 📚 VIEW DOCUMENTATION

### View UC8-UC14 Guide
```bash
cd c:\Users\vjk51\Desktop\step\PalindromeCheckerApp
notepad UC8-UC14_GUIDE.md

# OR

type UC8-UC14_GUIDE.md | more
```

### View Complete README
```bash
cd c:\Users\vjk51\Desktop\step\PalindromeCheckerApp
notepad README_COMPLETE.md

# OR

type README_COMPLETE.md | more
```

### View Implementation Summary
```bash
cd c:\Users\vjk51\Desktop\step\PalindromeCheckerApp
notepad IMPLEMENTATION_SUMMARY.md

# OR

type IMPLEMENTATION_SUMMARY.md | more
```

---

## ✅ VERIFY INSTALLATIONS

### Check Java Version
```bash
java -version
javac -version
```

**Expected Output:**
```
java version "1.8.0" or higher
javac 1.8.0 or higher
```

### Verify All Files Exist
```bash
cd c:\Users\vjk51\Desktop\step\PalindromeCheckerApp
dir UC8\UC8_LinkedListPalindrome.java
dir UC9\UC9_RecursivePalindrome.java
dir UC10\UC10_AdvancedStringCleaning.java
dir UC11\UC11_OOPPalindromeService.java
dir UC12\UC12_StrategyPattern.java
dir UC13\UC13_PerformanceComparison.java
dir UC14\UC14_FinalProject.java
```

---

## 🎯 TEST STRINGS

### Palindromes (Should print ✓)
```
racecar
level
noon
madam
12321
A man, a plan, a canal: Panama
Was it a car or a cat I saw?
Madam, I'm Adam
No 'x' in Nixon
```

### Non-Palindromes (Should print ✗)
```
hello
world
java
hello world
```

---

## 💡 TROUBLESHOOTING

### Issue: "Could not find or load main class"
**Solution:** Make sure classpath is correct
```bash
# Wrong
java UC8.UC8_LinkedListPalindrome

# Correct
java -cp . UC8.UC8_LinkedListPalindrome
```

### Issue: Compilation errors
**Solution:** Ensure you're in the correct directory
```bash
# Go to project root first
cd c:\Users\vjk51\Desktop\step\PalindromeCheckerApp

# Then compile
javac UC8/UC8_LinkedListPalindrome.java
```

### Issue: Cannot find UC*.java files
**Solution:** Check file structure
```bash
cd c:\Users\vjk51\Desktop\step\PalindromeCheckerApp
dir UC8
dir UC9
# etc...
```

---

## 📊 COMMAND SUMMARY TABLE

| Task | Command |
|------|---------|
| Run Script | `RUN_UC8_UC14.bat` |
| Compile UC8 | `javac UC8/UC8_LinkedListPalindrome.java` |
| Run UC8 | `java -cp . UC8.UC8_LinkedListPalindrome` |
| Compile UC9 | `javac UC9/UC9_RecursivePalindrome.java` |
| Run UC9 | `java -cp . UC9.UC9_RecursivePalindrome` |
| Compile UC10 | `javac UC10/UC10_AdvancedStringCleaning.java` |
| Run UC10 | `java -cp . UC10.UC10_AdvancedStringCleaning` |
| Compile UC11 | `javac UC11/UC11_OOPPalindromeService.java` |
| Run UC11 | `java -cp . UC11.UC11_OOPPalindromeService` |
| Compile UC12 | `javac UC12/UC12_StrategyPattern.java` |
| Run UC12 | `java -cp . UC12.UC12_StrategyPattern` |
| Compile UC13 | `javac UC13/UC13_PerformanceComparison.java` |
| Run UC13 | `java -cp . UC13.UC13_PerformanceComparison` |
| Compile UC14 | `javac UC14/UC14_FinalProject.java` |
| Run UC14 | `java -cp . UC14.UC14_FinalProject` |

---

## 🎉 YOU'RE ALL SET!

All UC8-UC14 implementations are ready to:
- ✅ Compile without errors
- ✅ Execute successfully
- ✅ Demonstrate advanced Java concepts
- ✅ Teach design patterns and algorithms
- ✅ Provide real-world examples

**Start with:** `RUN_UC8_UC14.bat`

**Or manually:** Choose any command from above!

---

**Happy coding!** 🚀

