package com.twu.biblioteca;

import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {
        ShowMessage show = new ShowMessage();
        show.welcome();
        show.mainMenu();
        Scanner scanner = new Scanner(System.in);
        
    }
}
