import java.util.Scanner;

public class FirstCharacter {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        System.out.println("First character: " + firstCharacter(name));
        
    }
    /**
     * Returns the first character of the text
     * @param text
     * @return the first char in text
     */
    public static char firstCharacter(String text){
        return text.charAt(0);
    }
}
