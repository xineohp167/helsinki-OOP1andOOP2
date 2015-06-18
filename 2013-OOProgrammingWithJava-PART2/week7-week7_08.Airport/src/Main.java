
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be useful.
        Scanner reader = new Scanner(System.in);
        FlightCollect flights = new FlightCollect();
        PlaneCollect planes = new PlaneCollect();
        
        UserInterface user = new UserInterface(reader, flights, planes);
        
        user.start();
    }
}
