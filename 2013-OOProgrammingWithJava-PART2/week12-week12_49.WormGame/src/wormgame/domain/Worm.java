/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package wormgame.domain;

import java.util.ArrayList;
import java.util.List;
import wormgame.Direction;



/**
 *
 * @author Fabien
 */
public class Worm {
    
    // Instance variables
    private List<Piece> pieces;
    private Direction dir;
    private int x;
    private int y;
    private boolean toGrow = false;
    
    // Constructor
    public Worm(int originalX, int originalY, Direction originalDirection){
        this.x = originalX;
        this.y = originalY;
        this.dir = originalDirection;
        this.pieces = new ArrayList<Piece>();
        pieces.add(new Piece(x, y));
    }
    
    public Direction getDirection(){
        return this.dir;
    }
    
    public void setDirection(Direction dir){
        this.dir = dir;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    
    
    public List<Piece> getPieces(){
        return this.pieces;
    }
    
    public int getLength(){
        return getPieces().size();
    }
    
    public void move(){
        if(this.getLength() < 3){
            addPiece();
            return;
        }
        addPiece();
        if(this.toGrow){
            this.toGrow = false;
            return;
        }
        this.pieces.remove(0);
        
    }
    
    public void grow(){
        if(this.getLength() >= 3){
            this.toGrow = true;
        }
        
    }
    
    public void addPiece(){
        x = this.pieces.get(getLength() - 1).getX();
        y = this.pieces.get(getLength() - 1).getY();
        if(dir == Direction.UP){
            y--;
        } else if(dir == Direction.DOWN){
            y++;
        }else if(dir == Direction.RIGHT){
            x++;
        }else if(dir == Direction.LEFT){
            x--;
        }
        Piece piece = new Piece(x, y);
        this.pieces.add(piece);
    }
    
    public boolean runsInto(Piece otherPiece){
        for (Piece piece : pieces) {
            if(piece.runsInto(otherPiece)){
                return true;
            }
        }
        return false;
    }
    
//    public int getX(){
//        return this.pieces.get(this.pieces.size()-1).getX();
//    }
//    public int getY(){
//        return this.pieces.get(this.pieces.size()-1).getY();
//    }

    public boolean runsIntoItself(){
        for (int i = 0; i < this.pieces.size()-1; i++) {
            if(this.pieces.get(i).runsInto(this.pieces.get(this.pieces.size() -1))){
                return true;
            }
        }
        return false;
    }
}
