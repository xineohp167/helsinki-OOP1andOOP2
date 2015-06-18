
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // write test code here
        System.out.print("Give a string: ");
        Scanner reader = new Scanner(System.in);
        String text = reader.nextLine();
        if(numberCheck(text)){
            System.out.println("Number check true");
        }else{
            System.out.println("Number check false");
        }
//        if(isAWeekDay(text)){
//            System.out.println("The form is fine.");
//        }else{
//            System.out.println("The form is wrong.");
//        }
    }
    
    public static boolean numberCheck(String string){
        return string.matches("5{3}(1|0)*5{3}");
    }
            
    
    public static boolean isAWeekDay(String string){
        return string.matches("mon|tue|wed|thu|fri|sat|sun");
    }
    
    public static boolean allVowels(String string){
        return string.matches("(a|e|o|u|i|ä|ö)+");
    }
    
    public static boolean clockTime(String string){
        //return string.matches("[0-9]:[0-59]:[0-59]");
 
        return string.matches("([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]");
       
    }
}
