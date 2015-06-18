
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
public class BookTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Book> books = new ArrayList<Book>();
        Book objectBook = new Book("Objectbook", 2000);
        books.add(objectBook);

        if (books.contains(objectBook)) {
            System.out.println("The object book was found.");
        }

        objectBook = new Book("Objectbook", 2000);

        if (!books.contains(objectBook)) {
            System.out.println("The object book was not found.");
        }
    }

}
