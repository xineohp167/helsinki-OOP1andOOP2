
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fabien
 */
public class Dictionary {
    
    // Instance variable
    private HashMap<String, String> dict = new HashMap<String, String>();
    
    
    // Methods
    public String translate(String word){
        return this.dict.get(word);
    }
    
    public void add(String word, String translation){
        this.dict.put(word, translation);
    }
    
    public int amountOfWords(){
        return this.dict.size();
    }
    
    public ArrayList<String> translationList(){
        ArrayList<String> result = new ArrayList<String>();
        for ( String key : this.dict.keySet() ) {
            result.add(key + " = " + this.dict.get(key));
        }
        return result;
    }
}
