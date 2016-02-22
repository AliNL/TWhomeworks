package com.twu.biblioteca;

/**
 * Created by 思念 on 2016/2/22.
 */
public class ShowMessage {

    public void welcome() {
        System.out.println("Welcome to Biblioteca!");
    }

    public void invalid() {
        System.out.println("Select a valid option!");
    }

    public void successfulCheckout() {
        System.out.println("Thank you! Enjoy the book");
    }

    public void unSuccessfulCheckout() {
        System.out.println("That book is not available.");
    }

    public void successfulReturn() {
        System.out.println("Thank you for returning the book.");
    }

    public void unSuccessfulReturn() {
        System.out.println("That is not a valid book to return.");
    }

    public void mainMenu() {
        System.out.println();
    }
}
