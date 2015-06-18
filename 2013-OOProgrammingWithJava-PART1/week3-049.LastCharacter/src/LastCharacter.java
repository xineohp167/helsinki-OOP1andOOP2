import java.util.Scanner;


public class LastCharacter {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        System.out.println("Last character: " + lastCharacter(name));
        
        
    }
    /**
     * Returns the last character of the text
     * @param text
     * @return the last char in text
     */
    public static char lastCharacter(String text){
        if(text.isEmpty()){
            return 0;
        }else{
            return text.charAt(text.length()-1);
        }
        
    }

    
}
