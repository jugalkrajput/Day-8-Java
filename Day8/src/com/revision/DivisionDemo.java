package com.revision;
// Custom exception
class NegativeNumberException extends Exception {
    NegativeNumberException(String message) {
        super(message);
    }
}

public class DivisionDemo {
    
    static int divide(int a, int b) throws ArithmeticException, NegativeNumberException {
        if (a < 0 || b < 0) {
            throw new NegativeNumberException("Negative numbers not allowed: a=" + a + ", b=" + b);
        }
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
    
    public static void main(String[] args) {
        try {
            System.out.println("Result: " + divide(10, 2));   // 5
            System.out.println("Result: " + divide(10, 0));   // Exception
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Error: " + e.getMessage());
        } catch (NegativeNumberException e) {
            System.out.println("Custom Error: " + e.getMessage());
        } finally {
            System.out.println("Division operation completed.");
        }
        
        // Test negative numbers
        try {
            System.out.println("Result: " + divide(-5, 2));
        } catch (ArithmeticException | NegativeNumberException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}