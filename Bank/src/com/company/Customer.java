package com.company;

import java.util.Comparator;

public class Customer {

    private int id;
    private String surname;
    private String name;
    private String middleName;
    private String address;
    private int numberOfCard;
    private int numberOfBank;
    public static int idOfPerson;

    public Customer(int id, String surname, String name, String middleName, String address, int numberOfCard, int numberOfBank) {
        id=idOfPerson++;
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.address = address;
        this.numberOfCard = numberOfCard;
        this.numberOfBank = numberOfBank;
    }

    public Customer(String surname, String name, String middleName, int numberOfCard) {
        id=idOfPerson++;
        this.middleName = middleName;
        this.surname = surname;
        this.name = name;
        this.numberOfCard = numberOfCard;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", middleName='" + middleName + '\'' +
                ", address='" + address + '\'' +
                ", numberOfCard=" + numberOfCard +
                ", numberOfBank=" + numberOfBank +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberOfCard() {
        return numberOfCard;
    }

    public void setNumberOfCard(int numberOfCard) {
        this.numberOfCard = numberOfCard;
    }

    public int getNumberOfBank() {
        return numberOfBank;
    }

    public void setNumberOfBank(int numberOfBank) {
        this.numberOfBank = numberOfBank;
    }

    public  static class sortingBySurname implements Comparator <Customer> {


        @Override
        public int compare(Customer o1, Customer o2) {
            if (o1.surname != o2.surname) {
                return o1.surname.compareTo(o2.surname);
            }
            if (o1.name != o2.name) {
                return o1.name.compareTo(o2.name);
            }
            return o1.middleName.compareTo(o2.middleName);
        }
    }
}
