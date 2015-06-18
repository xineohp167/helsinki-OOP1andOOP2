
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fabien
 */
public class PlaneCollect {
    
    // Instance variable
    private HashMap<String, Plane> planes = new HashMap<String, Plane>();
    
    // Methods
    public Plane getPlane(String id){
        return this.planes.get(id);
       
    }
   
    public void addPlane(Plane p){
        String name = p.getId();
        this.planes.put(name, p);
    }
    
    public ArrayList<Plane> planeList(){
        return new ArrayList<Plane>(this.planes.values());
    }
    
    public void printPlanes(){
        for (Plane p : planeList()) {
            System.out.println(p);
        }
    }
    
}
