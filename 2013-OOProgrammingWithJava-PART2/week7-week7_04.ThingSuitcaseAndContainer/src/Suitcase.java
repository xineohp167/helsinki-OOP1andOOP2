
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
public class Suitcase {
    
    // Instance variables
    private int maxWeight;
    private ArrayList<Thing> things;
    private int curretnWeight;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.things = new ArrayList<Thing>();
        curretnWeight = 0;
    }
    
    public void addThing(Thing thing){
        if((this.curretnWeight + thing.getWeight()) <= this.maxWeight){
            things.add(thing);
            this.curretnWeight += thing.getWeight();
        }
    }
    
    public int totalWeight(){
        return this.curretnWeight;
    }
    
    public void printThings(){
        for (Thing thing : things) {
            System.out.println(thing);
        }
    }
    
    public Thing heaviestThing(){
        if(things.size() == 0) return null;
        Thing heaviest = things.get(0);
        for (int i = 1; i < things.size(); i++) {
            if(things.get(i).getWeight() > heaviest.getWeight()){
                heaviest = things.get(i);
            }
        }
        return heaviest;
    }

    @Override
    public String toString() {
        if(things.size() == 0){
            return "empty (" + this.curretnWeight + " kg)";
        }else if(things.size() == 1){
            return things.size() + " thing (" + this.curretnWeight + " kg)";
        } else{
            return things.size() + " things (" + this.curretnWeight + " kg)";
        }
    }
    
    
}
