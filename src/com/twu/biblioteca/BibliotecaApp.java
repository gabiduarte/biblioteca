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
        String userInput = getUserInput();
        String menuResult = menu(userInput);

        menuResult = (menuResult == null) ? UIStrings.MENU_INVALID_OPTION: menuResult;
        System.out.println(menuResult);

        return (userInput.equals("9")) ? null : menuHandler();
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
            return library.checkout(chosenBook);
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