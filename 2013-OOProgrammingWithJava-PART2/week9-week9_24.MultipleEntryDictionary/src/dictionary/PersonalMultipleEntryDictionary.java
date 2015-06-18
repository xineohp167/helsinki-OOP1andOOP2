/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dictionary;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Fabien
 */
public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary{
    
    // instance variables
    private Map<String, Set<String>> dicts = new HashMap<String, Set<String>>();

    @Override
    public void add(String word, String entry) {
        if(!this.dicts.containsKey(word)){
            this.dicts.put(word, new HashSet<String>() );
        }
        
        this.dicts.get(word).add(entry);
    }

    @Override
    public Set<String> translate(String word) {
        return this.dicts.get(word);
    }

    @Override
    public void remove(String word) {
        this.dicts.remove(word);
        
    }
    
    
}
