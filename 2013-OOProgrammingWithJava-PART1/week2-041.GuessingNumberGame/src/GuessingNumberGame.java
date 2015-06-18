
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();

        // program your solution here. Do not touch the above lines!
        boolean guess = false;
        int count = 1;
        // System.out.println(numberDrawn);
        System.out.print("Guess a number: ");
        int number = Integer.parseInt(reader.nextLine());
        while(!guess){
            if(number == numberDrawn){
                guess = true;
            }else{
                String compare = (number < numberDrawn) ? "greater" : "lesser";
                System.out.println("The number is " + compare + ", guesses made: " + count);
                count++;
                System.out.print("Guess a number: ");
                number = Integer.parseInt(reader.nextLine());
            }
        }
        System.out.println("Congratulations, your guess is correct!");
        
    }

    // DO NOT MODIFY THIS!
    /**
     * 
     * @return random number between 0 and 100
     */
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
