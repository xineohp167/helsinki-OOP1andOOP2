/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Fabien
 */
public class MindfulDictionary {

    // Instance variables
    private HashMap<String, String> dict = new HashMap<String, String>();
    private HashMap<String, String> reverseDict = new HashMap<String, String>();
    private String fileName;

    // Constructor
    public MindfulDictionary(String file) {
        this.fileName = file;
        dict = new HashMap<String, String>();
        reverseDict = new HashMap<String, String>();
    }

    public MindfulDictionary() {
        fileName = "";
    }

    // Methods
    public void add(String word, String translation) {
        if (!this.dict.containsKey(word)) {
            this.dict.put(word, translation);
            this.reverseDict.put(translation, word);
        }

    }

    public String translate(String word) {
        String foundWord = "";
        if (this.dict.containsKey(word)) {
            foundWord = this.dict.get(word);
        }
        if (foundWord.isEmpty() && this.reverseDict.containsKey(word)) {
            foundWord = this.reverseDict.get(word);
        }
        if (foundWord.isEmpty()) {
            return null;
        }
        return foundWord;
    }

    public void remove(String word) {
        if (this.dict.containsKey(word)) {
            String translatedWord = this.dict.remove(word);
            this.reverseDict.remove(translatedWord);
        }
        if (this.reverseDict.containsKey(word)) {
            String translatedWord = this.reverseDict.remove(word);
            this.dict.remove(translatedWord);
        }
    }

    public boolean load() {
        Scanner reader = null;
        try {
            reader = new Scanner(new File(fileName));
        } catch (Exception e) {
            //System.out.println("We couldn't read the file. Error: " + e.getMessage());
            return false; // we exit the method
        }

        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            String[] parts = line.split(":");   // the line is split at :

            this.add(parts[0], parts[1]);
//            System.out.println(line);
//            System.out.println(parts[0]);
//            System.out.println(parts[1]);

        }
        return true;

    }

    public boolean save() {
        FileWriter fileWriter = null;
        try {
             fileWriter = new FileWriter(fileName);
             for (String word : this.dict.keySet()) {
                 String text = word + ":" + this.dict.get(word) + "\n";
                 fileWriter.write(text);
             }
             fileWriter.close();
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
