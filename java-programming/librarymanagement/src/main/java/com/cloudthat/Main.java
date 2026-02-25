package com.cloudthat;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("12345678", "Pride and Prejudice", "Jane Austen");
        Book b2 = new Book("12345678", "Pride and Prejudice", "Jane Austen");
        Book b3 = new Book("12345678", "Pride and Prejudice", "");


        Book m1 = new Magazine("1234567","The Times","Times Group",34,"12-02-2026");

        System.out.println("The book name is: ");
        System.out.println(b1.getTitle());

        System.out.println("The author of book b3 is: ");
        System.out.println(b3.getAuthor());

        System.out.println(b1);
        System.out.println(b1.hashCode());

        if(b1.equals(b2)){
            System.out.println("B1 is B2");
        }

        System.out.println(m1);
    }
}