# Java Programming: Laboratory Work 5

This repository contains the solutions for the fifth laboratory work in Java programming. The lab focuses on text processing using Regular Expressions (Regex) with the built-in `java.util.regex.Pattern` and `Matcher` classes.

## Assignment Details
1. **NumberFinder:** Extracts all numbers from a given text string, supporting negative signs and decimal points.
2. **PasswordValidator:** Validates user password input using lookaheads to enforce security rules (8-16 characters, alphanumeric only, at least one uppercase letter, and at least one digit).
3. **CaseHighlighter:** Identifies camelCase boundaries (a lowercase letter followed immediately by an uppercase letter) and highlights them by wrapping the boundary in exclamation marks (e.g., `!aA!`).
4. **IPValidator:** Checks if a user-provided string is a strictly valid IPv4 address (four octets ranging from 0 to 255 separated by dots).
5. **StartingLetterFinder:** Dynamically builds a regex pattern to find and print all words in a text that start with a specific user-defined letter (case-insensitive) utilizing word boundaries (`\b`).

## How to Run

1. Clone this repository and navigate to the project directory.
2. Compile all source files:
   ```bash
   javac *.java
   ```
3. Run the programs individually depending on the task:
   To extract numbers from text:
   ```
   java NumberFinder
   ```
   To validate a password:
   ```
   java PasswordValidator
   ```
   To highlight case boundaries:
   ```
   java CaseHighlighter
   ```
   To validate an IP address:
   ```
   java IPValidator
   ```
   To find words by their starting letter:
   ```
   java StartingLetterFinder
   ```
