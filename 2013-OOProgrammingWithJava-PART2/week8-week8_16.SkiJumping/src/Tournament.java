
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
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
public class Tournament {
    
    // Instance varaibles
    private ArrayList<Participant> participants = new ArrayList<Participant>();
    private Random gen = new Random();
    
    
    //Methods
    public void start(Scanner reader){
        System.out.println("Kumpula ski jumping week");
        
        System.out.println("");
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
        String name = "";
        do{
            System.out.print("  Participant name: ");
            name = reader.nextLine();
            if(!name.isEmpty()){
                participants.add(new Participant(name));
            }
        } while(!name.isEmpty());
        
        System.out.println("");
        System.out.println("The tournament begins!");
        
        System.out.println("");
        
        startTours(reader);
        
    }

    private void startTours(Scanner reader) {
        int round =0;
        
        while(true){
            System.out.print("Write \"jump\" to jump; otherwise you quit: ");
            String command = reader.nextLine();
            if(!command.equals("jump")){
                break;
            }
            round++;
            
            System.out.println("");
            System.out.println("Round " + round);
            
            System.out.println("");
            System.out.println("Jumping order:");
            Collections.sort(participants);
            int n =1;
            for (Participant participant : participants) {
                
                //  1. Mikael (0 points)
                System.out.println("  " + n + ". " + participant.toString());
                n++;
            }
            
            System.out.println("");
            System.out.println("Results of round " + round);
            for (Participant participant : participants) {
                score(participant);
            }
            
            System.out.println("");
        }
        
        System.out.println("");
        System.out.println("Thanks!");
        
        System.out.println("");
        
        printTournamentScores();
        
    }

    private void score(Participant participant) {
        System.out.println("  " + participant.getName());
        int length = gen.nextInt(61) + 60;
        participant.addLengths(length);
        System.out.println("    " + "length: " + length);
        int[] judgesScore = new int[5];
        int judgesTotal = 0;
        for (int i = 0; i < judgesScore.length; i++) {
            judgesScore[i] = gen.nextInt(11) + 10;
            judgesTotal += judgesScore[i];
        }
        System.out.println("    " + "judge votes: " + Arrays.toString(judgesScore));
        Arrays.sort(judgesScore);
        int judgesResult = judgesTotal - (judgesScore[0] + judgesScore[judgesScore.length-1]);
        int result = length + judgesResult;
        participant.setResult(result);
        
    }

    

    private void printTournamentScores() {
        
        System.out.println("Tournament results:");
        System.out.println("Position    Name"); // 4 spaces between Position and Name
        int position = 1;
        Collections.sort(participants);
        Collections.reverse(participants);
        for (Participant participant : participants) {
            System.out.println(position + "           " + participant);
            printLengths(participant);
            position++;
            
        }
    }

    private void printLengths(Participant participant) {
        String text = "            " + "jump lengths:";
        for (Integer i : participant.getLengths()) {
            //  112 m
            text += " " + i + " m,";
        }
        text = text.substring(0, text.length()-1);
        System.out.println(text);
    }
    
}
