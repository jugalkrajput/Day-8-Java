package com.revision;
public class ExceptionDemo {
    
	public static void main(String[] args) {
    
		try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);  
        } 
		catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds!");
            System.out.println("Error message: " + e.getMessage());
        } 
		finally {
            System.out.println("This always runs");
        }
        
		System.out.println("Program continues...");
    }
}