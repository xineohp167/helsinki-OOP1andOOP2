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
        System.out.println("Class StringUtils line 15");
        if(word.isEmpty() || searched.isEmpty()){
            return false;
        }
        String word1 = word.trim().toLowerCase();
        String searched1 = searched.trim().toLowerCase();
        return word1.contains(searched1);
        
    }
    
    public static boolean included1(String word, String searched) {
        System.out.println("Class StringUtils line 25");
        if (word == null || searched == null) {
            return false;
        }
 
        word = word.trim();
        searched = searched.trim();
 
        word = word.toUpperCase();
        searched = searched.toUpperCase();
 
        return word.contains(searched);
    }
    
}
