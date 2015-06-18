/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package reader.criteria;

import java.util.ArrayList;

/**
 *
 * @author Fabien
 */
public class AtLeastOne implements Criterion{
    
    // Instance variables
    private ArrayList<Criterion> crits;
    
    // Constructor
    public AtLeastOne(Criterion... crit){
        crits = new ArrayList<Criterion>();
        for (int i = 0; i < crit.length; i++) {
            crits.add(crit[i]);
        }
    }
    

    @Override
    public boolean complies(String line) {
        for (Criterion criterion : crits) {
            if(criterion.complies(line)){
                return true;
            }
        }
        return false;
    }
    
}
