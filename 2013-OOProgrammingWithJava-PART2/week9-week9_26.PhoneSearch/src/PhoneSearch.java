
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import phone_search.Address;
import phone_search.PersonAddress;
import phone_search.PersonNumber;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fabien
 */
class PhoneSearch {
    
    // Instance variables
    private PersonAddress personAddress;
    private PersonNumber personNumber;
    
    // Constructor
    public PhoneSearch() {
        personAddress = new PersonAddress();
        personNumber = new PersonNumber();
    }
    
    
    
    public void start(Scanner reader){
        System.out.println("phone search");
        System.out.println("available operations:");
        System.out.println(" 1 add a number");
        System.out.println(" 2 search for a number");
        System.out.println(" 3 search for a person by phone number");
        System.out.println(" 4 add an address");
        System.out.println(" 5 search for personal information");
        System.out.println(" 6 delete personal information");
        System.out.println(" 7 filtered listing");
        System.out.println(" x quit");
        System.out.println("");
        
        while(true){
            System.out.print("command: ");
            String command = reader.nextLine();
            if(command.equals("1")){
                runCommand1(reader);
            }
            if(command.equals("2")){
                runCommand2(reader);
            }
            if(command.equals("3")){
                runCommand3(reader);
            }
            if(command.equals("4")){
                runCommand4(reader);
            }
            if(command.equals("5")){
                runCommand5(reader);
            }
            if(command.equals("6")){
                runCommand6(reader);
            }
            if(command.equals("7")){
                runCommand7(reader);
            }
            if(command.equals("x")){
                break;
            }
            
        }
        
    }

    private void runCommand1(Scanner reader) {
        System.out.print("whose number: ");
        String name = reader.nextLine();
        System.out.print("number: ");
        String number = reader.nextLine();
        this.personNumber.addPersonNumbers(name, number);
        System.out.println("");

    }

    private void runCommand2(Scanner reader) {
        System.out.print("whose number: ");
        String name = reader.nextLine();
        List<String> numbers = this.personNumber.searchForNumbersByName(name);
        if(numbers == null || numbers.isEmpty()){
            System.out.println("  not found");
        } else{
            for (String number : numbers) {
                System.out.println(" " + number);
            }
        }
        System.out.println("");
    }

    private void runCommand3(Scanner reader) {
        System.out.print("number: ");
        String number = reader.nextLine();
        List<String> names = this.personNumber.searchForNamesByNumber(number);
        if(names == null || names.isEmpty()){
            System.out.println(" not found");
        } else{
            for (String name : names) {
                System.out.println(" " + name);
            }
        }
        System.out.println("");
    }

    private void runCommand4(Scanner reader) {
        System.out.print("whose address: ");
        String name = reader.nextLine();
        System.out.print("street: "); 
        String street = reader.nextLine();
        System.out.print("city: ");
        String city = reader.nextLine();
        this.personAddress.addAddress(name, street, city);
        System.out.println("");
    }

    private void runCommand5(Scanner reader) {
        System.out.print("whose information: ");
        String name = reader.nextLine();
        
        generalInfo(name);
        
        
    }
    
    private void generalInfo(String name){
        Address address = this.personAddress.searchForAddressByName(name);
        
        List<String> numbers = this.personNumber.searchForNumbersByName(name);
        if(address == null && (numbers == null || numbers.isEmpty())){
            System.out.println("  not found");
            return;
        }
        if(address == null){
            System.out.println("  address unknown");
        }else{
            System.out.println("  " + address.getAddress());
        }
        
        if(numbers == null || numbers.isEmpty()){
            System.out.println("  phone number not found");
        } else{
            System.out.println("  phone numbers:");
            for (String number : numbers) {
                System.out.println("   " + number);
            }
        }
        System.out.println("");
    }

    private void runCommand6(Scanner reader) {
        System.out.print("whose information: ");
        String name = reader.nextLine();
        this.personAddress.removeName(name);
        this.personNumber.removeName(name);
    }

    private void runCommand7(Scanner reader) {
        System.out.print("keyword (if empty, all listed): ");
        String keyword = reader.nextLine();
        Set<String> uniqueNames= new TreeSet<String>();
        for (String name : this.personNumber.getAllNames()) {
            if(name.contains(keyword)){
                uniqueNames.add(name);
            }
        }
        for (String name : this.personAddress.getAllNames()) {
            if(name.contains(keyword)){
                uniqueNames.add(name);
            }
        }
        //System.out.println(uniqueNames);
        String nameByAddress = this.personAddress.searchforPersonByAddress(keyword);
        if(nameByAddress != null){
            uniqueNames.add(nameByAddress);
        }
        
//        if(nameByAddress != null || !nameByAddress.isEmpty()){
//           //uniqueNames.add(nameByAddress);
//        }
        if(uniqueNames.isEmpty()){
            System.out.println(" keyword not found");
        } else{
            for (String string : uniqueNames) {
                System.out.println("  " + string);
                generalInfo(string);
            }
        }
        
//        Set<String> uniqueNames = new TreeSet<String>();
//        Set<String> phoneNames = new HashSet<String>();
//        phoneNames = this.personNumber.getAllNames();
//        System.out.println(phoneNames);
//        if(phoneNames != null || !phoneNames.isEmpty()){
//            for (String name : phoneNames) {
//                if(name.contains(keyword)){
//                    uniqueNames.add(name);
//                }
//            }
//        }
//        Set<String> addrNames = new HashSet<String>();
//        addrNames = this.personAddress.getAllNames();
//        if(addrNames != null || !addrNames.isEmpty()){
//            for (String name : addrNames) {
//                if(name.contains(keyword)){
//                    uniqueNames.add(name);
//                }
//            }
//        }
//        String nameByAddress = this.personAddress.searchforPersonByAddress(keyword);
//        if(nameByAddress == null || !nameByAddress.isEmpty()){
//            uniqueNames.add(nameByAddress);
//        }
//        
//        System.out.println(uniqueNames.toString());
//        List<String> list = new ArrayList<String>(uniqueNames);
//        Collections.sort(list);
//        System.out.println(list.toString());
//        if(list.isEmpty()){
//            System.out.println(" keyword not found");
//        } else{
//            for (String string : list) {
//                generalInfo(string);
//            }
//        }
        
    }
    
}
