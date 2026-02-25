package com.cloudthat;

public class Book {
    private String isbn;
    private String title;
    private String author;

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
}
