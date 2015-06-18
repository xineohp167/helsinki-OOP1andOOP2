/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package phone_search;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 *
 * @author Fabien
 */
public class PersonNumber {
    
    // Instance variables
    private Map<String, List<String>> personNums;
    private Map<String, List<String>> numPersons;

    public PersonNumber() {
        personNums = new HashMap<String, List<String>>();
        numPersons = new HashMap<String, List<String>>();
    }
    
    // Methods
    public void addPersonNumbers(String name, String number){
        // Map an empty ArrayList from name to numbers
        if(!personNums.containsKey(name)){
            personNums.put(name, new ArrayList<String>() );
        }
        
        // Map an empty ArrayList from number to names
        if(!numPersons.containsKey(number)){
            numPersons.put(number, new ArrayList<String>() );
        }
        
        this.personNums.get(name).add(number);
        this.numPersons.get(number).add(name);
                
    }
    
    public List<String> searchForNumbersByName(String name){
        return this.personNums.get(name);
    }
    
    public List<String> searchForNamesByNumber(String number){
        return this.numPersons.get(number);
    }
    
    public Set<String> getAllNames(){
        return this.personNums.keySet();
    }
    
    public void removeName(String name){
        this.personNums.remove(name);
        // Now remove from numPersons
        Set<String> numbers = new HashSet<String>();
        for (Entry<String, List<String>> entry : this.numPersons.entrySet()) {
            if(entry.getValue().contains(name)){
                numbers.add(entry.getKey());
            }
        }
        for (String number : numbers) {
            this.numPersons.remove(number);
        }
        
    }
    
    
}
