# Palindrome Checker App - Complete Implementation (UC1-UC14)

A comprehensive Java application demonstrating **14 different use cases** for checking palindromes, progressing from basic algorithms to advanced design patterns and performance analysis.

---

## 📁 Project Structure

```
PalindromeCheckerApp/
├── UC1/                          # Welcome Message Module
│   └── UC1_PalindromeChecker.java
├── UC2/                          # Hardcoded Palindrome Check
│   └── UC2_PalindromeChecker.java
├── UC3/                          # String Reverse Method
│   └── UC3_StringReversePalindrome.java
├── UC4/                          # Character Array Method
│   └── UC4_CharArrayPalindrome.java
├── UC5/                          # Stack-Based (LIFO) Method
│   └── UC5_StackPalindrome.java
├── UC6/                          # Queue + Stack Hybrid Method
│   └── UC6_QueueStackPalindrome.java
├── UC7/                          # Deque-Based Optimized Method
│   └── UC7_DequePalindrome.java
├── UC8/                          # Linked List Based (NEW)
│   └── UC8_LinkedListPalindrome.java
├── UC9/                          # Recursive Palindrome Checker (NEW)
│   └── UC9_RecursivePalindrome.java
├── UC10/                         # Advanced String Cleaning (NEW)
│   └── UC10_AdvancedStringCleaning.java
├── UC11/                         # OOP Palindrome Service (NEW)
│   └── UC11_OOPPalindromeService.java
├── UC12/                         # Strategy Pattern (NEW)
│   └── UC12_StrategyPattern.java
├── UC13/                         # Performance Comparison (NEW)
│   └── UC13_PerformanceComparison.java
├── UC14/                         # Final Project (NEW)
│   └── UC14_FinalProject.java
├── src/                          # Original combined version
│   └── PalindromeCheckerApp.java
├── RUN_UC8_UC14.bat              # Execution script for UC8-14
├── UC8-UC14_GUIDE.md             # Detailed guide for UC8-14
└── README.md
```

---

## 🎯 Use Cases Summary

### **Foundation (UC1-UC7)**
Basic algorithms and data structures

| UC  | Name | Method | Complexity |
|-----|------|--------|-----------|
| UC1 | Welcome Message | - | - |
| UC2 | Hardcoded Check | Two-Pointer | O(n) / O(1) |
| UC3 | String Reverse | StringBuilder | O(n) / O(n) |
| UC4 | Char Array | Two-Pointer Array | O(n) / O(n) |
| UC5 | Stack | LIFO Structure | O(n) / O(n) |
| UC6 | Queue+Stack | Hybrid | O(n) / O(n) |
| UC7 | Deque | Double-Ended | O(n) / O(n) |

### **Advanced (UC8-UC14)** ⭐ NEW
Advanced techniques, design patterns, and analysis

| UC  | Name | Focus | Key Features |
|-----|------|-------|--------------|
| UC8 | Linked List | Data Structures | Slow/fast pointers, node manipulation |
| UC9 | Recursive | Algorithm Design | Pure recursion, no loops |
| UC10 | String Cleaning | Preprocessing | Real-world cleanup, case-insensitive |
| UC11 | OOP Service | Design Pattern | Interfaces, encapsulation, modularity |
| UC12 | Strategy Pattern | Runtime Switching | 5 strategies with context switching |
| UC13 | Performance | Benchmarking | Speed, memory, complexity analysis |
| UC14 | Final Project | Integration | Interactive menu & all features |

---

## ✅ Quick Start

### Option 1: Run the Automated Script
```bash
cd PalindromeCheckerApp
RUN_UC8_UC14.bat
```

This opens an interactive menu where you can:
- Run individual UC8-UC14 demos
- Run all exercises in sequence
- View the detailed guide
- Exit

### Option 2: Manual Compilation & Execution

#### Compile UC8-UC14:
```bash
cd PalindromeCheckerApp

javac UC8/UC8_LinkedListPalindrome.java
javac UC9/UC9_RecursivePalindrome.java
javac UC10/UC10_AdvancedStringCleaning.java
javac UC11/UC11_OOPPalindromeService.java
javac UC12/UC12_StrategyPattern.java
javac UC13/UC13_PerformanceComparison.java
javac UC14/UC14_FinalProject.java
```

#### Run Each:
```bash
java -cp . UC8.UC8_LinkedListPalindrome
java -cp . UC9.UC9_RecursivePalindrome
java -cp . UC10.UC10_AdvancedStringCleaning
java -cp . UC11.UC11_OOPPalindromeService
java -cp . UC12.UC12_StrategyPattern
java -cp . UC13.UC13_PerformanceComparison
java -cp . UC14.UC14_FinalProject
```

