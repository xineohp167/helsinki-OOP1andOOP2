/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fabien
 */
public class AverageSensor implements Sensor{
    // Instance variables
    private ArrayList<Sensor> sensors = new ArrayList<Sensor>();
    private List<Integer> temperatures = new ArrayList<Integer>();

    @Override
    public boolean isOn() {
        boolean isOn = true;
        for (int i = 0; i < sensors.size() && isOn; i++) {
            if(!sensors.get(i).isOn()){
                isOn = false;
            }
        }
         return isOn;
    }

    @Override
    public void on() {
        for (Sensor sensor : sensors) {
            sensor.on();
        }
    }

    @Override
    public void off() {
        if(sensors.get(0).isOn()){
            sensors.get(0).off();
        }
    }

    @Override
    public int measure() {
        if(sensors.isEmpty() || !this.isOn()){
            throw new IllegalStateException("No sensors or they ara off.");
        }
        int result = 0;
        for (Sensor sensor : sensors) {
            result += sensor.measure();
        }
        int temperature = result / sensors.size();
        temperatures.add(temperature);
        return temperature;
    }
    
    public void addSensor(Sensor sensor){
        sensors.add(sensor);
    }
    
    public List<Integer> readings(){
        return temperatures;
    }
    
}
