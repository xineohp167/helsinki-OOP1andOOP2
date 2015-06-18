/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package wordinspection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Fabien
 */
public class WordInspection {
    
    // Instance variables
    private File file;
    
    // Constructor
    public WordInspection(File file) {
        this.file = file;
    }
    
    // Methods
    public int wordCount() throws FileNotFoundException{
        int numWords = 0;
        Scanner reader = new Scanner(file, "UTF-8");
        while(reader.hasNext()){
            numWords++;
            reader.next();
        }
        reader.close();
        return numWords;
    }
    
    public List<String> wordsContainingZ() throws FileNotFoundException{
        ArrayList<String> zWords = new ArrayList<String>();
        
        Scanner reader = new Scanner(file, "UTF-8");
        while(reader.hasNext()){
            String word = reader.next();
            if(word.toLowerCase().contains("z")){
                zWords.add(word);
            }
        }
        reader.close();
        return zWords;
        
    }
    
    public List<String> wordsEndingInL() throws FileNotFoundException{
        ArrayList<String> lEndingWords = new ArrayList<String>();
        
        Scanner reader = new Scanner(file, "UTF-8");
        while(reader.hasNext()){
            String word = reader.next();
            if("Ll".contains(word.substring(word.length()-1))){
                lEndingWords.add(word);
            }
        }
        reader.close();
        return lEndingWords;
        
    }
    
    public List<String> palindromes() throws FileNotFoundException{
        ArrayList<String> paliWords = new ArrayList<String>();
        
        Scanner reader = new Scanner(file, "UTF-8");
        while(reader.hasNext()){
            String word = reader.next();
            if(isPalindroma(word)){
                paliWords.add(word);
            }
        }
        reader.close();
        return paliWords;
        
    }

    private boolean isPalindroma(String word) {
        
        for (int i = 0; i < word.length()/2; i++) {
            if(word.charAt(i) != word.charAt(word.length() - (i+1))){
                return false;
            }
        }
        return true;
    }
    
    public List<String> wordsWhichContainAllVowels() throws FileNotFoundException{
        ArrayList<String> allVowelsWords = new ArrayList<String>();
        
        Scanner reader = new Scanner(file, "UTF-8");
        
        while(reader.hasNext()){
            String word = reader.next();
            if(areAllVowels(word)){
                allVowelsWords.add(word);
            }
        }
        reader.close();
        return allVowelsWords;
        
    }

    private boolean areAllVowels(String word) {
        String allVowels = "aeiouyäö";
        for (int i = 0; i < (allVowels.length()); i++) {
            if(!word.contains(allVowels.substring(i, i+1))){
                return false;
            }
        }
        return true;
    }
    
}
