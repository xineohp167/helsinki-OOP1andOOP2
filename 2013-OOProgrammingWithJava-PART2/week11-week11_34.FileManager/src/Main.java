
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileManager t = new FileManager();
        
        //System.out.println(t.read("src/testinput1.txt"));

        for (String line : t.read("src/testinput1.txt")) {
            System.out.println(line);
        }
    }
}
