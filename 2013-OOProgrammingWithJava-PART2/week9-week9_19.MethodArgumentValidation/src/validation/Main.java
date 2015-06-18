/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package validation;

/**
 *
 * @author Fabien
 */
public class Main {
    
    public static void main(String[] args) {
         Person p = new Person(null, 123);
         System.out.println("name: " + p.getName() + " , age: " + p.getAge());
    }
    
}
