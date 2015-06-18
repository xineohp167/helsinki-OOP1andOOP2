/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package wormgame.domain;

/**
 *
 * @author Fabien
 */
public class Piece {
    
    // Instance variables
    private int x;
    private int y;
    
    // Constructor
    public Piece(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ")";
    }
    
    public boolean runsInto(Piece piece){
        return this.getX() == piece.getX() && this.getY() == piece.getY();
    }
    
}
