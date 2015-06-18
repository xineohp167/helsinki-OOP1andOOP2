/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package farmsimulator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fabien
 */
public class Farm implements Alive{
    
    // Instance variables
    private String name;
    private CowHouse cowHouse;
    private List<Cow> cows;
    
    // Constructor
    public Farm(String name, CowHouse cowHouse) {
        this.name = name;
        this.cowHouse = cowHouse;
        cows = new ArrayList<Cow>();
    }
    

    @Override
    public void liveHour() {
        for (Cow cow : cows) {
            cow.liveHour();
        }
    }
    
    public String getOwner(){
        return this.name;
    }
    
    public void addCow(Cow cow){
        cows.add(cow);
    }
    
    public void manageCows(){
        this.cowHouse.takeCareOf(cows);
    }
    
    public void installMilkingRobot(MilkingRobot milkingRobot){
        this.cowHouse.installMilkingRobot(milkingRobot);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Farm owner: ").append(this.name).append("\n");
        String cowHouseString = this.cowHouse.toString();
        String newcowHouseString = cowHouseString.replace("CowHouse:", "CowHouse bulk tank:");
        stringBuilder.append(newcowHouseString).append("\n");
        stringBuilder.append("Animals:").append("\n");
        if(this.cows.isEmpty()){
            stringBuilder.append("No cows.");
        } else{
            for (Cow cow : cows) {
                stringBuilder.append("        ").append(cow.toString()).append("\n");
            }
        }
        return  stringBuilder.toString();
    }
    
    
    
}
