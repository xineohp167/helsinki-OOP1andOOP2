/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fabien
 */
public class Book implements ToBeStored{
    
    // Instance variable
    private String writer;
    private String name;
    private double weight;
    
    // Constructor
    public Book(String writer, String name, double weight) {
        this.writer = writer;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return this.writer + ": " + this.name;
    }

    @Override
    public double weight() {
        return this.weight;
    }
    
    
    
}
