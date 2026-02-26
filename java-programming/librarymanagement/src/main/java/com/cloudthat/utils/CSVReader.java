package com.cloudthat.utils;


import com.cloudthat.models.Book;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class CSVReader {
    public List<Book> reader(String path){
        List<Book> bookList= new ArrayList<>();
//        try(BufferedReader br = new BufferedReader(new FileReader(path))){
//            while ((line = br.readLine()) != null){
//                String[] values = line.split(",");
//                Book newBook = new Book(values[0], values[1], values[2]);
//                bookList.add(newBook);
//            }

        try(Stream<String> lines = Files.lines(Paths.get(path))){
           bookList =  lines.map(line -> line.split(","))
                    .map(Book::fromCsv)
                    .collect(Collectors.toList());
//                    .forEach(columns ->bookList.add(new Book(columns[0],columns[1],columns[2])));

            return bookList;
        } catch (IOException e){
            e.printStackTrace();
        }
        return new ArrayList<Book>();
    }
}
