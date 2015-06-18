/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 
 * @author Fabien
 */
public class MyNumber {
    
    private int num;

    public MyNumber(int num) {
        this.num = num;
    }
    
    public boolean less(MyNumber other){
        return this.num < other.num;
    }
    
    public int difference(MyNumber other){
        if(this.less(other)){
            return other.difference(this);
        }
        return this.num - other.num;
    }

    @Override
    public String toString() {
        return "The value of the number is: " + num;
    }
    
    
}
