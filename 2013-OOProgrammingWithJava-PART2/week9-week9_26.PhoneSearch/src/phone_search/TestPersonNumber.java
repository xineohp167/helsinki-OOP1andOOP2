/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package phone_search;

/**
 *
 * @author Fabien
 */
public class TestPersonNumber {
    
    public static void main(String[] args) {
        Person p1 = new Person("pekka");
        Person p2  = new Person("jukka");

        PersonNumber pN1 = new PersonNumber();
        //PersonNumber pN2 = new PersonNumber();
        System.out.println("Test for PersonNumber class");
        pN1.addPersonNumbers(p1.getName(), "040-123456");
        System.out.println(pN1.searchForNumbersByName(p2.getName()));
        System.out.println(pN1.searchForNumbersByName(p1.getName()));
        pN1.addPersonNumbers(p1.getName(), "09-222333");
        System.out.println(pN1.searchForNumbersByName(p1.getName()));
        //
        System.out.println(pN1.searchForNamesByNumber("02-444123"));
        System.out.println(pN1.searchForNamesByNumber("040-123456"));
        System.out.println(pN1.searchForNamesByNumber("09-222333"));
        System.out.println(pN1.searchForNumbersByName("pekka"));
        pN1.removeName(p1.getName());
        System.out.println(pN1.searchForNumbersByName("pekka"));
        System.out.println(pN1.searchForNamesByNumber("040-123456"));
        System.out.println(pN1.searchForNamesByNumber("09-222333"));
        
    }
    
    
  
    
            
    
}
