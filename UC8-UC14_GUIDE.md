# Palindrome Checker App - UC8 to UC14 Implementation Guide

## 📋 Overview
This document covers Use Cases 8–14 (UC8–UC14), which expand the Palindrome Checker App with advanced techniques, design patterns, performance analysis, and a comprehensive final project.

---

## 📊 Quick Reference

| UC  | Name | Topic | Key Concept |
|-----|------|-------|-------------|
| UC8 | Linked List Based | Data Structures | Nodes, pointers, slow/fast techniques |
| UC9 | Recursive | Algorithm Design | Recursion without loops |
| UC10 | Advanced String Cleaning | Preprocessing | Case-insensitive, space-ignored |
| UC11 | OOP Service | Design Pattern | Encapsulation, interfaces, modularity |
| UC12 | Strategy Pattern | Design Pattern | Runtime algorithm switching |
| UC13 | Performance Comparison | Benchmarking | Speed, memory, complexity analysis |
| UC14 | Final Project | Integration | Interactive app with all features |

---

## ✅ Implementations Ready to Run

### UC8: Linked List Based Palindrome Checker
**File:** [UC8/UC8_LinkedListPalindrome.java](UC8/UC8_LinkedListPalindrome.java)

**Features:**
- Custom Node class with next pointer
- Slow and fast pointer technique to find middle of linked list
- Reverse second half of list
- Compare first half with reversed second half

**Algorithm:**
```
1. Build linked list from cleaned string
2. Use slow/fast pointers to find middle
3. Reverse second half using pointer manipulation
4. Compare nodes from start with reversed second half
```

**Run:**
```bash
javac UC8/UC8_LinkedListPalindrome.java
java -cp UC8 UC8_LinkedListPalindrome
```

**Example Output:**
```
"racecar" -> ✓ PALINDROME
"level" -> ✓ PALINDROME
"hello" -> ✗ NOT PALINDROME
```

---

### UC9: Recursive Palindrome Checker
**File:** [UC9/UC9_RecursivePalindrome.java](UC9/UC9_RecursivePalindrome.java)

**Features:**
- Pure recursive implementation
- No loops - only function calls
- Base case: pointers meet or cross
- Recursive case: move pointers inward

**Algorithm:**
```
recursiveCheck(left, right):
    if left >= right:
        return true              // Base case
    if str[left] != str[right]:
        return false             // Mismatch
    return recursiveCheck(++left, --right)  // Recurse
```

**Run:**
```bash
javac UC9/UC9_RecursivePalindrome.java
java -cp UC9 UC9_RecursivePalindrome
```

**Complexity:**
- Time: O(n)
- Space: O(n) due to call stack

---

### UC10: Case-Insensitive & Space-Ignored Check
**File:** [UC10/UC10_AdvancedStringCleaning.java](UC10/UC10_AdvancedStringCleaning.java)

**Features:**
- Advanced string preprocessing
- Remove all non-alphanumeric characters
- Case-insensitive comparison
- Handles punctuation, spaces, special symbols

**Cleaning Rules:**
1. Convert to lowercase
2. Remove all non-[a-z0-9] characters using regex
3. Compare cleaned version

**Example:**
```
"A man, a plan, a canal: Panama"
   ↓ clean
"amanaplanacanalpanama" -> ✓ PALINDROME
```

**Run:**
```bash
javac UC10/UC10_AdvancedStringCleaning.java
java -cp UC10 UC10_AdvancedStringCleaning
```

---

### UC11: Object-Oriented Palindrome Service
**File:** [UC11/UC11_OOPPalindromeService.java](UC11/UC11_OOPPalindromeService.java)

**Architecture:**
```
PalindromeChecker (Interface)
    ├── TwoPointerChecker
    ├── StringReverseChecker
    └── RecursiveChecker

PalindromeService (Context)
    └── Uses any PalindromeChecker
```

**OOP Principles:**
- Interface-based abstraction
- Encapsulation of logic
- Reusable service layer
- Easy to extend with new strategies

**Run:**
```bash
javac UC11/UC11_OOPPalindromeService.java
java -cp UC11 UC11_OOPPalindromeService
```

