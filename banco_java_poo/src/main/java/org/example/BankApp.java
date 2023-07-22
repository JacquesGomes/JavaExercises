package org.example;

import java.util.Scanner;

public class BankApp {

    private static int chooseAccount(Customer customer, Scanner scanner) {
        System.out.println("Choose account type:");
        System.out.println("1. Checking Account");
        System.out.println("2. Savings Account");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        return choice;
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the BankApp!");

        while(true){
            System.out.println("\nMenu:");
            System.out.println("1. Add Customer");
            System.out.println("2. View Customer Info");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. Transfer Money");
            System.out.println("6. List All Customers");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            int choice1 = -1;
            int choice2 = -1;

            switch (choice) {
                case 1:
                    scanner.nextLine(); // Consume newline character
                    System.out.print("Enter customer name: ");
                    String customerName = scanner.nextLine();
                    Customer customer = bank.addCustomer(customerName);
                    System.out.println("Customer added! Customer ID: " + customer.getCustomerId());
                    break;

                case 2:
                    System.out.print("Enter customer ID: ");
                    int customerId = scanner.nextInt();
                    Customer targetCustomer = bank.getCustomer(customerId);
                    if (targetCustomer != null) {
                        targetCustomer.getInfo();
                    } else {
                        System.out.println("Customer not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter customer ID: ");
                    int depositCustomerId = scanner.nextInt();
                    Customer depositCustomer = bank.getCustomer(depositCustomerId);

                    choice1 = chooseAccount(depositCustomer, scanner);

                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();

                    if (depositCustomer != null) {

                        if(choice1 == 1){
                            depositCustomer.getCheckingAccount().deposit(depositAmount);
                            System.out.println("Deposit successful. New " +
                                    "checking balance: $" + depositCustomer.getCheckingAccount().getBalance());
                        }else if(choice1 == 2){
                            depositCustomer.getSavingsAccount().deposit(depositAmount);
                            System.out.println("Deposit successful. New " +
                                    "savings balance: $" + depositCustomer.getSavingsAccount().getBalance());
                        }
                        else{
                            System.out.println("Invalid account option");
                            break;
                        }

                    } else {
                        System.out.println("Customer not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter customer ID: ");
                    int withdrawCustomerId = scanner.nextInt();

                    Customer withdrawCustomer = bank.getCustomer(withdrawCustomerId);
                    choice1 = chooseAccount(withdrawCustomer, scanner);

                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();


                    if (withdrawCustomer != null) {
                        if(choice1 == 1){
                            withdrawCustomer.getCheckingAccount().withdraw(withdrawAmount);
                            System.out.println("Withdraw successful. New " +
                                    "checking balance: $" + withdrawCustomer.getCheckingAccount().getBalance());
                        }else if( choice1 == 2){
                            withdrawCustomer.getSavingsAccount().withdraw(withdrawAmount);
                            System.out.println("Withdraw successful. New " +
                                    "savings balance: $" + withdrawCustomer.getSavingsAccount().getBalance());
                        }
                        else{
                            System.out.println("Invalid account option");
                            break;
                        }

                    } else {
                        System.out.println("Customer not found.");
                    }
                    break;

                case 5:
                    System.out.print("Enter customer ID for 'from' account: ");
                    int fromCustomerId = scanner.nextInt();
                    Customer fromCustomer = bank.getCustomer(fromCustomerId);
                    if (fromCustomer != null) {
                        choice1 = chooseAccount(fromCustomer,
                                scanner);
                        if (fromCustomer != null) {

                            System.out.print("Enter customer ID for 'to' account: ");
                            int toCustomerId = scanner.nextInt();
                            Customer toCustomer = bank.getCustomer(toCustomerId);

                            if (toCustomer != null) {
                                choice2 = chooseAccount(toCustomer,
                                        scanner);
                                System.out.print("Enter transfer amount: ");
                                double transferAmount = scanner.nextDouble();

                                if(choice1 == 1){
                                    fromCustomer.getCheckingAccount().withdraw(transferAmount);
                                }else if(choice1 == 2){
                                    fromCustomer.getSavingsAccount().withdraw(transferAmount);

                                }else{
                                    System.out.println("'To' account invalid");
                                }

                                if(choice2 == 1){
                                    toCustomer.getCheckingAccount().deposit(transferAmount);
                                }else if(choice2 == 2){
                                    toCustomer.getSavingsAccount().deposit(transferAmount);
                                }else{
                                    System.out.println("'To' account invalid");
                                }

                                System.out.println("Successful transfer:");
                                toCustomer.getInfo();
                                fromCustomer.getInfo();

                            } else {
                                System.out.println("'To' Customer not found.");
                            }
                        }
                    } else {
                        System.out.println("'From' Customer not found.");
                    }
                    break;


                case 6:
                    bank.listCustomers();
                    break;
                case 7:
                    System.out.println("Thank you for using BankApp! Bye Bye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}