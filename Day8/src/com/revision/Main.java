package com.revision;

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