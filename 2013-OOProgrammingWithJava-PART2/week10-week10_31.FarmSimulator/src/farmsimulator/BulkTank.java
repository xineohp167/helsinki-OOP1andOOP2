/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package farmsimulator;

/**
 *
 * @author Fabien
 */
public class BulkTank {
    
    // Instance variables
    private double capacity;
    private double volume;
    
    // Constants
    private static final double INITIAL_CAPACITY = 2000;
    
    // Constructors
    public BulkTank(double capacity){
        this.capacity = capacity;
        this.volume = 0;
        
    }
    
    public BulkTank(){
        this(INITIAL_CAPACITY);
    }
    
    public double getCapacity(){
        return this.capacity;
    }
    
    public double getVolume(){
        return this.volume;
    }
    
    public double howMuchFreeSpace(){
        return capacity - volume;
    }
    
    public void addToTank(double amount){
        volume += amount;
        if(volume > capacity){
            volume = capacity;
        }
    }
    
    public double getFromTank(double amount){
        if (amount < 0) {
            return 0.0;
        }
        if (amount > volume) {
            double everything = volume;
            volume = 0.0;
            return everything;
        }
 
        volume = volume - amount;
        return amount;
    }

    @Override
    public String toString() {
        return Math.ceil(volume) + "/" + Math.ceil(capacity);
    }
    
    
}
