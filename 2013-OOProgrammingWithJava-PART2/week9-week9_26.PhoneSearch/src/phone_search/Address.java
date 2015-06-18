/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package phone_search;

/**
 *
 * @author Fabien
 */
public class Address {
    
    // Instance variables
    private String street;
    private String city;

    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }
    
    public String getAddress(){
        if(getCity().isEmpty() && getStreet().isEmpty()){
            return "address unknown";
        }else{
            return "address: " + getStreet() + " " + getCity();
        }
    }
    
    

    @Override
    public String toString() {
        // street: ida ekmanintie
        // city: helsinki
        return "street: " + getStreet() + "\n" + "city: " + getCity() + "\n";
    }
    
    
    
}
