
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user.
//        Type a number: 3
//        Type another number: 2
//
//        Division: 3 / 2 = 1.5
        System.out.print("Type a number:");
        int a = Integer.parseInt(reader.nextLine());
        System.out.print("Type another number: ");
        int b = Integer.parseInt(reader.nextLine());
        double result = (double) a/b;
        System.out.println("Division: " + a + " / " + b + " = " + result);
    }
}
