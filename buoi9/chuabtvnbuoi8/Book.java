package vn.com.t3h.buoi9.chuabtvnbuoi8;

import java.util.Scanner;

public abstract class Book {
    private int id;
    private String title;
    private String author;
    private int year;
    public Book(int id, String title, String author, int year) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
    }
    public Book() {

    }
    public void displayInfo() {
        System.out.println("ID: " + this.id);
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Year: " + this.year);
    }

    public void inputInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ID: ");
        id = sc.nextInt();
        System.out.println("Title: ");
        title = sc.nextLine();
        System.out.println("Author: ");
        author = sc.nextLine();
        System.out.println("Year: ");
        year = sc.nextInt();

    }
}
