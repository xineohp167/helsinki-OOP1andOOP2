/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package farmsimulator;

import java.util.Random;

/**
 *
 * @author Fabien
 */
public class Cow implements Alive, Milkable{
    
    // Instance variables
    private String name;
    private Random gen;
    private double udderCapacity;
    private double amountMilk;
    
    // Private Constants
    private static final String[] NAMES = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};
    
    
    // Constructors
    public Cow(String name){
        this.name = name;
        gen = new Random();
        udderCapacity = 15 + new Random().nextInt(26); // between 15-40
        amountMilk = 0;
    }
    
    public Cow(){
       //String randomName = ;
        this(NAMES[new Random().nextInt(NAMES.length)]);
    }
    
    // Methods
    public String getName() {
        return name;
    }

    public double getAmount() {
        return amountMilk;
    }

    public double getCapacity() {
        return udderCapacity;
    }
    
    
    
    

    @Override
    public void liveHour() {
        // cow produces milk 0.7-2 litres. Produced amount is added 
        // to current amount of available milk. Remember to check 
        // that the sum of produced and current amount doesn't exceed the capacity.
        
        double produce = gen.nextDouble()*1.3 + 0.7;
        if(this.amountMilk + produce > this.udderCapacity){
            this.amountMilk = this.udderCapacity;
        } else{
            this.amountMilk += produce;
        }
    }

    @Override
    public double milk() {
        double milk = this.getAmount();
        this.amountMilk = 0;
        return milk;
    }

    @Override
    public String toString() {
        return this.getName() + " " + Math.ceil(amountMilk) + "/" + Math.ceil(udderCapacity);
        
    }
    
    
    
}
