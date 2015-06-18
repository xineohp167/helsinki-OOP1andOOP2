/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package moving.domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fabien
 */
public class Box implements Thing{
    
    // Instance variables
    private List<Thing> things;
    private int maximumCapacity;
    // private int currentVolume;

    public Box(int maximumCapacity) {
        this.things = new ArrayList<Thing>();
        this.maximumCapacity = maximumCapacity;
        //this.currentVolume = 0;
    }
    
    public boolean addThing(Thing thing){
        if(this.calculateVolume() + thing.getVolume() <= this.maximumCapacity){
            this.things.add(thing);
            return true;
        }
        return false;
    }

    @Override
    public int getVolume() {
        return this.calculateVolume();
    }

    private int calculateVolume() {
        int wholeVolume = 0;
        for (Thing thing : things) {
            wholeVolume += thing.getVolume();
        }
        return wholeVolume;
    }

    @Override
    public String toString() {
        String text = "";
        for (Thing thing : things) {
            text += thing.toString() + " ,";
        }
        return text.substring(0, text.length() - 1);

    }
    
    
    
}
