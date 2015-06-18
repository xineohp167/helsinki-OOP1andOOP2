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
public class TestPersonAddress {
    public static void main(String[] args) {
        Person p1 = new Person("pekka");
        Person p2  = new Person("jukka");
        
        PersonAddress pA1 = new PersonAddress();
        
        System.out.println("Test for PersonAddress class");
        System.out.println(pA1.searchForAddressByName("pekka"));
        pA1.addAddress("pekka", "ida ekmanintie", "helsinki");
        System.out.println(pA1.searchForAddressByName("pekka"));
        pA1.addAddress("jukka", "korsontie", "vantaa");
        System.out.println(pA1.searchForAddressByName("jukka"));
        System.out.println("-----------");
        System.out.println(pA1.searchforPersonByAddress("vantaa"));
        System.out.println("****************************");
        System.out.println(pA1.searchforPersonByAddress("hel"));
        
    }
    
}
