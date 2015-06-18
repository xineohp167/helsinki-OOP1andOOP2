/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package week11_movingball;

import javax.swing.SwingUtilities;

/**
 *
 * @author Fabien
 */
public class Week11_MovingBall {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        UserInterface ui = new UserInterface(new Avatar(30, 30));
        SwingUtilities.invokeLater(ui);
    }
    
}
