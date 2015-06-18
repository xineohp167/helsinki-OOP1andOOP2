/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package farmsimulator;

import java.util.Collection;

/**
 *
 * @author Fabien
 */
public class CowHouse {
    
    // Instance variables
    private BulkTank tank;
    private MilkingRobot milkingRobot;
    
    // Constructor
    public CowHouse(BulkTank tank){
        this.tank = tank;
    }
    
    public BulkTank getBulkTank(){
        return this.tank;
    }
    
    public void installMilkingRobot(MilkingRobot milkingRobot){
        this.milkingRobot = milkingRobot;
    }
    
    public void takeCareOf(Cow cow){
        if(milkingRobot == null){
            throw new IllegalStateException("No milking robot");
        } else{
            milkingRobot.setBulkTank(this.tank);
            milkingRobot.milk(cow);
        }
        
        
    }
    
    public void takeCareOf(Collection<Cow> cows){
        if(milkingRobot == null){
            throw new IllegalStateException("No milking robot");
        } else{
            for (Cow cow : cows) {
                milkingRobot.setBulkTank(tank);
                milkingRobot.milk(cow);
            }
        }
    }

    @Override
    public String toString() {
        return "CowHouse: " + this.tank.toString();
    }

    void setMilkingRobot(MilkingRobot milkingRobot) {
        this.milkingRobot = milkingRobot;
    }
    
    
}
