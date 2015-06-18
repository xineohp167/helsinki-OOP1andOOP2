
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Until what? ");
        int upper = Integer.parseInt(reader.nextLine());
        int sum = 0;
        int counter = 1;
        while(counter <= upper){
            sum += counter;
            counter++;
        }
        System.out.println("Sum is " + sum);

    }
}
