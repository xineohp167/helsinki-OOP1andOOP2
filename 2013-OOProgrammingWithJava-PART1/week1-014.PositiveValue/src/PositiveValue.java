
import java.util.Scanner;

public class PositiveValue {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Type your program here:
//        Type a number: -2
//
//The number is not positive.
        System.out.print("Type a number: ");
        int a = Integer.parseInt(reader.nextLine());
        if(a > 0){
            System.out.println("The number is positive.");
        } else{
            System.out.println("The number is not positive.");
        }
    }
}
