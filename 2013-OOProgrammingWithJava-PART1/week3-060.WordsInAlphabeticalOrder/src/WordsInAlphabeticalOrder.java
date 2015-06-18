
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        List<String> words = new ArrayList<String>();
        
        while (true) {
            System.out.print("Type a word: ");
            String word = reader.nextLine();
            if (word.isEmpty()) {
                break;
            } else{
                words.add(word);
            }
        }
        
        Collections.sort(words);
        System.out.println("You typed the following words:");
        for (String string : words) {
            System.out.println(string);
        }
    }
}
