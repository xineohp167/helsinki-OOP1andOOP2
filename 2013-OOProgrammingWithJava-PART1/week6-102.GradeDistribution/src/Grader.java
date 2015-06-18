
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Fabien
 */
public class Grader {

    // Instance variable
    private Scanner reader;
    private int[] grades;

    public Grader(Scanner reader) {
        this.reader = reader;
        grades = new int[6];
    }

    public void askForGrades() {
        System.out.println("Type exam scores, -1 completes:");
        while (true) {
            int result = Integer.parseInt(reader.nextLine());
            if(result == -1) break;
            if (result >= 0 && result < 30) {
                grades[0]++;
            } else if (result > 29 && result < 35) {
                grades[1]++;
            } else if (result >= 35 && result < 40) {
                grades[2]++;
            } else if (result >= 40 && result < 45) {
                grades[3]++;
            } else if (result >= 45 && result < 50) {
                grades[4]++;
            } else if (result >= 50 && result < 61) {
                grades[5]++;
            } 
        }

    }

    public void printGrades() {
        System.out.println("Grade distribution:");
        int counter = 0;
        for (int i = grades.length - 1; i >= 0; i--) {
            System.out.print(i + ": ");
            for (int j = 0; j < grades[i]; j++) {
                System.out.print("*");
                counter++;
            }
            System.out.println("");
        }
        int accepted = counter - grades[0];
        double ratio;
        if(counter > 0){
            ratio = 100 * accepted / counter;
        } else{
            ratio = 0;
        }
        System.out.printf("Acceptance percentage: %,.1f", ratio);

    }

}
