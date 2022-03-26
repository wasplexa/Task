package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Book1 book1 = new Book1(1, "first", "Igor", 1965, "Minsk");
        Book1 book2 = new Book1(2, "second", "Maxim", 1970, "Moskow");
        Book1 book3 = new Book1(3, "third", "Alex", 1421, "Minsk");
        List<Book1> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        Library1 library = new Library1(books);
        library.printBookByPublish("Minsk");
        System.out.println();
        library.printBookByID(2);
        System.out.println();
        library.printBookByYear(1500);

    }
}
