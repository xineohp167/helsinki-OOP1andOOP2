/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package reader.criteria;

/**
 *
 * @author Fabien
 */
public class Not implements Criterion{
    
    // Instance variables
    private Criterion crit;
    
    // Constructor
    public Not(Criterion crit) {
        this.crit = crit;
    }
    

    @Override
    public boolean complies(String line) {
        return !crit.complies(line);
    }
    
}
