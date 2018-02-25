package com.twu.biblioteca;

import com.twu.biblioteca.data.Menu;
import com.twu.biblioteca.util.InputHelper;


public class Controller {

    public void showMainMenu() {
        System.out.println("----Welcome to Biblioteca Application----");
        while (true) {
            for (int i = 0; i < Menu.mainMenu.length; i++) {
                System.out.println((i + 1) + ". " + Menu.mainMenu[i]);
            }
            int i = InputHelper.getInstance().getNum();
            choose(i);
        }
    }

    private void choose(int i) {
        switch (i) {
            case Menu.LISTBOOK:
                showBookList();
                break;
            case Menu.QUIT:
                quit();
            default:
                System.out.println("Select a valid option!");
        }
    }

    private void quit() {
        System.out.println("Quit Success!");
        System.exit(0);
    }

    private void showBookList() {

    }
}
