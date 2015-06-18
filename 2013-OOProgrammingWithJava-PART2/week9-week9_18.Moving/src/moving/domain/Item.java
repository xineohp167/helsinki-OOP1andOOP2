/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package moving.domain;

/**
 *
 * @author Fabien
 */
public class Item implements Thing, Comparable<Item>{
    
    // Instance variables
    private String name;
    private int volume;

    public Item(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }
    
    public String getName(){
        return this.name;
    }

    @Override
    public int getVolume() {
        return this.volume;
    }

    @Override
    public String toString() {
        // name (volume dm^3)
        return this.name + " (" + this.volume + " dm^3)";
    }

    @Override
    public int compareTo(Item other) {
        return this.getVolume() - other.getVolume();
    }
    
    
    
}
