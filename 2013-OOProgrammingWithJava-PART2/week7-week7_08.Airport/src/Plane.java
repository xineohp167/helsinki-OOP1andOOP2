/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fabien
 */
public class Plane {
    
    // Instance variables
    private String id;
    private int capacity;
    
    // Constructor
    public Plane(String id, int capacity) {
        this.id = id;
        this.capacity = capacity;
    }
    
    // Methods
    public String getId() {
        return id;
    }

    public int getCapacity() {
        return capacity;
    }
    
    

    @Override
    public String toString() {
        // G-OWAC (101 ppl)
        return this.id + " (" + this.capacity + " ppl)";
    }
    
    
    
    
}
