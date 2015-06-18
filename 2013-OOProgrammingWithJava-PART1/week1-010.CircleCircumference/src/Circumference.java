
import java.util.Scanner;

public class Circumference {
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Program your solution here 
//        Type the radius: 20
//
//        Circumference of the circle: 125.66370614359172
        System.out.print("Type the radius: ");
        double radius = Double.parseDouble(reader.nextLine());
        System.out.println("");
        double result = 2 * Math.PI * radius;
        System.out.println("Circumference of the circle: " + result);
    }
}
