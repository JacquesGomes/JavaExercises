package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bank {
    private Map<Integer, Customer> customers;
    private int lastCustomerId;

    public Bank() {
        this.customers = new HashMap<>();
        this.lastCustomerId = 0;
    }

    public Customer addCustomer(String name){
        Customer customer = new Customer(++lastCustomerId, name);
        customers.put(lastCustomerId, customer);
        return customer;
    }

    public Customer getCustomer(int customerId){
        return customers.getOrDefault(customerId, null);
    }

    public void transferMoney(Account fromAccount, Account toAccount,
                              double amount){
        if(fromAccount != null && toAccount != null){
            fromAccount.withdraw(amount);
            toAccount.deposit(amount);
        }
    }

    public void listCustomers(){
        System.out.println("List of Customers:");
        for(Customer customer : customers.values()){
            System.out.println("Customer ID: " + customer.getCustomerId() +
                    ", Name: " + customer.getName());
        }
    }






}
