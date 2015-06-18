
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
public class TextUserInterface {

    // Instance variables
    private Scanner reader;
    private Dictionary dict;

    // Constructor
    public TextUserInterface(Scanner reader, Dictionary dict) {
        this.reader = reader;
        this.dict = dict;
    }

    // Methods
    public void start() {
        while (true) {
            System.out.println("Statement:");
            System.out.println("  add - adds a word pair to the dictionary");
            System.out.println("  translate - asks a word and prints its translation");
            System.out.println("  quit - quit the text user interface");
            System.out.println("");
            System.out.print("Statement: ");
            String command = reader.nextLine();
            if (command.equals("quit")) {
                System.out.println("Cheers!");
                break;
            } else if(command.equals("add")){
                add();
                System.out.println("");
            } else if(command.equals("translate")){
                translate();
                System.out.println("");
            } else{
                System.out.println("Unknown statement");
                System.out.println("");
            }
        }

    }

    public void add() {
        System.out.print("In Finnish: ");
        String finWord = reader.nextLine();
        System.out.print("Translation: ");
        String engWord = reader.nextLine();
        this.dict.add(finWord, engWord);
        
    }

    public void translate() {
        System.out.print("Give a word: ");
        String finWord = reader.nextLine();
        if(this.dict.translate(finWord) == null) {
            System.out.println("Unknown word!");
        } else {
            System.out.println("Translation: " + this.dict.translate(finWord));
        }
    }

}
