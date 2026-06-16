🚀 Day 8 – Exception Handling
==============================
Aaj ka topic Exception Handling hai – Java mein errors ko gracefully handle karna. Isse aapka program crash nahi hoga aur user ko meaningful message milega.

🔹 1. What is Exception?
--------------------------
Exception ek unexpected event hai jo program ke execution ke dauran hota hai. Jaise:

Divide by zero → ArithmeticException

Array index out of bound → ArrayIndexOutOfBoundsException

Null pointer access → NullPointerException

Without exception handling:
----------------------------

Example
--------

int a = 10, b = 0;

int result = a / b;  // Program crashes here

System.out.println("This won't print");

With exception handling:
--------------------------

Example
--------

try {

    int a = 10, b = 0;

    int result = a / b;

} 

catch (ArithmeticException e) {

    System.out.println("Cannot divide by zero!");

}

System.out.println("Program continues...");

🔹 2. try-catch-finally
------------------------
Syntax:
-------

try {
    // Risky code
} catch (ExceptionType e) {
    // Handle exception
} finally {
    // Always executes (optional)
}

Multiple catch blocks:
-----------------------

Example
--------

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

catch (Exception e) {  // parent catch should be last

    System.out.println("Generic error: " + e);

}

🔹 4. throw keyword
====================
Manually exception throw karna.
	
Example
--------
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

🔹 5. Custom Exception
=======================
Apna khud ka exception class banao by extending Exception (checked) or RuntimeException (unchecked).

Example
--------
// Custom checked exception

class InsufficientFundsException extends Exception {

    InsufficientFundsException(String message) {

        super(message);

    }

}

class BankAccount {

    double balance;
    

    BankAccount(double balance) {

        this.balance = balance;

    }
    
    void withdraw(double amount) throws InsufficientFundsException {

        if (amount > balance) {

            throw new InsufficientFundsException("Balance: " + balance + ", Withdraw: " + amount);

        }

        balance -= amount;

        System.out.println("Withdrawn: " + amount);

    }

}


public class Main {

    public static void main(String[] args) {

        BankAccount acc = new BankAccount(1000);

        try {

            acc.withdraw(1500);

        } catch (InsufficientFundsException e) {

            System.out.println("Error: " + e.getMessage());

        }

    }

}
