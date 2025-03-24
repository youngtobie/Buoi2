package vn.com.t3h.buoi8.btvn;

import vn.com.t3h.buoi7.btvn.Zoo;

import java.util.Scanner;

public abstract class Book {
    private int id;
    private String title;
    private int year;
    private String author;

    public Book() {

    }
    public Book(int id, String title, int year, String author) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.author = author;
    }
    public void displayInfo() {
        System.out.println("+_----------------------_+");
        System.out.println("ID: " + this.id);
        System.out.println("Title: " + this.title);
        System.out.println("Year: " + this.year);
        System.out.println("Author: " + this.author);
    }
    public void inputInfo() {
        System.out.println("Nhập id: ");
        this.id = new Scanner(System.in).nextInt();
        System.out.println("Nhập title: ");
        this.title = new Scanner(System.in).nextLine();
        System.out.println("Nhập year: ");
        this.year = new Scanner(System.in).nextInt();
        System.out.println("Author: ");
        this.author = new Scanner(System.in).nextLine();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
