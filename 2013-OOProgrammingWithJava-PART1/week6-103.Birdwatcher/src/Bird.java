/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fabien
 */
public class Bird {
    
    // Instance variables
    private String name;
    private String latinName;
    private int observed;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observed = 0;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the latinName
     */
    public String getLatinName() {
        return latinName;
    }

    /**
     * @return the observed
     */
    public int getObserved() {
        return observed;
    }

    /**
     * @param observed the observed to set
     */
    public void setObserved(int observed) {
        this.observed += observed;
    }
    
    @Override
    public String toString(){
        return this.name + " (" + this.latinName + "): " + this.observed + " observations";
    }
    
    
}