**Output:** Demonstrates switching between strategies at runtime

---

### UC12: Strategy Pattern for Palindrome Algorithms
**File:** [UC12/UC12_StrategyPattern.java](UC12/UC12_StrategyPattern.java)

**Design Pattern:**
```
Strategy Interface
    ├── TwoPointerStrategy
    ├── StackStrategy
    ├── DequeStrategy
    ├── ReverseStrategy
    └── RecursiveStrategy

StrategyContext
    └── Switcher that holds current strategy
```

**Features:**
- 5 different strategy implementations
- Strategy registry for lookup
- Runtime switching using key names
- No changes to client code when adding strategies

**Run:**
```bash
javac UC12/UC12_StrategyPattern.java
java -cp UC12 UC12_StrategyPattern
```

**Demonstrates:**
```
Switching to: Two-Pointer Technique
  ✓ "racecar"
  ✗ "hello"

Switching to: Stack-Based Strategy (LIFO)
  ✓ "racecar"
  ✗ "hello"
... (and so on)
```

---

### UC13: Performance Comparison
**File:** [UC13/UC13_PerformanceComparison.java](UC13/UC13_PerformanceComparison.java)

**Features:**
- Automated benchmarking of all 5 methods
- Runs 100,000 iterations per test
- Measures execution time and memory
- Displays complexity analysis table

**Metrics:**
- Total time (nanoseconds)
- Average time per call (microseconds)
- Memory usage
- Time Complexity and Space Complexity comparison

**Run:**
```bash
javac UC13/UC13_PerformanceComparison.java
java -cp UC13 UC13_PerformanceComparison
```

**Sample Output:**
```
Test String: "racecar" (Length: 7)
─────────────────────────────────────────────────────────────────────────────
Two-Pointer          | Avg Time:    0.025 μs | Total:     2500000 ns
Stack (LIFO)         | Avg Time:    0.045 μs | Total:     4500000 ns
Deque                | Avg Time:    0.052 μs | Total:     5200000 ns
String Reverse       | Avg Time:    0.061 μs | Total:     6100000 ns
Recursive            | Avg Time:    0.038 μs | Total:     3800000 ns

╔════════════════════════════╗
║    COMPLEXITY ANALYSIS     ║
├────────────────────────────┤
║ Two-Pointer   │ O(n) │ O(1) ✓ BEST
║ Stack (LIFO)  │ O(n) │ O(n)
║ Deque         │ O(n) │ O(n)
║ String Reverse│ O(n) │ O(n)
║ Recursive     │ O(n) │ O(n)
╚════════════════════════════╝
```

**Recommendation:** Two-Pointer method is MOST EFFICIENT
- ✓ Fastest execution time
- ✓ Minimal memory (O(1) space)
- ✓ Best for production

---

### UC14: Final Project Submission/Review
**File:** [UC14/UC14_FinalProject.java](UC14/UC14_FinalProject.java)

**Features:**
- Interactive menu-driven application
- 7 main options
- Consolidated all UC1–UC13 functionality
- Professional UI with ASCII art

**Menu Options:**
```
1. Check Palindrome (Interactive)
   └─ User enters string, app checks it

2. Run All Use Cases Demo
   └─ Shows all 5 algorithms on sample strings

3. Compare All Methods
   └─ Displays complexity analysis table

4. Select Algorithm
   └─ Switch algorithm at runtime

5. Run Test Suite
   └─ Comprehensive testing of all methods

6. Performance Benchmark
   └─ Benchmark all 5 methods (100k iterations)

7. Exit
   └─ Graceful exit
```

**Run:**
```bash
javac UC14/UC14_FinalProject.java
java -cp UC14 UC14_FinalProject
```

**Interactive Usage:**
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
Enter choice (1-7): 1

Enter string to check: A man, a plan, a canal: Panama

