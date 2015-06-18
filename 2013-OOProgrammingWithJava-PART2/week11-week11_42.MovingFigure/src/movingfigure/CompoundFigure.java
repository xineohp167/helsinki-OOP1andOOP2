/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package movingfigure;

import java.awt.Graphics;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Fabien
 */
public class CompoundFigure extends Figure{
    
    // Instance variables
    private List<Figure> figures = new ArrayList<Figure>();

    // Constructor
    /**
     *
     */
    public CompoundFigure() {
        super(0, 0);
    }

        

    @Override
    public void move(int dx, int dy) {
        for (Figure figure : figures) {
            figure.move(dx, dy);
        }
        //super.move(dx, dy); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void add(Figure figure){
        this.figures.add(figure);
    }

    @Override
    public void draw(Graphics graphics) {
        for (Figure figure : figures) {
            figure.draw(graphics);
        }
    }
    
}
