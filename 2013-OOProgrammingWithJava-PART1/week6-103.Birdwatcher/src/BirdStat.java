
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
public class BirdStat {
    
    // Instance variables
    private ArrayList<Bird> birds;
    
    // Constructor
    public BirdStat() {
        this.birds = new ArrayList<Bird>();
    }
    
    public void addBird(String name, String latinName){
        birds.add(new Bird(name, latinName));
    }
    
    public void showBird(String name){
        for (Bird bird : birds) {
            if(StringUtils.included(bird.getName(), name)){
                System.out.println(bird);
            }
        }
    }
    
    public void showStats(){
        for (Bird bird : birds) {
            System.out.println(bird);
        }
    }
    
    public boolean observed(String name){
        for (Bird bird : birds) {
            if(StringUtils.included(bird.getName(), name)){
                bird.setObserved(1);
                return true;
            }
        }
        return false;
    }
    
}
