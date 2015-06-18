/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package containers;

/**
 *
 * @author Fabien
 */
public class ProductContainerRecorder extends ProductContainer{
    // Instance variables
    private ContainerHistory conHistory = new ContainerHistory();

    public ProductContainerRecorder(String productName, double capacity, double initialVolume) {
        super(productName, capacity);
        this.addToTheContainer(initialVolume);
        //conHistory.add(initialVolume);
    }
    
    public void addToTheContainer(double amount){
        super.addToTheContainer(amount);
        conHistory.add(this.getVolume());
    }
    
    public double takeFromTheContainer(double amount){
        
        double vol = super.takeFromTheContainer(amount);
        conHistory.add(this.getVolume());
        return vol;
        
        
    }
    
    public String history(){
        return conHistory.toString();
    }
    
    
    public void printAnalysis(){
        System.out.println("Product: " + this.getName()); // Juice
        System.out.println("History: " + this.history());// History: [1000.0, 988.7, 989.7]
        System.out.println("Greatest product amount: " + conHistory.maxValue()); // Greatest product amount: 1000.0
        System.out.println("Smallest product amount: " + conHistory.minValue()); // Smallest product amount: 988.7
        System.out.println("Average: " + conHistory.average()); // Average: 992.8
        System.out.println("Greatest change: " + conHistory.greatestFluctuation());// Greatest change: 11.299999999999955
        System.out.println("Variance: " + conHistory.variance()); // Variance: 39.129999999999676
    }
}
