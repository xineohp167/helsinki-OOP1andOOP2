/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package reference.comparator;

import java.util.Comparator;
import java.util.Map;
import reference.domain.Person;

/**
 *
 * @author Fabien
 */
public class PersonComparator implements Comparator<Person>{
    
    // Instance variables
    Map<Person, Integer> peopleIdentities;
    // Constructor
    public PersonComparator(Map<Person, Integer> peopleIdentities){
        this.peopleIdentities = peopleIdentities;
        
    }

    @Override
    public int compare(Person o1, Person o2) {
        return this.peopleIdentities.get(o2) - this.peopleIdentities.get(o1);
    }
    
}
