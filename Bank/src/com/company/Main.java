package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();
        Customer customer1 = new Customer("Aer", "Alex", "Gfb", 2345);
        Customer customer2 = new Customer("Aer", "Bob", "Cer", 1234);
        Customer customer3 = new Customer("Aer", "Alex", "Ber", 4567);
        Customer customer4 = new Customer("Aer", "Me", "Mer", 3456);
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        customers.add(customer4);
        Bank bank = new Bank(customers);
        bank.sortByName();
        bank.printByCard(1000, 3000);
    }
}
