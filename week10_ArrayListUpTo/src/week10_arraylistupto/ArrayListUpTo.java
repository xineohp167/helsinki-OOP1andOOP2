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
 *  Extends java.util.ArrayList and limits the adding elements
 */
public class ArrayListUpTo<E> extends ArrayList<E>{

    @Override
    public boolean add(E e) {
        if(this.size() < 2){
            return super.add(e); //To change body of generated methods, choose Tools | Templates.
        } else {
            return false;
        }
    }

}
