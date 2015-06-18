/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package farmsimulator;

/**
 *
 * @author Fabien
 */
public class MilkingRobot {
    
    // Instance variables
    private BulkTank bTank;
    
    public MilkingRobot(){
        //bTank = new BulkTank();
    }
    
    public BulkTank getBulkTank(){
       
        return bTank;
    }
    
    public void setBulkTank(BulkTank tank){
        bTank = tank;
    }
    
    public void milk(Milkable milkable) throws java.lang.IllegalStateException{
        double milked = milkable.milk();
        if(bTank == null){
            throw new java.lang.IllegalStateException("The MilkingRobot hasn't been installed");
        }else {
            bTank.addToTank(milked);
        }
    }

}