---

## 📝 Detailed Use Case Documentation

### UC8: Linked List Based Palindrome Checker
**Topic:** Working with nodes and pointers

**Features:**
- Custom Node class with `next` pointer
- Slow and fast pointer technique (tortoise & hare)
- In-place linked list reversal
- Compare method for node-based structures

**Key Concepts:**
- Pointer manipulation
- Linear time traversal
- Memory-efficient linked structures

**Run:**
```bash
java -cp . UC8.UC8_LinkedListPalindrome
```

**Example:**
```
"racecar" -> ✓ PALINDROME
"A man, a plan, a canal: Panama" -> ✓ PALINDROME (with cleaning)
```

---

### UC9: Recursive Palindrome Checker
**Topic:** Implementing logic without loops using recursion

**Features:**
- Pure recursive implementation
- No loops - only recursive calls
- Base case when pointers meet/cross
- Elegant, functional approach

**Key Concepts:**
- Recursion vs iteration
- Stack-based control flow
- Base case design

**Run:**
```bash
java -cp . UC9.UC9_RecursivePalindrome
```

**Algorithm:**
```java
isPalindromeRecursive(left, right):
    if left >= right: return true           // Base case
    if str[left] != str[right]: return false // Mismatch
    return isPalindromeRecursive(left+1, right-1)  // Recurse
```

---

### UC10: Case-Insensitive & Space-Ignored Check
**Topic:** Advanced string preprocessing and data cleaning

**Features:**
- Regex pattern matching for cleaning
- Case-insensitive comparison
- Remove all non-alphanumeric characters
- Real-world data preprocessing

**Key Concepts:**
- Regular expressions
- String manipulation
- Data validation

**Run:**
```bash
java -cp . UC10.UC10_AdvancedStringCleaning
```

**Example:**
```
Input:  "A man, a plan, a canal: Panama"
Clean:  "amanaplanacanalpanama"
Result: ✓ PALINDROME
```

---

### UC11: Object-Oriented Palindrome Service
**Topic:** Refactoring code into modular, reusable services

**Architecture:**
```
┌─────────────────────────────────────────┐
│      PalindromeService (Context)        │
├─────────────────────────────────────────┤
│ Uses: PalindromeChecker (Interface)     │
├─────────────────────────────────────────┤
│  ├─ TwoPointerChecker                   │
│  ├─ StringReverseChecker                │
│  └─ RecursiveChecker                    │
└─────────────────────────────────────────┘
```

**OOP Principles:**
- Encapsulation of algorithms
- Interface-based abstraction
- Service layer pattern
- Easy extension

**Run:**
```bash
java -cp . UC11.UC11_OOPPalindromeService
```

---

### UC12: Strategy Pattern for Palindrome Algorithms
**Topic:** Design Patterns to swap algorithms at runtime

**Features:**
- 5 different strategy implementations
- Strategy registry and lookup
- Runtime algorithm switching
- No code modification needed

**Strategies:**
1. Two-Pointer Technique
2. Stack-Based (LIFO)
3. Deque-Based (Double-Ended)
4. String Reverse
5. Recursive

**Run:**
```bash
java -cp . UC12.UC12_StrategyPattern
```

**Output:**
```
Switching to: Two-Pointer Technique
  ✓ "racecar"
  ✗ "hello"

Switching to: Stack-Based Strategy (LIFO)
  ✓ "racecar"
  ✗ "hello"
... (more strategies)
```

---

### UC13: Performance Comparison
**Topic:** Benchmarking different methods for speed and memory

**Features:**
- Automated benchmarking of all 5 methods
- 100,000 iterations per test
- Time and memory measurements
- Complexity analysis table

**Metrics:**
- Total execution time (nanoseconds)
- Average time per call (microseconds)
- Theoretical complexity (Big O)

**Run:**
```bash
java -cp . UC13.UC13_PerformanceComparison
```

**Sample Output:**
```
Method             │ Time Complexity │ Space Complexity
────────────────────┼─────────────────┼──────────────────
Two-Pointer        │ O(n)            │ O(1)  ✓ BEST
Stack (LIFO)       │ O(n)            │ O(n)
Deque              │ O(n)            │ O(n)
String Reverse     │ O(n)            │ O(n)
Recursive          │ O(n)            │ O(n) stack depth
```

**RECOMMENDATION:** Two-Pointer method is **MOST EFFICIENT**
- ✓ Fastest execution
- ✓ No extra memory (O(1) space)
- ✓ Best for production

---

### UC14: Final Project Submission/Review
**Topic:** Consolidating all features into a final product

**Features:**
- Interactive menu-driven application
- All UC1-UC13 functionality included
- Professional user interface
- Runtime algorithm selection

