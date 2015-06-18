
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // write your code here
        System.out.print("First: ");
        int first = Integer.parseInt(reader.nextLine());
        System.out.print("Last: ");
        int second = Integer.parseInt(reader.nextLine());
        if(first > second){
            System.out.println("");
        }else{
            while(first <= second){
                System.out.println(first);
                first++;
            }
        }

    }
}
