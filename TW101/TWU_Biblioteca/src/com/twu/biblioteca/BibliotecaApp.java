package com.twu.biblioteca;

import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {
        ShowMessage.welcome();
        AddBooks.addBooks();
        Scanner scanner = new Scanner(System.in);
        String option = scanner.nextLine();
        while (!option.contains( "quit")) {
            controller(option);
            option = scanner.nextLine();
        }
    }


    public static int controller(String option) {

        return SUCCESSFUL;
    }

    public static boolean findBook(String bookName){
        return true;
    }

    public static final int SUCCESSFUL = 0;
}
