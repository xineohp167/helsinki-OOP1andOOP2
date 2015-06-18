
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fabien
 */
public class Storehouse {
    
    // Instance variables
    private Map<String, Integer> prices = new HashMap<String, Integer>();
    private Map<String, Integer> stocks = new HashMap<String, Integer>();
    
    // Methods
    public void addProduct(String product, int price, int stock){
        if(!this.prices.containsKey(product)){
            this.prices.put(product, price);
        }
        if(!this.stocks.containsKey(product)){
            this.stocks.put(product, stock);
        }
        
    }
    
    public int price(String product){
        if(this.prices.containsKey(product)){
            return this.prices.get(product);
        } else{
            return -99;
        }
        
    }
    
    public int stock(String product){
        if(this.stocks.containsKey(product)){
            return this.stocks.get(product);
        } else{
            return 0;
        }
        
    }
    
    public boolean take(String product){
        if(!this.stocks.containsKey(product) || this.stocks.get(product) == 0){
            return false;
        }
        stocks.put(product, stocks.get(product) - 1);
        return true;
    }
    
    public Set<String> products(){
        return this.prices.keySet();
    }
    
}
