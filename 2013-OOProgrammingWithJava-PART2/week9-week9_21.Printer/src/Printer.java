
import java.io.File;
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
public class Printer {
    
    // Instance variables
    private String fileName;

    // Constructor
    public Printer(String fileName) throws Exception{
        this.fileName = fileName;
    }
    
    // Methods
    public void printLinesWhichContain(String word) throws Exception{
        Scanner reader = new Scanner(new File(fileName));
        
        while (reader.hasNext()) {
            
            String line = reader.nextLine();

            if (line.contains(word)) {
                System.out.println(line);
            }
        }
        reader.close();
    }
    
    
    
}
