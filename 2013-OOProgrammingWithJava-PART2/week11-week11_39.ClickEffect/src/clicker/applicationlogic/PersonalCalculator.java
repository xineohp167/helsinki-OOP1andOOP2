/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clicker.applicationlogic;

/**
 *
 * @author Fabien
 */
public class PersonalCalculator implements Calculator{
    
    // Instance variables
    private int value = 0;

    @Override
    public int giveValue() {
        return value;
    }

    @Override
    public void increase() {
        value++;
    }
    
}
