/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package phone_search;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 *
 * @author Fabien
 */
public class PersonAddress {
    
    // Instance variables
    private Map<String, Address> personAddr;
    
    // Constructor
    public PersonAddress() {
        personAddr = new HashMap<String, Address>();
    }
    
    public void addAddress(String name, String street, String city){
        this.personAddr.put(name, new Address(street, city));
    }
    
    public Address searchForAddressByName(String name){
        return this.personAddr.get(name);
    }
    
    public String searchforPersonByAddress(String name){
        //ArrayList<Address> addresses = new ArrayList<Address>(this.personAddr.values());
        for (Entry<String, Address> entry : this.personAddr.entrySet() ) {
            if(entry.getValue().getCity().contains(name) || entry.getValue().getStreet().contains(name)){
                return entry.getKey();
            }
        }
        return null;
        
      }

    @Override
    public String toString() {
        String text = "";
        for (Entry<String, Address> entry : this.personAddr.entrySet() ) {
            
               text +=  entry.getKey() + " " + entry.getValue().getStreet() + " " + entry.getValue().getCity() + "\n";
        }
        return text;
    }
    
    
    public Set<String> getAllNames(){
        return this.personAddr.keySet();
    }
    
    public void removeName(String name){
        this.personAddr.remove(name);
    }
    
}
