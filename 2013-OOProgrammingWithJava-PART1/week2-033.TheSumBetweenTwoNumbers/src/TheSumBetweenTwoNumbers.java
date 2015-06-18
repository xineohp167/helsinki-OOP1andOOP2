
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("First: ");
        int first = Integer.parseInt(reader.nextLine());
        System.out.print("Last: ");
        int last = Integer.parseInt(reader.nextLine());
        int result = 0;
        int count = first;
        while(count <= last){
            result += count;
            count++;
        }
        System.out.println("The sum is " + result);
        
    }
}
