package com.cloudthat;

import com.cloudthat.library.Library;
import com.cloudthat.models.Book;
import com.cloudthat.utils.CSVReader;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Optional;
import java.util.Properties;
import java.util.concurrent.ExecutionException;
import java.util.function.Consumer;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Properties prop = new Properties();
        String dataUrl = "";
        try(InputStream input = Main.class.getClassLoader().getResourceAsStream("config.properties")){
            prop.load(input);
            dataUrl = prop.getProperty("data.url");
            System.out.println("The data file path is: "+dataUrl);
        }catch (IOException ex){
            ex.printStackTrace();
        }

        Library library = new Library();
        CSVReader csvreader = new CSVReader();
//        List<Book> books = csvreader.reader("C:\\Users\\VishwasKSingh\\Workspace\\deloitte-workspace\\pdi-workspace-26\\java-programming\\librarymanagement\\src\\main\\java\\com\\cloudthat\\utils\\data.csv");
        List<Book> books = csvreader.reader(dataUrl);

        if(!books.isEmpty()){
            for(Book b : books){
                library.addBook(b);
            }
        }


//        try {
//            library.addBook(new Book("9780141439518", "Pride and Prejudice", "Jane Austen"));
////            library.addBook(new Book("9780141439518", "Pride and Prejudice", "Jane Austen"));
//            library.addBook(new Book("9781856134033", "Harry Potter", "James Gosling"));
//        } catch (Exception e) {
//            System.out.println("Book you are trying to add already exists");
//        }


        Consumer<Book> printBook = System.out::println;

        List<Book> availableBooks = library.getAvailableBooks();
        availableBooks.forEach(printBook);

        Optional<Book> searchedBook = library.findBookByIsbn("9781856134033");
        searchedBook.ifPresentOrElse(printBook, ()->System.out.println("Book Not Found"));

        System.out.println("Searching by Title");
        List<Book> bookList = library.searchByTitleAsync("Harry").get();
        bookList.forEach(printBook);
//        CompletableFuture<List<Book>> future = library.searchByTitleAsync("Harry");
//        future.thenAccept(bookList ->{
//            if (bookList.isEmpty()) {
//                System.out.println("No books found");
//            }else {
//                bookList.forEach(printBook);
//            }
//        });
    }
}