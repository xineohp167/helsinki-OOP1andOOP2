/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package moving.logic;

import java.util.ArrayList;
import java.util.List;
import moving.domain.*;
/**
 *
 * @author Fabien
 */
public class Packer {
    
    // Instance variables
    private int boxesVolume;
    private List<Box> boxes;

    public Packer(int boxesVolume) {
        this.boxesVolume = boxesVolume;
        this.boxes = new ArrayList<Box>();
    }
    
    public List<Box> packThings(List<Thing> things){
        Box box = new Box(this.boxesVolume);
        for (Thing thing : things) {
            if(!box.addThing(thing)){
                boxes.add(box);
                box = new Box(this.boxesVolume);
                box.addThing(thing);
            }
        }
        boxes.add(box);
        return boxes;
    }
    
    
    // Solution for every item in separate box
//    public List<Box> packThings(List<Thing> things){
//        ArrayList<Box> boxes = new ArrayList<Box>();
// 
//        for (Thing t : things) {
//            Box ml = new Box(boxesVolume);
//            ml.addThing(t);
//            boxes.add(ml);
//        }
// 
//        return boxes;
//    }
    
}
