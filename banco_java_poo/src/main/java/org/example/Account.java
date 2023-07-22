package org.example;

public class Account implements IAccount{
    private int accountNumber;
    protected double balance;
    private Customer owner;

    public Account(int accountNumber, Customer owner) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
        this.owner = owner;
    }

    @Override
    public double getBalance() {
        return this.balance;
    }

    @Override
    public void deposit(double amount){
        this.balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if(amount <= this.balance){
            this.balance -= amount;
        } else{
            System.out.println("Insufficient balance.");
        }
    }
}
