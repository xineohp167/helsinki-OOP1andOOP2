
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
public class FlightCollect {
    
    // Instance variables
    ArrayList<Flight> flights = new ArrayList<Flight>();
    
    // Methods
    public void addFlight(Flight f){
        this.flights.add(f);
    }
    
    public void printFlights(){
        for (Flight flight : flights) {
            System.out.println(flight);
        }
    }
}
