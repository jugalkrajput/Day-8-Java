package com.revision;

public class MultipleCatch {

	public static void main(String[] args) {
		
		try {
		    int a = 10, b = 0;
		    int[] arr = {1, 2};
		    int result = a / b;
		    System.out.println(arr[5]);
		} 
		catch (ArithmeticException e) {
		    System.out.println("Arithmetic error: " + e);
		} 
		catch (ArrayIndexOutOfBoundsException e) {
		    System.out.println("Array error: " + e);
		} 
		catch (Exception e) { 
		    System.out.println("Generic error: " + e);
		}
	}
}
