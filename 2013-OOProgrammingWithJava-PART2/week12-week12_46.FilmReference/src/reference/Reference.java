/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package reference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import reference.comparator.FilmComparator;
import reference.comparator.PersonComparator;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

/**
 *
 * @author Fabien
 */
public class Reference {
    
    // Instance variables
    private RatingRegister ratingRegister;
    
    // Constructor
    public Reference(RatingRegister ratingRegister){
        this.ratingRegister = ratingRegister;
    }
    
    public Film recommendFilm(Person person){
        // you need three things to find out the most suitable film. 
        // These are at least the class FilmComparator which you created earlier on;
        // the method public Map<Film, List<Rating>> filmRatings() of the class RatingRegister;
        // and a list of the existing films.
        Map<Film, List<Rating>> filmRatings = ratingRegister.filmRatings();
        List<Film> films = new ArrayList(filmRatings.keySet());
        // If all films are watched return null
        if(watchedFilms(person, films)){
            return null;
        }
        
        // If person have not watched any film choose the film with highest rank
        // From previous point: choose the film with highest rating
        if(noFilmsWatched(person)){
            Collections.sort(films, new FilmComparator(filmRatings));
            return films.get(0);
        }
        
        // All Persons
        List<Person> allPersons = new ArrayList(this.ratingRegister.reviewers());
        
        // All persons without this person
        List<Person> allPersonsWithoutThisPerson = new ArrayList(allPersons);
        allPersonsWithoutThisPerson.remove(person);
        Map<Person, Integer> personSimilarity = createPersonSim(person, allPersonsWithoutThisPerson);
        // Sort allPersonsWithoutThisPerson based on similarity
        Collections.sort(allPersonsWithoutThisPerson, new PersonComparator(personSimilarity));
        return chooseFilmForFrom(person, allPersonsWithoutThisPerson.get(0));
        
    }

    private boolean watchedFilms(Person person, List<Film> films) {
        // get films which person have been watched
        List<Film> personFilms = new ArrayList(this.ratingRegister.getPersonalRatings(person).keySet());
        // Copy the two Arraylist and then sort to compare
        List<Film> copyFilms = new ArrayList<Film>(films);
        List<Film> copyPersonFilms = new ArrayList<Film>(personFilms);
        Collections.sort(copyFilms, new FilmComparator(ratingRegister.filmRatings()));
        Collections.sort(copyPersonFilms, new FilmComparator(ratingRegister.filmRatings()));
        return copyFilms.equals(copyPersonFilms);
    }

    private Map<Person, Integer> createPersonSim(Person person, List<Person> allPersonsWithoutThisPerson) {
        Map<Person, Integer> personSim = new HashMap<Person, Integer>();
        // Calculate personSim 
        for (Person person1 : allPersonsWithoutThisPerson) {
            int similarity = calcSimilarity(person, person1);
            personSim.put(person1, similarity);
        }
        return personSim;
        
    }

    private int calcSimilarity(Person person, Person person1) {
        // All films which have been watches by person and person1
        List<Film> personFilms = new ArrayList(this.ratingRegister.getPersonalRatings(person).keySet());
        List<Film> person1Films = new ArrayList(this.ratingRegister.getPersonalRatings(person1).keySet());
        
        // The common films
        List<Film> commonFilms = new ArrayList<Film>(personFilms);
        commonFilms.retainAll(person1Films);
        
        // compute similarity
        if(commonFilms.isEmpty()){
            return Integer.MIN_VALUE;
        }
        int sim = 0;
        for (Film film : commonFilms) {
            sim += this.ratingRegister.getRating(person, film).getValue() * this.ratingRegister.getRating(person1, film).getValue();
        }
        return sim;
    }

    private boolean noFilmsWatched(Person person) {
        List<Film> personFilms = new ArrayList(this.ratingRegister.getPersonalRatings(person).keySet());
        return personFilms.isEmpty();
    }

    private Film chooseFilmForFrom(Person person, Person person1) {
        // All films which have been watches by person and person1
        List<Film> personFilms = new ArrayList(this.ratingRegister.getPersonalRatings(person).keySet());
        List<Film> person1Films = new ArrayList(this.ratingRegister.getPersonalRatings(person1).keySet());
        
        // The films which person have not watched
        List<Film> personFilmsNotWatched = new ArrayList<Film>(person1Films);
        personFilmsNotWatched.removeAll(personFilms);
        
        // Choose from  personFilmsNotWatched the film with highest score
        // If no one has rating greater than neutral(1) return null
        if(personFilmsNotWatched.isEmpty()){
            return null;
        }
        Film bestFilm = personFilmsNotWatched.get(0);
        for (int i = 1; i < personFilmsNotWatched.size(); i++) {
            if(this.ratingRegister.getRating(person1, bestFilm).getValue() < this.ratingRegister.getRating(person1, personFilmsNotWatched.get(i)).getValue()){
                bestFilm = personFilmsNotWatched.get(i);
            }
        }
        if(this.ratingRegister.getRating(person1, bestFilm).getValue() < 3){
            return null;
        }
        return bestFilm;
    }
    
}
