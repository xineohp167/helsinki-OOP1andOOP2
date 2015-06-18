import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type numbers:");
        int result = 0;
        double average = 0;
        int countNumbers = 0;
        int countEven = 0;
        int countOdd = 0;
        while(true){
            int number = Integer.parseInt(reader.nextLine());
            if(number == -1){
                break;
            }
            result += number;
            countNumbers++;
            if(number % 2 == 0){
                countEven++;
            }else{
                countOdd++;
            }
        }
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + result);
        System.out.println("How many numbers: " + countNumbers);
        average = (double) result / countNumbers;
        System.out.println("Average: " + average);
        System.out.println("Even numbers: " + countEven);
        System.out.println("Odd numbers: " + countOdd);

    }
}
