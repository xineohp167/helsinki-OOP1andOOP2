/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fabien
 */
//import java.util.UUID;

public class Main {

    public static void main(String[] args) {
        //Weight should increase when box contains another box and a new item is added to the inner box!
        Box isoBox = new Box(20); 
        Box laatikko = new Box(10); 
        isoBox.add(laatikko);
        laatikko.add( new Book("Horstman", "Core Java",5) );
        System.out.println(isoBox.weight());
       
         //expected:<5.0> but was:<0.0>
//        UUID uuid = UUID.randomUUID();
//        System.out.println(uuid);
    }
    
    
    
}
