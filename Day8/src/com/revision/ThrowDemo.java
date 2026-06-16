package com.revision;

public class ThrowDemo {

	static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18+");
        } 
        else {
            System.out.println("You are eligible");
        }
    }
    
    public static void main(String[] args) {
        try {
            checkAge(15);
        } 
        catch (IllegalArgumentException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}