"A man, a plan, a canal: Panama" -> ✓ PALINDROME
```

---

## 🔄 Execution Flow

### Single UC Run:
```bash
javac UC8/UC8_LinkedListPalindrome.java
java -cp UC8 UC8_LinkedListPalindrome
```

### All UCs (8-14):
```bash
# Compile all
javac UC8/UC8_LinkedListPalindrome.java
javac UC9/UC9_RecursivePalindrome.java
javac UC10/UC10_AdvancedStringCleaning.java
javac UC11/UC11_OOPPalindromeService.java
javac UC12/UC12_StrategyPattern.java
javac UC13/UC13_PerformanceComparison.java
javac UC14/UC14_FinalProject.java

# Run any:
java -cp UC8 UC8_LinkedListPalindrome
java -cp UC14 UC14_FinalProject
```

---

## 📈 Learning Progression

**Level 1 (Basics):**
- UC1–UC7: Foundation concepts

**Level 2 (Advanced Techniques):**
- UC8: Data Structure manipulation (Linked List)
- UC9: Recursion mastery

**Level 3 (Data Validation):**
- UC10: Real-world string preprocessing

**Level 4 (Object-Oriented Design):**
- UC11: Service-oriented architecture
- UC12: Design patterns (Strategy)

**Level 5 (Production-Ready):**
- UC13: Performance analysis
- UC14: Full integration & deployment

---

## 🎯 Key Achievements

✅ **UC8** - Demonstrates linked list manipulation and pointer techniques
✅ **UC9** - Proves recursion effectiveness without loops
✅ **UC10** - Shows real-world string cleaning for case-insensitive checks
✅ **UC11** - Implements OOP best practices
✅ **UC12** - Showcases Strategy Pattern for flexible algorithm selection
✅ **UC13** - Provides data-driven performance comparison
✅ **UC14** - Brings everything together in a user-friendly app

---

## 📝 Test Cases Used

**Palindromes:**
- racecar
- level
- noon
- madam
- 12321
- A man, a plan, a canal: Panama
- Was it a car or a cat I saw?
- Madam, I'm Adam

**Non-Palindromes:**
- hello
- world
- java

---

## 💡 Advanced Concepts Covered

| Concept | UC | Example |
|---------|----|---------| 
| Linked List | UC8 | Building and traversing node-based lists |
| Recursion | UC9 | Recursive palindrome checking |
| Regex | UC10 | Pattern matching for string cleaning |
| Interfaces | UC11 | Contract-based polymorphism |
| Strategy Pattern | UC12 | Runtime algorithm switching |
| Benchmarking | UC13 | Performance measurement |
| Interactive UI | UC14 | Scanner-based user input |

---

## 🚀 Production Readiness Checklist

- ✅ All algorithms implemented
- ✅ Error handling for null/empty strings
- ✅ Consistent API across modules
- ✅ Performance benchmarks available
- ✅ OOP principles applied
- ✅ Design patterns implemented
- ✅ Interactive interface provided
- ✅ Comprehensive test coverage
- ✅ Code comments and documentation
- ✅ Ready for deployment

---

## 📚 References & Resources

**Data Structures:**
- Linked Lists: UC8
- Stack: UC5, UC12
- Queue/Deque: UC6, UC7, UC12

**Algorithms:**
- Two-Pointer Technique: UC2, UC4, UC11–14
- String Reversal: UC3, UC11–14
- Recursion: UC9, UC11–14

**Design Patterns:**
- Strategy Pattern: UC12
- Service Pattern: UC11

**Performance:**
- Big O Analysis: UC13
- Benchmarking: UC13

---

## ✨ Summary

The UC8–UC14 implementations provide a **complete learning journey** from basic data structures to advanced design patterns and production-ready applications. Each UC builds on previous knowledge while introducing new concepts, making it ideal for students and professionals.

**Recommended Learning Path:**
```
UC1-UC7 (Foundation) 
    ↓
UC8-UC9 (Advanced Techniques)
    ↓
UC10 (Real-World Application)
    ↓
UC11-UC12 (Design Patterns)
    ↓
UC13 (Performance Understanding)
    ↓
UC14 (Full Integration)
```

All implementations are **production-ready**, well-documented, and thoroughly tested. Happy coding! 🎉

