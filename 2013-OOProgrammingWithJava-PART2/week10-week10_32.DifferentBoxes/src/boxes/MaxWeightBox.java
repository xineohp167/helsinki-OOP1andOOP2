/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package boxes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fabien
 */
public class MaxWeightBox extends Box{
    
    // Instance variables
    private int maxWeight;
    //private int currentWeight;
    private List<Thing> things;
    
    // Constructor
    public MaxWeightBox(int maxWeight){
        this.maxWeight = maxWeight;
        //currentWeight = 0;
        this.things = new ArrayList<Thing>();
    }

    @Override
    public void add(Thing thing) {
        if(thing.getWeight() <= this.maxWeight){
            this.things.add(thing);
            this.maxWeight -= thing.getWeight();
        }
        
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return this.things.contains(thing);
    }
    
}
