
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.
        String input;

        // Write your code here
        do
        {
        System.out.print("Type the password: ");
        input = reader.nextLine();
        if(input.equals(password)){
            System.out.println("Right!");
        }else{
            System.out.println("Wrong!");
        }
        } while(!input.equals(password));
        
        System.out.println("");
        System.out.println("The secret is: jryy qbar!");
    }
}
