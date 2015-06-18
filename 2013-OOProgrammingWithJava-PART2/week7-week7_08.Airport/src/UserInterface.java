
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Fabien
 */
public class UserInterface {

    // Instance variables
    private Scanner reader;
    private FlightCollect flights;
    private PlaneCollect planes;

    // Constructor
    public UserInterface(Scanner reader, FlightCollect flights, PlaneCollect planes) {
        this.reader = reader;
        this.flights = flights;
        this.planes = planes;
    }

    public void start() {
        System.out.println("Airport panel");
        System.out.println("--------------------");
        System.out.println("");
        System.out.println("");
        while (true) {

            System.out.println("Choose operation:");
            System.out.println("[1] Add airplane");
            System.out.println("[2] Add flight");
            System.out.println("[x] Exit");
            System.out.print("> ");
            String input = reader.nextLine();
            if (input.equals("x")) {
                break;
            }
            handleAirportMenu(input);

        }
        System.out.println("");
        System.out.println("Flight service");
        System.out.println("------------");
        System.out.println("");
        System.out.println("");
        while (true) {            
            System.out.println("Choose operation:");
            System.out.println("[1] Print planes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print flight info");
            System.out.println("[x] Quit");
            System.out.print("> ");
            String input = reader.nextLine();
            if (input.equals("x")) {
                break;
            }
            handleUserMenu(input);
        }
        System.out.println("");
    }

    private void handleAirportMenu(String statement) {
        if (statement.equals("1")) {
            addAirplane();
        } else if (statement.equals("2")) {
            addFlight();
        } else {
            System.out.println("Unknown statement.");
        }
    }

    private void addAirplane() {
        System.out.print("Give plane ID: ");
        String id = this.reader.nextLine();
        System.out.print("Give plane capacity: ");
        int capacity = Integer.parseInt(this.reader.nextLine());
        Plane p = new Plane(id, capacity);
        this.planes.addPlane(p);
    }

    private void addFlight() {
        System.out.print("Give plane ID: ");
        String planeID = this.reader.nextLine();
        System.out.print("Give departure airport code: ");
        String departure = this.reader.nextLine();
        System.out.print("Give destination airport code: ");
        String destanation = this.reader.nextLine();
        //Find the plane using planeID
        Plane p = planes.getPlane(planeID);
        if(p == null){
            System.out.println("No such plane!");
        }
        Flight f = new Flight(p, departure, destanation);
        this.flights.addFlight(f);
    }

    private void handleUserMenu(String statement) {
        if (statement.equals("1")) {
            printPlanes();
        } else if (statement.equals("2")) {
            printFlights();
        } else if(statement.equals("3")){
            printFlightInfo();
        }else {
            System.out.println("Unknown statement.");
        }
    }

    private void printPlanes() {
       this.planes.printPlanes();
    }

    private void printFlights() {
        this.flights.printFlights();
    }

    private void printFlightInfo() {
        System.out.print("Give plane ID: ");
        String planeID = reader.nextLine();
        Plane p = planes.getPlane(planeID);
        System.out.println(p.toString());
    }

}
