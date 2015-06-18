/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Fabien
 */
public class Analysis {
    // Instance varaibles
    private File f;
    
    // Constructor
    public Analysis(File f){
        this.f = f;
    }
    
    // Methods
    public int lines() throws Exception{
        Scanner reader = new Scanner(f);
        int numLines = 0;
        while(reader.hasNextLine()){
            String line = reader.nextLine();
            numLines++;
        }
        reader.close();
        return numLines;
    }
    
    public int characters() throws Exception{
        Scanner reader = new Scanner(f);
        int numChars = 0;
        while(reader.hasNextLine()){
            String line = reader.nextLine();
            numChars += line.length() + 1;
        }
        //reader.close();
        return numChars;
        
    }
    
    public void printText() throws FileNotFoundException{
        Scanner reader = new Scanner(f, "UTF-8");
        while(reader.hasNextLine()){
            System.out.println(reader.nextLine());
            
        }
        reader.close();
    }
    
    
    
}
