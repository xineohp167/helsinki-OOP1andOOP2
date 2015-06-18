/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package week10_0.testingpolymorphism;

/**
 *
 * @author Fabien
 */
public class Week10_0TestingPolymorphism {
    
    
          // ERROR
//        String string = "characterString";
//        Object string = string;
//        Object string1 = "another string";
//        String string1 = string1; // DOESN'T WORK!
    
        

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // this gives error
//        String string = "string";
//        Object string = "another string";
        // Also error
//        Object string = "test";
//        System.out.println(string);
//        String string = "test2";
        String string = "characterString";
        System.out.println(string);
        Object string1 = string;
        System.out.println(string);
        System.out.println(string1);
        string1 = "Changed";
        System.out.println(string);
        System.out.println(string1);
        Object string2 = "another string";
        // incompatible types: Object cannot be converted to String
      //  String string3 = string2; // DOESN'T WORK!
        String string4 = (String) string2;
        
        
    }
    
}
