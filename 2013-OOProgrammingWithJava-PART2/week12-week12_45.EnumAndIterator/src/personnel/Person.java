/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package personnel;

/**
 *
 * @author Fabien
 */
public class Person {
    
    //-------------------------------------
    // Instance variables
    //
    private String name;
    private Education title;
    
    // Constructor
    public Person(String name, Education title) {
        this.name = name;
        this.title = title;
    }
    
    public Education getEducation(){
        return this.title;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.title;
    }
    
    
            
    
}
