
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fabien
 */
public class Phonebook {
    
    // Instance variables
    private ArrayList<Person> people;
    
    // Constructor
    public Phonebook() {
        people = new ArrayList<Person>();
    }
    
    public void add(String name, String number){
        people.add(new Person(name, number));
    }
    
    public void printAll(){
        for (Person person : people) {
            System.out.println(person);
        }
    }
    
    public String searchNumber(String name){
        boolean found = false;
        int index = 0;
        for (int i = 0; i < people.size() && !found; i++) {
            if(people.get(i).getName().equals(name)){
                found = true;
                index = i;
          
            }
            
        }
        if(found){
            return people.get(index).getNumber();
        } else{
            return "number not known";
        }
       
    }
    
}
