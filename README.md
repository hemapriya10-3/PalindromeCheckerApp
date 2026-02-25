# Palindrome Checker App

A Java application demonstrating 7 different approaches to check if strings are palindromes.

## 📁 Project Structure

```
PalindromeCheckerApp/
├── UC1/                          # Use Case 1 - Welcome Message Module
│   └── UC1_PalindromeChecker.java
├── UC2/                          # Use Case 2 - Hardcoded Palindrome Check
│   └── UC2_PalindromeChecker.java
├── UC3/                          # Use Case 3 - String Reverse Method
│   └── UC3_StringReversePalindrome.java
├── UC4/                          # Use Case 4 - Character Array Method
│   └── UC4_CharArrayPalindrome.java
├── UC5/                          # Use Case 5 - Stack-Based (LIFO) Method
│   └── UC5_StackPalindrome.java
├── UC6/                          # Use Case 6 - Queue + Stack Hybrid Method
│   └── UC6_QueueStackPalindrome.java
├── UC7/                          # Use Case 7 - Deque-Based Optimized Method
│   └── UC7_DequePalindrome.java
├── src/                          # Original combined version
│   └── PalindromeCheckerApp.java
└── README.md
```

---

## 🎯 Use Cases & Methods

### UC1 - Welcome Message Module
**File:** `UC1/UC1_PalindromeChecker.java`

