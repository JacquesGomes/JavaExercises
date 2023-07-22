package org.example;

public class SavingsAccount extends Account{
    private double interestRate;

    public SavingsAccount(int accountNumber, Customer owner,
                          double interestRate){
        super(accountNumber, owner);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return this.interestRate;
    }



}
