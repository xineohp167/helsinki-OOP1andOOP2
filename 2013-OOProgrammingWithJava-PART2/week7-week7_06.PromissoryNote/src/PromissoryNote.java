
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fabien
 */
public class PromissoryNote {
    
    // Instance variable
     private HashMap<String, Double> promNote;

    // Constructor
    public PromissoryNote() {
        promNote = new HashMap<String, Double>();
    }
     
    public void setLoan(String toWhom, double value){
        this.promNote.put(toWhom, value);
    }
    
    public double howMuchIsTheDebt(String whose){
        if(this.promNote.containsKey(whose)) {
            return this.promNote.get(whose);
        } else {
        }

        return 0;
    }
}
