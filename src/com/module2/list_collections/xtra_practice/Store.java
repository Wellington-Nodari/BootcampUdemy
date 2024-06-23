package com.module2.list_collections.xtra_practice;

import java.util.ArrayList;

public class Store {

    private ArrayList<Book> books;

    public Store() {
        books = new ArrayList<>();
    }

    public Book getBook(int index) {
        return books.get(index);
    }

    public void setBook(int index, Book book) {
        this.books.set(index, new Book(book));
    }

    public void addBook(Book book) {
        this.books.add(new Book(book));
    }

    public void sellBook (String title) {
        for (int i = 0; i < this.books.size(); i++) {
            if (books.get(i).getTitle().equals(title)) {
                this.books.remove(i);
            }
        }
    }

    public boolean contains(Book book) {
        return this.books.contains(book);
    }

}
