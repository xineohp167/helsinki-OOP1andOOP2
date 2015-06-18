/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package movable;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fabien
 */
public class Group implements Movable{
    
    // Instance variables
    private List<Movable> group;

    public Group() {
        group = new ArrayList<Movable>();
    }
    
    public void addToGroup(Movable movable){
        group.add(movable);
    }
    

    @Override
    public void move(int dx, int dy) {
        for (Movable movable : group) {
            movable.move(dx, dy);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Movable movable : group) {
            sb.append(movable.toString()).append("\n");
        }
        return sb.toString();
    }
    
    
    
}
