
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
public class Box implements ToBeStored {
    
    // Instance variable
    private ArrayList<ToBeStored> boxes;
    private double maxWeight;
    private double weight;
    
    // Constructor
    public Box(double maxWeight) {
        this.boxes = new ArrayList<ToBeStored>();
        this.maxWeight = maxWeight;
    }

    @Override
    public double weight() {
        double weight = 0;
        // it calculates the total weight of the things which had been stored
        for(ToBeStored tb : boxes){
            weight += tb.weight();
        }
        return weight;
    }
    
    public void add(ToBeStored tbs){
        if(this.weight + tbs.weight() <= this.maxWeight){
            this.boxes.add(tbs);
            this.weight += tbs.weight();
        }
    }

    @Override
    public String toString() {
        String result = String.format("Box: %d things, total weight %.1f kg", this.boxes.size(), this.weight());
        return result;
    }
    
    
    
    
}
