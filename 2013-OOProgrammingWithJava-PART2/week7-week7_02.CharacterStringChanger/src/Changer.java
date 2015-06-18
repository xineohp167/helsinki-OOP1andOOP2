
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
public class Changer {
    
    // Instance variables
    private ArrayList<Change> changes;
    
    // Constructor
    public Changer() {
        changes = new ArrayList<Change>();
    }
    
    public void addChange(Change change){
        changes.add(change);
    }
    
    public String change(String characterString){
        String result = characterString;
        for (Change change : changes) {
            result = change.change(result);
        }
        return result;
    }
}
