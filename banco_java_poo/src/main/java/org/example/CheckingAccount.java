package org.example;

public class CheckingAccount extends Account{
    private double overdraftLimit;

    public CheckingAccount(int accountNumber, Customer owner, double overdraftLimit) {
        super(accountNumber, owner);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        double availableBalance = getBalance() + overdraftLimit;
        if (amount <= availableBalance) {
            super.withdraw(amount);
        } else {
            System.out.println("Insufficient balance. Overdraft limit exceeded.");
        }
    }
}
