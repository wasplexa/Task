package com.company;

public class Book {
    private int id;
    private String name;
    private String author;
    private int age;
    private String publish;

    public Book(int id, String name, String author, int age, String publish) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.age = age;
        this.publish = publish;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", age=" + age +
                ", publish='" + publish + '\'' +
                '}';
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPublish() {
        return publish;
    }

    public void setPublish(String publish) {
        this.publish = publish;
    }

    public static void main(String[] args) {

    }
}
