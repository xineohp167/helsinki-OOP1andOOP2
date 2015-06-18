/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package movable;

/**
 *
 * @author Fabien
 */
public class Organism implements Movable{
    
    // Instance variables
    private int x;
    private int y;

    public Organism(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    

    @Override
    public void move(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    @Override
    public String toString() {
        // x: 3; y: 6
        return "x: " + this.x + "; y: " + this.y;
    }
    
    
    
}
