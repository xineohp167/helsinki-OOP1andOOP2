
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be very useful.
        Tournament tournament = new Tournament();
        Scanner reader = new Scanner(System.in);
        tournament.start(reader);
    }
}
