
import java.util.Scanner;

public class Main {  

//    // My solution
//    public static void main(String[] args) {
//    // implement your program here
//    // do not put all to one method/class but rather design a proper structure to your program
//        
//    // Your program should use only one Scanner object, i.e., it is allowed to call 
//    // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
//        Scanner reader = new Scanner(System.in);
//        
//        BirdStat birdStat = new BirdStat();
//        
//        while(true){
//            System.out.print("? ");
//            String command = reader.nextLine();
//            if(command.equals("Quit")){
//                break;
//            }
//            if(command.equals("Add")){
//                System.out.print("Name: ");
//                String name = reader.nextLine();
//                System.out.print("Latin Name: ");
//                String latinName = reader.nextLine();
//                birdStat.addBird(name, latinName);
//            }
//            if(command.equals("Observation")){
//                System.out.print("What was observed:? ");
//                String name = reader.nextLine();
//                boolean test = birdStat.observed(name);
//                if(!test){
//                    System.out.println("Is not a bird!");
//                }
//            }
//            if(command.equals("Statistics")){
//                birdStat.showStats();
//            }
//            if(command.equals("Show")){
//                System.out.print("What? ");
//                String name = reader.nextLine();
//                birdStat.showBird(name);
//            }
//        }
//        
//            
//    }
    
    // Helsinki solution change public to private
    private static String ask(Scanner lukija, String kysymys) {
        System.out.print(kysymys+" ");
        return lukija.nextLine();
    }
 
    private static void add(Scanner lukija, BirdDatabase db) {
        String name = ask(lukija, "Name:");
        String latNimi = ask(lukija, "Latin Name:");
 
        db.addBird(name, latNimi);
    }
 
    private static void observation(Scanner lukija, BirdDatabase db) {
        String name = ask(lukija, "Name:");
 
        boolean success = db.observe(name);
        if (!success) {
            System.out.println("Is not a bird!");
        }
    }
 
    private static void show(Scanner lukija, BirdDatabase db) {
        String name = ask(lukija, "Name:");
        String answer = db.showBird(name);
        if (answer == null) {
            System.out.println("Is not a bird!");
        } else {
            System.out.println(answer);
        }
    }
 
    private static void statistics(Scanner lukija, BirdDatabase db) {
        System.out.print(db.statistics());
    }
 
    public static void main(String[] args) {
    // implement your program here
    // do not put all to one method/class but rather design a proper structure to your program
         
    // Your program should use only one Scanner object, i.e., it is allowed to call
    // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
             
        Scanner scanner = new Scanner(System.in);
        BirdDatabase db = new BirdDatabase();
 
        while (true) {
            String command = ask(scanner, "?");
 
            if (command.equals("Quit")) {
                break;
            } else if (command.equals("Add")) {
                add(scanner,db);
            } else if (command.equals("Observation")) {
                observation(scanner,db);
            } else if (command.equals("Show")) {
                show(scanner,db);
            } else if (command.equals("Statistics")) {
                statistics(scanner,db);
            } else {
                System.out.println("Unknown command!");
            }
        }
    }

}
