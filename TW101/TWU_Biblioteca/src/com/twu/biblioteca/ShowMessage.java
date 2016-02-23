package com.twu.biblioteca;

/**
 * Created by 思念 on 2016/2/22.
 */
public class ShowMessage {

    public static void welcome() {
        System.out.println("Welcome to Biblioteca!");
        mainMenu();
    }

    public static void invalid() {
        System.out.println("Select a valid option!");
        mainMenu();
    }

    public static void successfulCheckout() {
        System.out.println("Thank you! Enjoy the book");
    }

    public static void unSuccessfulCheckout() {
        System.out.println("That book is not available.");
        bookList();
    }

    public static void successfulReturn() {
        System.out.println("Thank you for returning the book.");
    }

    public static void unSuccessfulReturn() {
        System.out.println("That is not a valid book to return.");
        bookList();
    }

    public static void mainMenu() {
        System.out.println("This is a menu");
    }

    public static void bookList() {
        Book bookTemp;
        for(int i=0;i<Book.books.size();i++){
            bookTemp=Book.books.get(i);
            if(bookTemp.isNotCheckedOut())
            System.out.println(bookTemp.getName()+'\t'+bookTemp.getAuthor()+'\t'+bookTemp.getPublishYear());
        }
    }
}
