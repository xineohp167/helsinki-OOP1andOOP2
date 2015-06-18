/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package containers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Fabien
 */
public class ContainerHistory {
    
    // Instance variables
    private List<Double> values;
    
    // Constructor
    public ContainerHistory() {
        values = new ArrayList<Double>();
    }
    
    public void add(double situation){
        //if(situation > 0){
        this.values.add(situation);
        //}
    }
    
    public void reset(){
        this.values.clear();
    }
    
    public double maxValue(){
        if(this.values.isEmpty()){
            return 0;
        } else{
            return Collections.max(this.values);
        }
    }
    
    public double minValue(){
        if(this.values.isEmpty()){
            return 0;
        } else{
            return Collections.min(this.values);
        }
    }
    
    public double average(){
        double sum = 0;
        if(this.values.isEmpty()){
            return sum;
        } 
        for (Double double1 : values) {
            sum += double1;
        }
        return (sum / this.values.size());
    }
    
    public double greatestFluctuation(){
        if(this.values.isEmpty() || this.values.size() == 1){
            return 0;
        }
//        ArrayList<Double> vals = new ArrayList<Double>();
//        for (Double double1 : this.values) {
//            if(double1 < 0){
//                double1 *= -1;
//            }
//            vals.add(double1);
//        }
//        //return Collections.max(vals) - Collections.min(vals);
//        return this.maxValue() - Math.abs(this.minValue());
        double maxFluct = Math.abs(this.values.get(0) - this.values.get(1));
        for (int i = 1; i < this.values.size()-1; i++) {
            double fluct = Math.abs(this.values.get(i) - this.values.get(i+1));
            if(fluct > maxFluct){
                maxFluct = fluct;
            }
        }
        return maxFluct;
    }
    
    public double variance(){
        if(this.values.isEmpty() || this.values.size() == 1){
            return 0;
        }
        double sigmaSum = 0;
        for (Double double1 : values) {
            sigmaSum += Math.pow((double1 - this.average()), 2);
        }
        return sigmaSum / (this.values.size() - 1);
    }
    
    public String toString(){
        return this.values.toString();
    }
            
    
}