**GitHub Link:** [UC1 File](https://github.com/hemapriya10-3/PalindromeCheckerApp/blob/develop/UC1/UC1_PalindromeChecker.java)

**Features:** Welcome/Introduction message with application description

**Run:**
```bash
javac UC1/UC1_PalindromeChecker.java
java -cp UC1 UC1_PalindromeChecker
```

---

### UC2 - Hardcoded Palindrome Check
**File:** `UC2/UC2_PalindromeChecker.java`

**GitHub Link:** [UC2 File](https://github.com/hemapriya10-3/PalindromeCheckerApp/blob/develop/UC2/UC2_PalindromeChecker.java)

**Features:** 
- Tests 7 hardcoded strings
- Basic palindrome checking logic

**Run:**
```bash
javac UC2/UC2_PalindromeChecker.java
java -cp UC2 UC2_PalindromeChecker
```

---

### UC3 - String Reverse Method
**File:** `UC3/UC3_StringReversePalindrome.java`

**GitHub Link:** [UC3 File](https://github.com/hemapriya10-3/PalindromeCheckerApp/blob/develop/UC3/UC3_StringReversePalindrome.java)

**Method:** Uses `StringBuilder.reverse()` for comparison

**Algorithm:**
```
1. Clean the string (remove special characters, convert to lowercase)
2. Reverse the cleaned string
3. Compare original with reversed
```

**Run:**
```bash
javac UC3/UC3_StringReversePalindrome.java
java -cp UC3 UC3_StringReversePalindrome
```

---

### UC4 - Character Array Method
**File:** `UC4/UC4_CharArrayPalindrome.java`

**GitHub Link:** [UC4 File](https://github.com/hemapriya10-3/PalindromeCheckerApp/blob/develop/UC4/UC4_CharArrayPalindrome.java)

**Method:** Manual verification using character array with two-pointer approach

**Algorithm:**
```
1. Convert string to character array
2. Use left and right pointers
3. Compare from both ends moving inward
```

**Run:**
```bash
javac UC4/UC4_CharArrayPalindrome.java
java -cp UC4 UC4_CharArrayPalindrome
```

---

### UC5 - Stack-Based Palindrome Checker
**File:** `UC5/UC5_StackPalindrome.java`

**GitHub Link:** [UC5 File](https://github.com/hemapriya10-3/PalindromeCheckerApp/blob/develop/UC5/UC5_StackPalindrome.java)

**Data Structure:** Stack (LIFO - Last In First Out)

**Algorithm:**
```
1. Push first half of string to stack
2. Skip middle character if odd length
3. Pop stack while comparing with second half
```

**Run:**
```bash
javac UC5/UC5_StackPalindrome.java
java -cp UC5 UC5_StackPalindrome
```

---

### UC6 - Queue + Stack Hybrid Method
**File:** `UC6/UC6_QueueStackPalindrome.java`

**GitHub Link:** [UC6 File](https://github.com/hemapriya10-3/PalindromeCheckerApp/blob/develop/UC6/UC6_QueueStackPalindrome.java)

**Data Structures:** Queue (FIFO) + Stack (LIFO)

**Algorithm:**
```
1. Fill Queue (reads forward) and Stack (reads backward) with all characters
2. Poll from Queue and Pop from Stack simultaneously
3. Compare values - if they don't match, not a palindrome
```

**Run:**
```bash
javac UC6/UC6_QueueStackPalindrome.java
java -cp UC6 UC6_QueueStackPalindrome
```

---

### UC7 - Deque-Based Optimized Palindrome Checker
**File:** `UC7/UC7_DequePalindrome.java`

**GitHub Link:** [UC7 File](https://github.com/hemapriya10-3/PalindromeCheckerApp/blob/develop/UC7/UC7_DequePalindrome.java)

**Data Structure:** Deque (Double-Ended Queue)

**Algorithm:**
```
1. Add all characters to Deque
2. Remove from both ends simultaneously
3. Compare left and right values
4. Continue until only 1 or 0 elements remain
```

**Advantage:** Most efficient - removes from both ends in O(1) time

**Run:**
```bash
javac UC7/UC7_DequePalindrome.java
java -cp UC7 UC7_DequePalindrome
```

---

## 📊 Comparison of Methods

| UC# | Method | Data Structure | Time Complexity | Space Complexity | Best Use |
|-----|--------|-----------------|-----------------|------------------|----------|
| UC1 | Welcome Message | - | - | - | Introduction |
| UC2 | Hardcoded | - | O(n) | O(1) | Learning |
| UC3 | String Reverse | String | O(n) | O(n) | Simple, readable |
| UC4 | Char Array | Array | O(n) | O(n) | Educational |
| UC5 | Stack | Stack | O(n) | O(n) | LIFO concept |
| UC6 | Queue + Stack | Queue + Stack | O(n) | O(n) | Combined concept |
| UC7 | Deque | Deque | O(n) | O(n) | **Most efficient** |

---

## 🔗 Direct GitHub Links for Each Use Case

- **UC1:** https://github.com/hemapriya10-3/PalindromeCheckerApp/blob/develop/UC1/UC1_PalindromeChecker.java
- **UC2:** https://github.com/hemapriya10-3/PalindromeCheckerApp/blob/develop/UC2/UC2_PalindromeChecker.java
- **UC3:** https://github.com/hemapriya10-3/PalindromeCheckerApp/blob/develop/UC3/UC3_StringReversePalindrome.java
- **UC4:** https://github.com/hemapriya10-3/PalindromeCheckerApp/blob/develop/UC4/UC4_CharArrayPalindrome.java
- **UC5:** https://github.com/hemapriya10-3/PalindromeCheckerApp/blob/develop/UC5/UC5_StackPalindrome.java
- **UC6:** https://github.com/hemapriya10-3/PalindromeCheckerApp/blob/develop/UC6/UC6_QueueStackPalindrome.java
- **UC7:** https://github.com/hemapriya10-3/PalindromeCheckerApp/blob/develop/UC7/UC7_DequePalindrome.java

---

## 📝 Git Workflow Used

✅ **Feature Branch Strategy:**
- `main` → Production releases
- `develop` → Integration branch
- `feature/UCx` → Individual feature branches

✅ **Each UC followed:**
1. Create feature branch from develop
2. Implement and commit
3. Push feature branch
4. Merge into develop
5. Push develop to GitHub

---

## ✨ All Issues Fixed

✅ Character comparison using `.equals()` instead of `==`
✅ Proper algorithm implementations
✅ All 7 use cases working correctly
✅ Consistent code structure across all files

---

## 👤 Author
**hemapriya10-3**

Repository: https://github.com/hemapriya10-3/PalindromeCheckerApp
