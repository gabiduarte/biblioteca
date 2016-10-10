package com.twu.biblioteca;

import java.util.Scanner;

public class BibliotecaApp {
    private Library library = new Library();

    public static void main(String[] args) {
        BibliotecaApp app = new BibliotecaApp();
        app.run();
    }

    public String welcome() {
        return UIStrings.WELCOME_MESSAGE;
    }

    public String showLibraryBooks() {
        //TODO: createBookShelf is called also inside run. The test breaks without this bit below.
        library.createBookShelf();
        return library.showBooks();
    }

    private void run() {
        library.createBookShelf();

        System.out.println(welcome());
        System.out.println(UIStrings.MENU_OPTIONS);

        Scanner reader = new Scanner(System.in);
        String userOption = reader.next();

        System.out.println(menu(userOption));
        while(menu(userOption) == null) {
            System.out.println(UIStrings.MENU_INVALID_OPTION);
            userOption = reader.next();
        }
    }

    public String menu(String option) {
        if (option.equals("1")) {
            return showLibraryBooks();
        }

        if (option.equals("9")) {
            return UIStrings.MENU_QUIT;
        }
        return null;
    }
}