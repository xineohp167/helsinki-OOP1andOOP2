/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package game;

import gameoflife.GameOfLifeBoard;
import java.util.Random;

/**
 *
 * @author Fabien
 */
public class PersonalBoard extends GameOfLifeBoard {
    
    public PersonalBoard(int width, int height) {
        super(width, height);
    }

    @Override
    public void initiateRandomCells(double d) {
        boolean[][] board = getBoard();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(new Random().nextDouble() < d){
                    board[i][j] = true;
                }
                
            }
            
        }
    }

    @Override
    public boolean isAlive(int i, int i1) {
        if(!(0 <= i && i< this.getWidth())){
            return false;
        }
        if(!(0 <= i1 && i1< this.getHeight())){
            return false;
        }
        return getBoard()[i][i1];
    }

    @Override
    public void turnToLiving(int i, int i1) {
        if(!(0 <= i && i<= this.getWidth())){
            return;
        }
        if(!(0 <= i1 && i1<= this.getHeight())){
            return;
        }
        getBoard()[i][i1] = true;
    }

    @Override
    public void turnToDead(int i, int i1) {
        if(!(0 <= i && i<= this.getWidth())){
            return;
        }
        if(!(0 <= i1 && i1<= this.getHeight())){
            return;
        }
        getBoard()[i][i1] = false;
    }
    
    private boolean inBoard(int i, int i1){
        if(!(0 <= i && i< this.getWidth())){
            return false;
        }
        if(!(0 <= i1 && i1< this.getHeight())){
            return false;
        }
        return true;
    }

    @Override
    public int getNumberOfLivingNeighbours(int i, int i1) {
        int liveCells = 0;
        boolean[][] board = getBoard();
        for (int j = -1; j <= 1; j++) {
            for (int j1 = -1; j1 <= 1; j1++){
                if(inBoard(i + j, i1 + j1)){
                    if(board[i + j][i1 + j1] && ((j != 0) || (j1 != 0))){
                       liveCells++; 
                    }
                }
            }
        }
        return liveCells ;
    }

    @Override
    public void manageCell(int i, int i1, int i2) {
        if(this.isAlive(i, i1)){
            if(i2 < 2){
                this.turnToDead(i, i1);
            } else if(i2 < 4){
                this.turnToLiving(i, i1);
            } else{
                this.turnToDead(i, i1);
            }
            
        }else{
            if(i2 == 3){
                this.turnToLiving(i, i1);
            }
        }
    }
    
}
