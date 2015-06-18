
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;


/**
 *
 * @author Fabien
 */
public class VehicleRegister {
    
    // Instance variables
    private HashMap<RegistrationPlate, String> owners = new HashMap<RegistrationPlate, String>();
    
    // Methods
    
    public boolean add(RegistrationPlate plate, String owner){
        if(this.owners.get(plate) == null){
            this.owners.put(plate, owner);
            return true;
        } else{
            return false;
        }
    }
    
    public String get(RegistrationPlate plate){
        return this.owners.get(plate);
    }
    
    public boolean delete(RegistrationPlate plate){
        return this.owners.remove(plate) != null;
        }
    
    public ArrayList<RegistrationPlate> plateList(){
        return new ArrayList<RegistrationPlate>(this.owners.keySet());
    }
    
    // prints out all the registration plates stored
    public void printRegistrationPlates(){
        for(RegistrationPlate regPlate : plateList()){
            System.out.println(regPlate);
        }
        
    }
    
    // prints all the car owners stored. 
    // Each owner's name has to be printed only once, even though they had more than one car
    public void printOwners(){
        //System.out.println(new HashSet<String>(this.owners.values()).toString());
        HashSet<String> ownersNames = new HashSet<String>(this.owners.values());
        for(String name : ownersNames){
            System.out.println(name);
        }
    }
}
