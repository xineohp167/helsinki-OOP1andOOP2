/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package application;

/**
 *
 * @author Fabien
 */
public class ConstantSensor implements Sensor{
    
    // Instance variables
    private int temperature;

    public ConstantSensor(int temperature) {
        this.temperature = temperature;
    }
    
    

    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void on() {
        // Do nothing
    }

    @Override
    public void off() {
        // Do nothing
    }

    @Override
    public int measure() {
        return this.temperature;
    }
    
}
