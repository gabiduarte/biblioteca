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
        return library.showBooks();
    }

    public void run() {
        library.createBookShelf();
        System.out.println(welcome());

        menuHandler();
    }

    private Object menuHandler() {
        System.out.println(UIStrings.MENU_OPTIONS);
        String userInput = menu(getUserInput());

        if (userInput == null) {
            System.out.println(UIStrings.MENU_INVALID_OPTION);
        } else {
            System.out.println(userInput);
        }

        return menuHandler();
    }

    public String menu(String option) {
        if (option.equals("1")) {
            return showLibraryBooks();
        }

        if (option.equals("2")) {
            System.out.println(UIStrings.CHECKOUT_MENU);
            Integer bookID;

            try {
                bookID = Integer.parseInt(getUserInput());
            } catch (NumberFormatException e) {
                return null;
            }

            Book chosenBook = library.searchBook(bookID);
            library.checkout(chosenBook);

            return UIStrings.CHECKOUT_SUCCESS;
        }

        if (option.equals("9")) {
            return UIStrings.MENU_QUIT;
        }
        return null;
    }

    private String getUserInput() {
        Scanner reader = new Scanner(System.in);
        return reader.next();
    }
}