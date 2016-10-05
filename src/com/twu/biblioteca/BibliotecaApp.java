package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {
        BibliotecaApp app = new BibliotecaApp();

        app.run();
    }

    public String welcome() {
        return UIStrings.WELCOME_MESSAGE;
    }

    public String showLibraryBooks() {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Harry Potter", "JK Rowling", "1998"));
        books.add(new Book("TDD by Example", "Kent Beck", "2003"));

        Library library = new Library(books);
        return library.showBooks();
    }

    private void run() {
        System.out.println(welcome());
        System.out.println(UIStrings.MENU_OPTIONS);

        Scanner reader = new Scanner(System.in);
        String userOption = reader.next();

        while(menu(userOption) == null) {
            System.out.println(UIStrings.MENU_INVALID_OPTION);
            userOption = reader.next();
        }

        System.out.println(menu(userOption));
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
