package com.cloudthat;

import java.util.*;
import java.util.stream.Collectors;

public class Library {

    // Using is HashMap or HashSet is much faster or efficient
    private Map<String, Book> bookMap;
    private Set<String> uniqueIsbns;
    public Library(){
        // Create a Dummy book initially
        bookMap = new HashMap<>();
        uniqueIsbns = new HashSet<>();
    }

    public void addBook(Book book){
        bookMap.putIfAbsent(book.getIsbn(), book);
    }

    public Optional<Book> findBookByIsbn(String isbn){
        return Optional.ofNullable(bookMap.get(isbn));
    }

    public List<Book> getAvailableBooks(){
        return bookMap.values().stream()
                .filter(Book::isAvaliable)
                .collect(Collectors.toList());
    }

}
