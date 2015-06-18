
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fabien
 */
public class RingingCentre {
    
    // Instance variables
    private Map<Bird, List<String>> observations;
    
    // Constructor
    public RingingCentre() {
        this.observations = new HashMap<Bird, List<String>>();
    }
    
    public void observe(Bird bird, String place){
        if(!observations.keySet().contains(bird)){
            this.observations.put(bird, new ArrayList<String>());
        }
        this.observations.get(bird).add(place);
    }
    
    public void observations(Bird bird){
//        Sturnus roseus (2012) observations: 2
//        Arabia
//        Vallila
        if(!this.observations.keySet().contains(bird)){
            System.out.println(bird.getLatinName() + " (" + bird.getRingingYear() + ") observations: 0");
        }else{
            int numberOfObservations = this.observations.get(bird).size();
            System.out.println(bird.getLatinName() + " (" + bird.getRingingYear() + ") observations: " + numberOfObservations);
            for (String name : this.observations.get(bird)) {
                System.out.println(name);
                
            }
        }
    }
    
    
}
