/*
 * Creates java.awt.Robot to capture the whole screen or part of it
 */

package javarobotscreenshot;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 * Creates java.awt.Robot to capture the whole screen or part of it
 * @author Fabien
 */
public class ScreenShot {
    
    // Instance variables
    private Robot robot;
    
    // Constructor
    public ScreenShot() throws AWTException{
        robot  = new Robot();
    }
    
    /**
     * Captures a screen shot of a particular area on the screen
     * @param x the initial x point
     * @param y the initial y point
     * @param width the width of the rectangle
     * @param height the height of the rectangle
     * @throws java.io.IOException
     */
    public void catchArea(int x, int y, int width, int height) throws IOException{
        // Capture a particular area on the screen
//        int x0 = x;
//        int y0 = 100;
//        int widthRect = width;
//        int heightRect = height;
        Rectangle area = new Rectangle(x, y, width, height);
        BufferedImage bufferedImage = robot.createScreenCapture(area);
        saveFile(bufferedImage);
    }

    private void saveFile(BufferedImage bufferedImage) throws IOException {
        int count = 0;
        String fName = "image" + count + ".jpg";
        File outputfile = new File(fName);
        while(outputfile.exists()){
            count++;
            fName = "image" + count + ".jpg";
            outputfile = new File(fName);
        }
        
        ImageIO.write(bufferedImage, "jpg", outputfile);
        
    }
    
    /**
     * Creates screen shot
     * @throws IOException 
     */
    public void catchScreen() throws IOException{
        Rectangle area = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        BufferedImage bufferedImage = robot.createScreenCapture(area);
        saveFile(bufferedImage);
    }
    
    /**
     * Creates screen shot every second for n seconds
     * @param seconds the duration in seconds for which in every second 
     * will be taken screen shot
     * @throws java.io.IOException
     */
    public void catchScreenForNSeconds(int seconds) throws IOException{
        for (int i = 0; i < seconds; i++) {
            this.catchScreen();
            this.robot.delay(1000); // wait 1 second
        }
        
    }
    
}
