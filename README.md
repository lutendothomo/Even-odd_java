# Even/Odd Checker

A Java console program that tells you whether an integer is even or odd.

## How it works
1. The program prompts the user to enter an integer.
2. It uses the modulus operator (`%`) to find the remainder when the number is divided by 2.
3. If the remainder is 0, the number is even.
4. Otherwise, the number is odd.

## Prerequisites
- JDK 26 (the version I built and tested with)
- Optional: IntelliJ IDEA

## How to run

From the project root (`Even-odd_java`) in PowerShell:

```powershell
javac -d out src\src\main\java\org\example\Main.java
java -cp out org.example.Main
```

## Example usage

```
Please enter any integer :
8
8 is an even Number
```

## Known limitations
- Non-integer input (e.g. `abc` or `3.5`) throws an `InputMismatchException`.
- Numbers outside the `int` range (about ±2.1 billion) are rejected.