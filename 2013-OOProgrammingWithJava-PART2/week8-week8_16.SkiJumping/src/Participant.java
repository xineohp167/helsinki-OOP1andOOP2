
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fabien
 */
public class Participant implements Comparable<Participant>{
    
    // Instance variables
    private String name;
    private int result;
    private ArrayList<Integer> lengths;

    public Participant(String name) {
        this.name = name;
        this.result = 0;
        this.lengths = new ArrayList<Integer>();
    }

    public String getName() {
        return name;
    }

    public int getResult() {
        return result;
    }
    
    public void setResult(int result) {
        this.result += result;
    }

    public ArrayList<Integer> getLengths() {
        return lengths;
    }

    public void addLengths(int length) {
        this.lengths.add(length);
    }
    
    

    @Override
    public String toString() {
        // Mikael (134 points)
        return this.name + " (" + this.result + " points)";
    }

    @Override
    public int compareTo(Participant other) {
        return this.result - other.result;
    }

    
    
}
