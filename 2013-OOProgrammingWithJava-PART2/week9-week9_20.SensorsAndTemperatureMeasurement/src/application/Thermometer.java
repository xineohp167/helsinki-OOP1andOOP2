/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package application;

import java.util.Random;

/**
 *
 * @author Fabien
 */
public class Thermometer implements Sensor{
    // Instance variables
    private boolean isOn;
    private Random gen = new Random();
    
    // Constructor
    public Thermometer() {
        this.isOn = false;
    }
    

    @Override
    public boolean isOn() {
        return this.isOn;
    }

    @Override
    public void on() {
        this.isOn = true;
    }

    @Override
    public void off() {
        this.isOn = false;
    }

    @Override
    public int measure() {
        if(isOn() == false){
            throw new IllegalStateException("The sensor is off.");
        }
        return gen.nextInt(61) - 30;

    }
    
}