**Menu Options:**
```
1. Check Palindrome (Interactive)
   → User enters string, app checks it

2. Run All Use Cases Demo
   → Shows all 5 algorithms on samples

3. Compare All Methods
   → Displays complexity comparison table

4. Select Algorithm
   → Switch algorithm at runtime

5. Run Test Suite
   → Comprehensive testing

6. Performance Benchmark
   → Run 100k iteration benchmarks

7. Exit
   → Graceful shutdown
```

**Run:**
```bash
java -cp . UC14.UC14_FinalProject
```

**Interactive Example:**
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

### Using the Script:
```
1. Run RUN_UC8_UC14.bat
2. Choose option (1-8)
3. View output
4. Press to continue
5. Back to menu
```

### Quick Compile All:
```bash
for /R "UC%i" %%G in (*.java) do javac "%%G"
```

### Test All UC8-14:
```bash
java -cp . UC8.UC8_LinkedListPalindrome
java -cp . UC9.UC9_RecursivePalindrome
java -cp . UC10.UC10_AdvancedStringCleaning
java -cp . UC11.UC11_OOPPalindromeService
java -cp . UC12.UC12_StrategyPattern
java -cp . UC13.UC13_PerformanceComparison
java -cp . UC14.UC14_FinalProject
```

---

## 📊 Comparison Table

| Feature | UC1-7 | UC8-14 |
|---------|-------|--------|
| Basic Algorithms | ✅ | ✅ |
| Data Structures | Limited | Advanced (LinkedList) |
| Recursion | ❌ | ✅ (UC9) |
| String Preprocessing | Basic | Advanced (UC10) |
| OOP Principles | ❌ | ✅ (UC11) |
| Design Patterns | ❌ | ✅ (UC12) |
| Performance Analysis | ❌ | ✅ (UC13) |
| Interactive UI | ❌ | ✅ (UC14) |
| Difficulty | Beginner | Intermediate-Advanced |

---

## 💡 Key Concepts Covered

### Data Structures
- Arrays and Strings (UC2-10)
- Stacks (UC5, UC12)
- Queues (UC6)
- Deques (UC7, UC12)
- Linked Lists (UC8)

### Algorithm Techniques
- Two-Pointer Approach (UC2, UC4, UC8)
- String Reversal (UC3, UC12)
- Recursion (UC9, UC12)
- Stack-based Processing (UC5, UC12)
- Deque-based Processing (UC7, UC12)

### Software Engineering
- OOP Principles (UC11)
- Design Patterns (UC12)
- Performance Analysis (UC13)
- User Interface Design (UC14)
- Testing & Benchmarking (UC13)

### Regular Expressions
- Pattern Matching (UC10)
- String Cleaning (UC10)

---

## 🚀 Production Readiness

- ✅ All algorithms implemented & tested
- ✅ Error handling for edge cases
- ✅ Consistent API design
- ✅ Performance benchmarks available
- ✅ OOP best practices applied
- ✅ Design patterns implemented
- ✅ Professional UI provided
- ✅ Comprehensive documentation
- ✅ Code comments throughout
- ✅ Ready for deployment

---

## 📚 Learning Path

**Beginner:**
```
UC1 (Welcome) → UC2 (Hardcoded) → UC3-4 (Simple Methods)
```

**Intermediate:**
```
UC5-7 (Data Structures) → UC8 (LinkedList) → UC9 (Recursion)
```

**Advanced:**
```
UC10 (Preprocessing) → UC11 (OOP) → UC12 (Patterns)
```

**Professional:**
```
UC13 (Performance) → UC14 (Full Integration)
```

---

## 🎓 Test Cases

**Palindromes:**
- racecar
- level
- noon
- madam
- 12321
- A man, a plan, a canal: Panama
- Was it a car or a cat I saw?
- Madam, I'm Adam
- No 'x' in Nixon

**Non-Palindromes:**
- hello
- world
- java
- hello world

---

## 📖 Additional Resources

- **UC8-UC14_GUIDE.md** - Detailed implementation guide
- **RUN_UC8_UC14.bat** - Interactive execution script
- Code comments in each file
- Example test cases included

---

## ✨ Summary

This comprehensive Palindrome Checker App provides a **complete learning journey** from basic algorithms to production-ready applications. With **14 use cases**, it covers:

- ✅ Fundamental programming concepts
- ✅ Advanced data structures
- ✅ Design patterns
- ✅ Performance analysis
- ✅ Professional software engineering

Perfect for learning, teaching, or portfolio demonstration!

---

## 👤 Author
Created as a comprehensive educational project demonstrating progression from basic to advanced Java concepts.

**All code is production-ready, well-documented, and thoroughly tested.** 🎉

