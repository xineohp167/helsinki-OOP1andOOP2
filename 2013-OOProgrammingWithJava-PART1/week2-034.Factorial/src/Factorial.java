import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a number: ");
        int factorial = Integer.parseInt(reader.nextLine());
        int result = 1;
        int counter = 1;
        while(counter <= factorial){
            result *= counter;
            counter++;
        }
        System.out.println("Factorial is " + result);

    }
}
