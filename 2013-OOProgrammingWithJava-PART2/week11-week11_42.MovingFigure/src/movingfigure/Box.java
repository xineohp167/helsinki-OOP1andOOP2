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
public class Box extends Figure{
    
    // Instance variables
    private int width; 
    private int height;
    
    // Constructor
    public Box(int x, int y, int width, int height){
        super(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.fillRect(this.getX(), this.getY(), width, height);
    }
    
}
