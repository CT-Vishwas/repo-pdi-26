package com.cloudthat.models;

import com.cloudthat.library.LibraryItem;

public class Book implements LibraryItem {
    private String isbn;
    private String title;
    private String author;
    private boolean isAvaliable = true;

    public Book() {
        this.isbn = "UNKNOWN";
        this.title = "UNKNOWN";
        this.author = "UNKNOWN";
    }

    public Book(String isbn, String title, String author) {
        this();
        if(!isbn.isEmpty()){
            this.isbn = isbn;
        }
        if(!title.isEmpty()){
            this.title = title;
        }
        if(!author.isEmpty()){
            this.author = author;
        }
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        if(!isbn.isEmpty()){
            this.isbn = isbn;
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if(!author.isEmpty()){
            this.author = author;
        }
    }

    public boolean isAvaliable() {
        return isAvaliable;
    }

    public void setAvaliable(boolean avaliable) {
        isAvaliable = avaliable;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;
        return getIsbn().equals(book.getIsbn()) && getTitle().equals(book.getTitle()) && getAuthor().equals(book.getAuthor());
    }

    @Override
    public int hashCode() {
        int result = getIsbn().hashCode();
        result = 31 * result + getTitle().hashCode();
        result = 31 * result + getAuthor().hashCode();
        return result;
    }

    public  static Book fromCsv(String[] columns){
        if(columns.length < 3) return null;
        String isbn = columns[0].trim();
        String title = columns[1].trim();
        String author = columns[2].trim();

        return  new Book(isbn,title,author);
    }
}
