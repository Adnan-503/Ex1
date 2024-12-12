# Ex1 Project

## Overview
The **Ex1 Project** is a Java-based application that demonstrates working with custom numeric formats, base conversions, and various utility functions. The program includes
functionality to parse numbers from custom string formats, convert them between bases, perform arithmetic operations, and identify the largest number in a given list.
This project emphasizes modular design, input validation, and test-driven development using JUnit. It's suitable for learning about string manipulation, numeric operations, 
and basic algorithm implementation in Java.

## Features

- Custom Numeric Format Support:
  - Supports numbers with a base suffix (e.g., `101b2` for binary, `1A2bG` for base 16).
  - Detects and validates correct numeric formats.

- Base Conversion:
  - Converts numbers between bases ranging from 2 (binary) to 16 (hexadecimal).

- Arithmetic Operations:
  - Calculates the sum and product of two numbers in the specified base.

- Utility Functions:
  - Determines if a string is a valid custom-format number.
  - Finds the maximum number in a list of custom-format numbers.

- Interactive CLI:
  - A user-friendly command-line interface for entering numbers, performing operations, and displaying results.

- JUnit Tests:
  - Comprehensive unit tests ensure the correctness of all implemented methods.
    
Classes

1. Ex1
Contains core utility methods for number parsing, base conversion, and validation:
- `number2Int(String num)`: Converts a custom-format number to an integer.
- `isNumber(String num)`: Validates if a string is in the correct numeric format.
- `int2Number(int num, int base)`: Converts an integer to a custom-format string in the specified base.
- `equals(String n1, String n2)`: Checks if two numbers represent the same value.
- `maxIndex(String[] arr)`: Identifies the index of the largest number in an array.

2. Ex1Main
The main class providing a command-line interface for interacting with the features of the `Ex1` class. Key functionalities include:
- Reading two custom-format numbers from the user.
- Performing arithmetic operations (sum, product) and converting results to a specified base.
- Displaying the largest number from a set of inputs.

3. Ex1Test
A JUnit test class that ensures the functionality of the `Ex1` class with a range of test cases:
- Validates `number2Int`, `isNumber`, and `int2Number` methods.
- Tests edge cases for base conversion and numeric validation.
- Ensures the `maxIndex` function identifies the correct index in various scenarios.


---

## License
This project is released under the MIT License. Feel free to use, modify, and distribute it as needed.

