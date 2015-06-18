/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package week11_calculator;

/**
 *
 * @author Fabien
 */
public class TestApplicationLogic {
    
    public static void main(String[] args) {
        ApplicationLogic al = new ApplicationLogic();
        int result = al.result();
        System.out.println(result);
        al.plus(10);
        result = al.result();
        System.out.println(result);
    }
    
}
