
public class Main {

    public static void main(String[] args) {
        // use this main class to test your program!
        Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);
    }

    public static void addSuitcasesFullOfBricks(Container container) {
        // adding 100 suitcases with one brick in each
        for (int i = 1; i < 101; i++) {
            Thing brick = new Thing("brick", i);
            Suitcase cas = new Suitcase(100);
            cas.addThing(brick);
            container.addSuitcase(cas);
            
            
        }
    }
    

}
