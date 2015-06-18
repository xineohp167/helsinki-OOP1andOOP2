
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Fabien
 */
public class NightSky {

    // Instance variables
    // density (double), width (int), height (int) and starsInLastPrint (int)
    private double density;
    private int width;
    private int height;
    private int starsInLastPrint;

    // Constructors
    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
        starsInLastPrint = 0;
    }

    public NightSky(int width, int height) {
        this.density = 0.1;
        this.width = width;
        this.height = height;
        starsInLastPrint = 0;
    }

    public NightSky(double density) {
        this.density = density;
        this.width = 20;
        this.height = 10;
        starsInLastPrint = 0;
    }

    public void printLine() {

        for (int j = 0; j < width; j++) {
            printStarOrSpace();
        }
        System.out.println("");

    }
    
    public void print(){
        this.starsInLastPrint = 0;
        for (int i = 0; i < height; i++) {
            printLine();
        }
    }
    
    public int starsInLastPrint(){
        
        return starsInLastPrint;
    }

    private void printStarOrSpace() {
        Random gen = new Random();
        if (gen.nextDouble() <= this.density) {
            System.out.print("*");
            starsInLastPrint++;
        } else {
            System.out.print(" ");
        }
    }

}
