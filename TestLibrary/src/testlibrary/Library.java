/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testlibrary;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Fabien
 */
public class Library {
    private HashMap<String, Book> collection;

    public Library() {
        this.collection = new HashMap<String, Book>();
    }

    public Book getBook(String bookName) {
        bookName = stringCleaner(bookName);
        return this.collection.get(bookName);
    }

    public void addBook(Book book) {
        String name = stringCleaner(book.getName());

        if(this.collection.containsKey(name)) {
            System.out.println("The book is already in the library!");
        } else {
            this.collection.put(name, book);
        }
    }

    public void removeBook(String bookName) {
        bookName = stringCleaner(bookName);

        if(this.collection.containsKey(bookName)) {
            this.collection.remove(bookName);
        } else {
            System.out.println("The book was not found, you can't remove it!");
        }
    }

    public ArrayList<Book> bookList() {
        return new ArrayList<Book>(this.collection.values());
       // return (ArrayList<Book>) this.collection.values();
    }

    private String stringCleaner(String string) {
        if (string == null) {
            return "";
        }

        string = string.toLowerCase();
        return string.trim();
    }
}
