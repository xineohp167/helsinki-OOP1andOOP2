/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fabien
 */
public class StringUtils {
    
    // static method
    public static boolean included(String word, String searched){
        if(word.isEmpty() || searched.isEmpty()){
            return false;
        }
        String word1 = word.trim().toLowerCase();
        String searched1 = searched.trim().toLowerCase();
        return word1.contains(searched1);
        
    }
    
}
