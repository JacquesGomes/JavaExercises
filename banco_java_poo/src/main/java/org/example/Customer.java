package org.example;

public class Customer {

    private int customerId;
    private String name;
    private SavingsAccount savingsAccount;
    private CheckingAccount checkingAccount;

    public Customer(int customerId, String name) {
        this.customerId = customerId;
        this.name = name;
        this.savingsAccount = new SavingsAccount(0, this, 0.0); // Initializing savingsAccount with initial values
        this.checkingAccount = new CheckingAccount(0, this, 0.0);
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SavingsAccount getSavingsAccount() {
        return savingsAccount;
    }

    public void setSavingsAccount(SavingsAccount savingsAccount) {
        this.savingsAccount = savingsAccount;
    }

    public CheckingAccount getCheckingAccount() {
        return checkingAccount;
    }

    public void setCheckingAccount(CheckingAccount checkingAccount) {
        this.checkingAccount = checkingAccount;
    }

    public void getInfo(){
        System.out.println("\nName: " + this.name + ", ID: " + this.customerId +
                ", Checking Account: " + this.getCheckingAccount().getBalance() + ", Savings Account: " + this.getSavingsAccount().getBalance());
    }

}
