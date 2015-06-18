/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fabien
 */
public class BoundedCounter {
    
    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        // write code here
        this.value = 0;
        this.upperLimit = upperLimit;
    }

    public void next() {
        // write code here
        if(value == upperLimit){
            value = 0;
        } else{
            value++;
        }
    }
    
    public int getValue() {
        // write here code that returns the value
        return this.value;
    }
    
    public void setValue(int newValue){
        if(newValue >= 0 && newValue <= this.upperLimit){
            this.value = newValue;
        }
    }

    @Override
    public String toString() {
        // write code here
        return String.format("%02d", this.value);
    }
    
}
