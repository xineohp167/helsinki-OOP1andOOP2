/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javarobotscreenshot;

import java.awt.AWTException;
import java.io.IOException;

/**
 *
 * @author Fabien
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws AWTException, IOException {
        // TODO code application logic here
        ScreenShot screenShot = new ScreenShot();
        screenShot.catchArea(100, 100, 400, 400);
        screenShot.catchScreen();
        screenShot.catchScreenForNSeconds(10);
       
        
    }
    
}
