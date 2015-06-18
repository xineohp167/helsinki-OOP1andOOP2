/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fabien
 */
public class Counter {
    
    // Instance variables
    private int value;
    private boolean check;
    
    //Multiple conatructors
    
    public Counter(int startingValue, boolean check){
        this.value = startingValue;
        this.check = check;
    }
    
    public Counter(int startingValue){
        this(startingValue, false);
    }
    
    public Counter(boolean check){
        this(0, check);
    }
    
    public Counter(){
        this(0, false);
    }

    /**
     * @return the value
     */
    public int value() {
        return value;
    }
    
    // Multiple methods
    
    // increases the value by the amount of the parameter. 
    // If the value of the parameter is negative, the value will not change
    public void increase(int increaseAmount){
        if(increaseAmount >= 0){
            this.value += increaseAmount;
        }
    }
    
    public void increase(){
        this.increase(1);
    }
    
    // decreases the value of the counter by the amount given by the parameter, but not below 0 if the check is on. 
    // If the value of the parameter is negative, the value of the counter will not change
    public void decrease(int decreaseAmount){
        if(decreaseAmount <= 0 ) {
            return;
        }
        if(this.value - decreaseAmount < 0 && check){
            this.value = 0;
        } else {
            this.value -= decreaseAmount;
        } 
        
    }
    
    public void decrease(){
        this.decrease(1);
        
    }
    
    
}
