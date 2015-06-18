
public class Main {

    public static void main(String[] args) {

        // Test my version
        Library Library = new Library();
        Library.addBook(new Book("Cheese Problems Solved", "Woodhead Publishing", 2007));
        Library.addBook(new Book("The Stinky Cheese Man and Other Fairly Stupid Tales", "Penguin Group", 1992));
        Library.addBook(new Book("NHL Hockey", "Stanley Kupp", 1952));
        Library.addBook(new Book("Battle Axes", "Tom A. Hawk", 1851));

        long start = System.nanoTime();
        for (Book Book : Library.searchByYear(1851)) {
            System.out.println(Book);
        }
        long now = System.nanoTime();
        System.out.println((now - start));
        
        /*
        Battle Axes, Tom A. Hawk, 1851
        337025
        */
        
//        // Test Helsinki version
//        Library1 Library1 = new Library1();
//        Library1.addBook(new Book("Cheese Problems Solved", "Woodhead Publishing", 2007));
//        Library1.addBook(new Book("The Stinky Cheese Man and Other Fairly Stupid Tales", "Penguin Group", 1992));
//        Library1.addBook(new Book("NHL Hockey", "Stanley Kupp", 1952));
//        Library1.addBook(new Book("Battle Axes", "Tom A. Hawk", 1851));
//
//        long start = System.nanoTime();
//        for (Book Book : Library1.searchByYear(1851)) {
//            System.out.println(Book);
//        }
//        long now = System.nanoTime();
//        System.out.println((now - start));
        
        /*
        Class StringUtils line 25
        Class StringUtils line 25
        Class StringUtils line 25
        Class StringUtils line 25
        Class StringUtils line 25
        Class StringUtils line 25
        Class StringUtils line 25
        Class StringUtils line 25
        Battle Axes, Tom A. Hawk, 1851
        984259
        */
    }
}
