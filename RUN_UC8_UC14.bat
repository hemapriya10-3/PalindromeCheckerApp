@echo off
REM ========================================
REM  PALINDROME CHECKER APP - COMPILATION & TEST SCRIPT
REM  Compiles and runs UC8 through UC14
REM ========================================

setlocal enabledelayedexpansion

echo.
echo ╔══════════════════════════════════════════════════════════════╗
echo ║     PALINDROME CHECKER APP - COMPILATION & TEST SCRIPT      ║
echo ║           Use Cases 8 through 14 (UC8-UC14)                ║
echo ╚══════════════════════════════════════════════════════════════╝
echo.

REM Check if we're in the right directory
if not exist "UC8\UC8_LinkedListPalindrome.java" (
    echo ✗ Error: UC8 file not found. Please run this script from the PalindromeCheckerApp directory.
    pause
    exit /b 1
)

REM Create a status variable
set "all_success=true"

REM ========================================
REM  STEP 1: COMPILATION
REM ========================================
echo [STEP 1] COMPILING ALL USE CASES...
echo.

for %%i in (8 9 10 11 12 13 14) do (
    echo Compiling UC%%i...
    javac UC%%i\UC%%i_*.java 2>&1
    if errorlevel 1 (
        echo ✗ UC%%i compilation FAILED
        set "all_success=false"
    ) else (
        echo ✓ UC%%i compiled successfully
    )
)

echo.
if "!all_success!"=="false" (
    echo ✗ Some compilations failed. Exiting.
    pause
    exit /b 1
)

echo ✓ All compilations successful!
echo.
echo ─────────────────────────────────────────────────────────────
echo.

REM ========================================
REM  STEP 2: DISPLAY MENU
REM ========================================
:menu
cls
echo.
echo ╔══════════════════════════════════════════════════════════════╗
echo ║      PALINDROME CHECKER APP - EXECUTION MENU (UC8-14)       ║
echo ╚══════════════════════════════════════════════════════════════╝
echo.
echo [1] Run UC8  - Linked List Based Palindrome Checker
echo [2] Run UC9  - Recursive Palindrome Checker
echo [3] Run UC10 - Case-Insensitive & Space-Ignored Check
echo [4] Run UC11 - Object-Oriented Palindrome Service
echo [5] Run UC12 - Strategy Pattern for Palindrome Algorithms
echo [6] Run UC13 - Performance Comparison
echo [7] Run UC14 - Final Project (Interactive)
echo.
echo [8] Run ALL (8-14) Demos in Sequence
echo [9] View Implementation Guide (UC8-UC14_GUIDE.md)
echo [0] Exit
echo.
set /p choice="Enter your choice (0-9): "

if "!choice!"=="0" goto exit_script
if "!choice!"=="1" goto run_uc8
if "!choice!"=="2" goto run_uc9
if "!choice!"=="3" goto run_uc10
if "!choice!"=="4" goto run_uc11
if "!choice!"=="5" goto run_uc12
if "!choice!"=="6" goto run_uc13
if "!choice!"=="7" goto run_uc14
if "!choice!"=="8" goto run_all
if "!choice!"=="9" goto view_guide

echo ✗ Invalid choice. Please try again.
pause
goto menu

REM ========================================
REM  INDIVIDUAL UC EXECUTION
REM ========================================
:run_uc8
cls
echo.
echo ╔══════════════════════════════════════════════════════════════╗
echo ║  UC8: LINKED LIST BASED PALINDROME CHECKER                  ║
echo ║  Topic: Working with nodes and pointers                     ║
echo ╚══════════════════════════════════════════════════════════════╝
echo.
java -cp . UC8.UC8_LinkedListPalindrome
echo.
pause
goto menu

:run_uc9
cls
echo.
echo ╔══════════════════════════════════════════════════════════════╗
echo ║  UC9: RECURSIVE PALINDROME CHECKER                          ║
echo ║  Topic: Implementing logic without loops using recursion    ║
echo ╚══════════════════════════════════════════════════════════════╝
echo.
java -cp . UC9.UC9_RecursivePalindrome
echo.
pause
goto menu

:run_uc10
cls
echo.
echo ╔══════════════════════════════════════════════════════════════╗
echo ║  UC10: CASE-INSENSITIVE & SPACE-IGNORED CHECK              ║
echo ║  Topic: Advanced string preprocessing and data cleaning    ║
echo ╚══════════════════════════════════════════════════════════════╝
echo.
java -cp . UC10.UC10_AdvancedStringCleaning
echo.
pause
goto menu

:run_uc11
cls
echo.
echo ╔══════════════════════════════════════════════════════════════╗
echo ║  UC11: OBJECT-ORIENTED PALINDROME SERVICE                   ║
echo ║  Topic: Refactoring code into modular, reusable services    ║
echo ╚══════════════════════════════════════════════════════════════╝
echo.
java -cp . UC11.UC11_OOPPalindromeService
echo.
pause
goto menu

:run_uc12
cls
echo.
echo ╔══════════════════════════════════════════════════════════════╗
echo ║  UC12: STRATEGY PATTERN FOR PALINDROME ALGORITHMS           ║
echo ║  Topic: Design Patterns to swap algorithms at runtime       ║
echo ╚══════════════════════════════════════════════════════════════╝
echo.
java -cp . UC12.UC12_StrategyPattern
echo.
pause
goto menu

:run_uc13
cls
echo.
echo ╔══════════════════════════════════════════════════════════════╗
echo ║  UC13: PERFORMANCE COMPARISON                               ║
echo ║  Topic: Benchmarking different methods for speed/memory     ║
echo ╚══════════════════════════════════════════════════════════════╝
echo.
java -cp . UC13.UC13_PerformanceComparison
echo.
pause
goto menu

:run_uc14
cls
echo.
echo ╔══════════════════════════════════════════════════════════════╗
echo ║  UC14: FINAL PROJECT SUBMISSION/REVIEW                      ║
echo ║  Topic: Consolidating all features into a final product     ║
echo ╚══════════════════════════════════════════════════════════════╝
echo.
java -cp . UC14.UC14_FinalProject
echo.
pause
goto menu

:run_all
cls
echo.
echo ╔══════════════════════════════════════════════════════════════╗
echo ║          RUNNING ALL USE CASES (8-14) DEMOS                 ║
echo ║           Press a key between each demo...                   ║
echo ╚══════════════════════════════════════════════════════════════╝
echo.

for %%i in (8 9 10 11 12 13) do (
    echo Running UC%%i...
    echo.
    java -cp . UC%%i.UC%%i_* 2>nul
    echo.
    echo Press any key to continue to next use case...
    pause >nul
    cls
)

echo Running UC14 (Final Project - Interactive)...
echo.
java -cp . UC14.UC14_FinalProject

goto menu

:view_guide
cls
if exist "UC8-UC14_GUIDE.md" (
    more UC8-UC14_GUIDE.md
) else (
    echo ✗ UC8-UC14_GUIDE.md not found!
)
pause
goto menu

:exit_script
echo.
echo ✓ Thank you for using Palindrome Checker App!
echo.
exit /b 0

endlocal
