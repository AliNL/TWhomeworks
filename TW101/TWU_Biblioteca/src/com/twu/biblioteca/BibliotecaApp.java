package com.twu.biblioteca;

import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {
        ShowMessage show = new ShowMessage();
        show.welcome();
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        while (option != QUIT) {
            controller(option);
            option = scanner.nextInt();
        }
    }


    public static int controller(int option) {
        switch(option){
            case 1:
                
        }

        return SUCCESSFUL;
    }
    public static final int QUIT = 0;
    public static final int SUCCESSFUL = 0;
}
