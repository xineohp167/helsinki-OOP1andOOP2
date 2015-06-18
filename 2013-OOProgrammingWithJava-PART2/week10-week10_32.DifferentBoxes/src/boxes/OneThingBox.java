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
public class OneThingBox extends Box{
    // Instance variables
     private List<Thing> things = new ArrayList<Thing>();

    @Override
    public void add(Thing thing) {
        if(things.size() < 1){
            things.add(thing);
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return things.contains(thing);
    }
    
}
