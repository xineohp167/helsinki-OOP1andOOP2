/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fabien
 */
public class House {
    
    private Apartment apartment;
    private double  price;

    public House(Apartment apartment) {
        this.apartment = apartment;
    }
    
    public boolean moreExpensive(House other){
        return this.price - other.price > 0;
                
    }
    
}
