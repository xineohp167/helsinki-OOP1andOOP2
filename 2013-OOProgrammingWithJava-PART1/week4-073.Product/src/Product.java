/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fabien
 */
public class Product {
    
    // Instance variables
    private String name;
    private double price;
    private int amount;
    
    public Product (String nameAtStart, double priceAtStart, int amountAtStart){
        this.name = nameAtStart;
        this.price = priceAtStart;
        this.amount = amountAtStart;
    }
    
    public void printProduct(){
        System.out.println(this.name + ", price " + price + ", amount " + amount);
    }
    
}