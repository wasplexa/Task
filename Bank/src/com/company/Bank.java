package com.company;


import java.util.ArrayList;
import java.util.Collections;

public class Bank {
    private ArrayList<Customer> customers;

    public Bank(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public void sortByName() {
        for (int i = 0; i < customers.size(); i++) {
            Collections.sort(customers, new Customer.sortingBySurname());
        }
        System.out.println(customers);
    }

    public void printByCard(int a, int b) {
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getNumberOfCard() >= a && customers.get(i).getNumberOfCard() <= b) {
                System.out.println(customers.get(i));
            }
        }
    }
}
