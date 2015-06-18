/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fabien
 */
public class Change {
    
    // Instance variables
    char fromCharacter;
    char toCharacter;
    
    // Constructor
    public Change(char fromCharacter, char toCharacter) {
        this.fromCharacter = fromCharacter;
        this.toCharacter = toCharacter;
    }
    
    
    public String change(String word){
        String replaced = "";
        for ( int i=0; i < word.length(); i++) {
           char character = word.charAt(i);
           if ( character == fromCharacter ) {
              replaced += toCharacter;
           }  else {
              replaced += character;
           }
        }
        return replaced;

    }
    
}
