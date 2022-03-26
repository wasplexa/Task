package com.company;

import java.util.List;

public class Library {
    private List<Book> books;

    public Library(List<Book> books) {
        this.books = books;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void printBookByID(int id) {
        for (int i = 0; i < books.size(); i++) {
            if (id == books.get(i).getId()) {
                System.out.println(books.get(i));
            }
        }
    }
    public void printBookByPublish(String name) {
        for (int i = 0; i < books.size(); i++) {
            if (name.equals(books.get(i).getPublish())) {
                System.out.println(books.get(i));
            }
        }
    }
    public void printBookByYear(int yearPublic) {
        for (int i = 0; i < books.size(); i++) {
            if (yearPublic < books.get(i).getAge()) {
                {
                    System.out.println(books.get(i));
                }
            }
        }
    }
   }