/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package reference;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

/**
 *
 * @author Fabien
 */
public class RatingRegister {
    
    // Instance variables
    private Map<Film, List<Rating>> filmRatings;
    private Map<Person, Map<Film, Rating>> personRatings;
    
    // Constructor
    public RatingRegister(){
    filmRatings = new HashMap<Film, List<Rating>>();
    personRatings = new HashMap<Person, Map<Film, Rating>>();
}
    
    public void addRating(Film film, Rating rating){
        if(!this.filmRatings.containsKey(film)){
            this.filmRatings.put(film, new ArrayList<Rating>());
        }
        this.filmRatings.get(film).add(rating);
    }
    
    public void addRating(Person person, Film film, Rating rating){
        addRating(film, rating);
        Map<Film, Rating> innerMap = this.personRatings.get(person);
        if(innerMap == null){
            innerMap =  new HashMap<Film, Rating>();
        }
        innerMap.put(film, rating);
        this.personRatings.put(person, innerMap);
//        System.out.println("in addRating");
//        System.out.println(innerMap);
//        System.out.println(this.personRatings.get(person));
//        System.out.println("End of addRating");
        
    }
            
    public List<Rating> getRatings(Film film){
        return this.filmRatings.get(film);
    }
    
    public Map<Film, List<Rating>> filmRatings(){
        return this.filmRatings;
    }
    
    public Rating getRating(Person person, Film film){
       Map<Film, Rating> innerMap = this.personRatings.get(person);
       if(innerMap == null){
           //System.out.println("innerMap == null");
           return Rating.NOT_WATCHED;
       }
       if(!innerMap.containsKey(film)){
           //System.out.println("!innerMap.containsKey(film)");
           //System.out.println(innerMap);
           return Rating.NOT_WATCHED;
       }
       return innerMap.get(film);
    }
    
    public Map<Film, Rating> getPersonalRatings(Person person){
        Map<Film, Rating> innerMap = this.personRatings.get(person);
        if(innerMap == null){
            return innerMap = new HashMap<Film, Rating>();
        }
        return this.personRatings.get(person);
    }
    
    public List<Person> reviewers(){
        return new ArrayList(this.personRatings.keySet());
    }
}
