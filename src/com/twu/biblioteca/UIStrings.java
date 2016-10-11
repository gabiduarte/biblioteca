package com.twu.biblioteca;

public class UIStrings {
    public static final String LINE_BREAK = "\n";
    public static final String WELCOME_MESSAGE = "Welcome to Biblioteca!" + LINE_BREAK;
    public static final String MENU_HEADER = "************* Biblioteca Menu *************" + LINE_BREAK;
    public static final String MENU_INVALID_OPTION = "Select a valid option!";
    public static final String MENU_QUIT = "Thanks for using Biblioteca!";
    public static final String LIBRARY_BOOKS_AVAILABLE = "Books Available:" + LINE_BREAK;
    public static final String LIBRARY_BOOKS_UNAVAILABLE = "No available books in Biblioteca";
    public static final String CHECKOUT_MENU = "Choose the ID of the book you want to checkout";
    public static final String CHECKOUT_SUCCESS = "Thank you! Enjoy the book";
    public static final String CHECKOUT_FAIL = "That book is not available.";

    public static final String MENU_OPTIONS = MENU_HEADER + LINE_BREAK +
            "Choose from the option below:" + LINE_BREAK  +
            "1 - List books" + LINE_BREAK +
            "2 - Checkout books" + LINE_BREAK +
            "9 - Quit";
}
