/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package week10_arraylistupto;

import java.util.ArrayList;

/**
 *
 * @author Fabien
 */
public class MainTest {
    
    public static void main(String[] args) {
        
        // Initialize
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        ArrayListUpTo<Integer> arrayListUpTo = new ArrayListUpTo<Integer>();
        
        // Adding values
        arrayList.add(0);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        
        arrayListUpTo.add(0);
        arrayListUpTo.add(1);
        arrayListUpTo.add(2);
        arrayListUpTo.add(3);
        arrayListUpTo.add(4);
        arrayListUpTo.add(5);
        
        // Print the lists
        System.out.println(arrayList);
        System.out.println(arrayListUpTo);
    }
    
}
