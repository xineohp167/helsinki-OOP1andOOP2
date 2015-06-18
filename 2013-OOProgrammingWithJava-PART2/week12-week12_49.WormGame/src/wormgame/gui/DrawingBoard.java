/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package wormgame.gui;

import java.awt.Color;
import java.awt.Graphics;
import java.util.List;
import javax.swing.JPanel;
import wormgame.domain.Piece;
import wormgame.game.WormGame;

/**
 *
 * @author Fabien
 */
public class DrawingBoard extends JPanel implements Updatable{
    
    // Instance variables
    private WormGame workgame;
    private int pieceLength;
    
    // Constructor
    public DrawingBoard(WormGame workgame, int pieceLength) {
        this.workgame = workgame;
        this.pieceLength = pieceLength;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
        g.setColor(Color.BLACK);
        List<Piece> pieces = this.workgame.getWorm().getPieces();
        for (Piece piece : pieces) {
            g.fill3DRect(piece.getX() * pieceLength, piece.getY() * pieceLength, pieceLength, pieceLength, true);
        }
       // g.fill3DRect(workgame.getWorm().getX(), workgame.getWorm().getY(), pieceLength * this.workgame.getWorm().getPieces().size(), pieceLength, true);
        
        g.setColor(Color.RED);
        g.fillOval(workgame.getApple().getX() * pieceLength, workgame.getApple().getY() * pieceLength, pieceLength, pieceLength);
    }

    @Override
    public void update() {
        repaint();
    }
    
    
    
}
