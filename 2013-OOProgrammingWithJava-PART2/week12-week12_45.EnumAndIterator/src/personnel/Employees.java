/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package personnel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Fabien
 */
public class Employees {
    
    // Instance variables
    private List<Person> persons;
    
    // Constructor
    public Employees(){
        persons = new ArrayList<Person>();
    }
    
    public void add(Person person){
        this.persons.add(person);
    }
    
    public void add(List<Person> persons){
        this.persons.addAll(persons);
    }
    
    public void print(){
        Iterator<Person> iterator = this.persons.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    
    public void print(Education education){
        Iterator<Person> iterator = this.persons.iterator();
        while(iterator.hasNext()){
            Person p = iterator.next();
            if(p.getEducation() == education){
                System.out.println(p);
            }
        }
    }
    
    public void fire(Education education){
        Iterator<Person> iterator = this.persons.iterator();
        while(iterator.hasNext()){
            if(iterator.next().getEducation() == education){
                iterator.remove();
            }
        }
    }
}
