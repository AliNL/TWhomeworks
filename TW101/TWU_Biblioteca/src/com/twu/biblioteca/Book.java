package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 思念 on 2016/2/22.
 */
public class Book {
    public static List<Book> books = new ArrayList<Book>();
    private String name, author, publishYear;
    private boolean notCheckedOut;

    public Book(String name, String author, String publishYear) {
        this.name = name;
        this.author = author;
        this.publishYear = publishYear;
        this.notCheckedOut = true;
        books.add(this);
    }

    public String getName() {
        return this.name;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getPublishYear() {
        return this.publishYear;
    }

    public  boolean isNotCheckedOut(){return notCheckedOut;}

    public boolean checkOut() {
        if (this.notCheckedOut)
            this.notCheckedOut = false;
        else
            return false;
        return true;
    }

    public boolean returnBook() {
        if (!this.notCheckedOut)
            notCheckedOut = true;
        else
            return false;
        return true;
    }
}
