
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Fabien
 */
public class Library {

    // Instance variables
    private ArrayList<Book> books;

    // Constructor
    public Library() {
        books = new ArrayList<Book>();
    }

    public void addBook(Book newBook) {
        books.add(newBook);
    }

    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> found = new ArrayList<Book>(); 

        // iterate the list of books and add all the matching books to the list found
        for (Book book : books) {
            if(StringUtils.included(book.title(), title)){
                found.add(book);
            }
        }
        return found;
    }
    
    public ArrayList<Book> searchByPublisher(String publisher){
        ArrayList<Book> found = new ArrayList<Book>(); 

        // iterate the list of books and add all the matching books to the list found
        for (Book book : books) {
            if(StringUtils.included(book.publisher(), publisher)){
                found.add(book);
            }
        }
        return found;
    }
    
    public ArrayList<Book> searchByYear(int year){
        ArrayList<Book> found = new ArrayList<Book>(); 

        // iterate the list of books and add all the matching books to the list found
        for (Book book : books) {
            if(book.year() == year){
                found.add(book);
            }
        }
        return found;
    }

    public void printBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
