package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {
        BibliotecaApp app = new BibliotecaApp();

        System.out.println(app.welcome());
    }

    public String welcome() {
        return "Welcome to Biblioteca!";
    }
}
