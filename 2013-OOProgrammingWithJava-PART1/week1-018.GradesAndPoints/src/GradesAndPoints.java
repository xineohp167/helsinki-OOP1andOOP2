
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type the points [0-60]: ");
        int result = Integer.parseInt(reader.nextLine());
        if(result < 30){
            System.out.println("failed");
        } else if(result > 29 && result < 35){
            System.out.println("1");
        } else if(result >= 35 && result < 40){
            System.out.println("2");
        } else if(result >= 40 && result < 45){
            System.out.println("3");
        } else if(result >= 45 && result < 50){
            System.out.println("4");
        } else {
            System.out.println("5");
        }

    }
}
