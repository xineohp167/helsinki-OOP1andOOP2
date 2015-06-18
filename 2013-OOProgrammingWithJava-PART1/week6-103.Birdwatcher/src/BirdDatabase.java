/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fabien
 */
import java.util.ArrayList;
 
public class BirdDatabase {
 
    private ArrayList<Bird> birds;
 
    public BirdDatabase() {
        birds = new ArrayList<Bird>();
    }
 
    public boolean observe(String name) {
        for (Bird bird : birds) {
            if (name.equals(bird.getName())) {
                bird.setObserved(1);
                return true;
            }
        }
        return false;
    }
 
    public void addBird(String name, String latinName) {
        birds.add(new Bird(name, latinName));
    }
 
    public String showBird(String name) {
        for (Bird bird : birds) {
            if (name.equals(bird.getName())) {
                return bird.toString();
            }
        }
        return null;
    }
 
    public String statistics() {
        String stats = "";
        for (Bird bird : birds) {
            stats = stats+bird.toString()+"\n";
        }
        return stats;
    }
 
}