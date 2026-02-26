package com.cloudthat;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Library library = new Library();
        library.addBook(new Book("9780141439518", "Pride and Prejudice", "Jane Austen"));
        library.addBook(new Book("9781856134033", "Harry Potter", "James Gosling"));

        Consumer<Book> printBook = System.out::println;

        List<Book> availableBooks = library.getAvailableBooks();
        availableBooks.forEach(printBook);

        Optional<Book> searchedBook = library.findBookByIsbn("9781856134033");
        searchedBook.ifPresentOrElse(printBook, ()->System.out.println("Book Not Found"));


    }
}