/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fabien
 */
public class Player {
    
    // Instance variables
    private String name;
    private int numGoals;
    
    // Constructors
    public Player(String name, int goals){
        this.name = name;
        this.numGoals = goals;
    }
    
    public Player(String name){
        this(name, 0);
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the numGoals
     */
    public int goals() {
        return numGoals;
    }
    
    public String toString(){
        return this.name + ", goals " + this.numGoals;
    }
    
}
