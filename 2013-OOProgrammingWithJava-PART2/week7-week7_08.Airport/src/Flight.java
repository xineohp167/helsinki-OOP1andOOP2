/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fabien
 */
public class Flight {
    
    // Instance variable
    private Plane plane;
    private String departure;
    private String destination;

    public Flight(Plane plane, String departure, String destination) {
        this.plane = plane;
        this.departure = departure;
        this.destination = destination;
    }
    
    // Methods
    
    public String getDeparture() {
        return departure;
    }

    public String getDestination() {
        return destination;
    }

    public Plane getPlane() {
        return plane;
    }
    
    

    @Override
    public String toString() {
        // HA-LOL (42 ppl) (HEL-BAL)
        return plane.toString() + " (" + this.departure + "-" + this.destination + ")";
        
    }
    
    
    
}
