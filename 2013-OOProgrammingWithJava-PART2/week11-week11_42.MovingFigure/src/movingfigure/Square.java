/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package movingfigure;

import java.awt.Graphics;

/**
 *
 * @author Fabien
 */
public class Square extends Figure{
    
    // Instance variables
    private int sideLength;
    
    // Constructor
    public Square(int x, int y, int sideLength){
        super(x, y);
        this.sideLength = sideLength;
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.fillRect(this.getX(), this.getY(), sideLength, sideLength);
    }
    
}
