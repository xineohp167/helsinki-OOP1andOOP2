/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fabien
 */
public class Person {
    
    
    // Instance variables
    private String name;
    private String number;

    public Person(String name, String number) {
        this.name = name;
        this.number = number;
    }
    

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the number
     */
    public String getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void changeNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return this.name + " number: " + this.number;
    }
    
    
    
    
}
