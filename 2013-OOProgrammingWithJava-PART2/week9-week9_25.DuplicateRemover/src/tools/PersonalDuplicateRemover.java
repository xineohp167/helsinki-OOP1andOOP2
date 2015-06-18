/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tools;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Fabien
 */
public class PersonalDuplicateRemover implements DuplicateRemover{
    
    // instance variables
    private Set<String> dicts;
    private int duplicates;

    public PersonalDuplicateRemover() {
        this.duplicates = 0;
        dicts = new HashSet<String>();
    }
    
    

    @Override
    public void add(String characterString) {
        if(dicts.contains(characterString)){
            this.duplicates++;
        } else{
            dicts.add(characterString);
        }
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return this.duplicates;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        return dicts;
    }

    @Override
    public void empty() {
        this.dicts.clear();
        this.duplicates = 0;
    }
    
}
