/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package reference.comparator;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import reference.domain.Film;
import reference.domain.Rating;

/**
 *
 * @author Fabien
 */
public class FilmComparator implements Comparator<Film>{
    
    // Instance variables
    Map<Film, List<Rating>> ratings;
    
    // Constructor
    public FilmComparator(Map<Film, List<Rating>> ratings){
        this.ratings = ratings;
        
    }

    @Override
    public int compare(Film o1, Film o2) {
        int filmRating2 = averageRating(this.ratings.get(o2));
        int filmRating1 = averageRating(this.ratings.get(o1));
        return filmRating2 - filmRating1;
    }

    private int averageRating(List<Rating> get) {
        int sum = 0;
        for (Rating rating : get) {
            sum += rating.getValue();
        }
        return (int) (sum / get.size());
    }
    
}
