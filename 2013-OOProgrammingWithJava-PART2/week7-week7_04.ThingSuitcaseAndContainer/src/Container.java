
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fabien
 */
public class Container {
    // Instance variables
    private int maxWeight;
    private ArrayList<Suitcase> things;
    private int curretnWeight;

    public Container(int maxWeight) {
        this.maxWeight = maxWeight;
        this.things = new ArrayList<Suitcase>();
        curretnWeight = 0;
    }
    
    public void addSuitcase(Suitcase thing){
        if((this.curretnWeight + thing.totalWeight()) <= this.maxWeight){
            things.add(thing);
            this.curretnWeight += thing.totalWeight();
        }
    }
    
    public int totalWeight(){
        return this.curretnWeight;
    }
    
    public void printThings(){
        for (Suitcase cas : things) {
            cas.printThings();
        }
    }
    
   

    @Override
    public String toString() {
        if(things.size() == 0){
            return "empty (" + this.curretnWeight + " kg)";
        }else if(things.size() == 1){
            return things.size() + " suitcase (" + this.curretnWeight + " kg)";
        } else{
            return things.size() + " suitcases (" + this.curretnWeight + " kg)";
        }
    }
}
