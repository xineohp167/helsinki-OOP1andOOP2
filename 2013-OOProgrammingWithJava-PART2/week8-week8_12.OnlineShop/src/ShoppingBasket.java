
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fabien
 */
public class ShoppingBasket {
    
    // Instance varaible
    private Map<String, Purchase> baskets = new HashMap<String, Purchase>();
    
    // Methods
    public void add(String product, int price){
        if(!this.baskets.containsKey(product)){
            Purchase purchase = new Purchase(product, 1, price);
            this.baskets.put(product, purchase);
        } else{
            this.baskets.get(product).increaseAmount();
        }
    }
    
    public int price(){
        int totalPrice = 0;
        for(Purchase p : this.baskets.values()){
            totalPrice += p.price();
        }
        return totalPrice;
    }
    
    public void print(){
        for(Purchase p : this.baskets.values()){
            System.out.println(p.toString());
        }
    }
    
}
