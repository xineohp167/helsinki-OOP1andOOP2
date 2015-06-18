

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileManager {

    
    public ArrayList<String> read(String file) throws FileNotFoundException {
        File f = new File(file);
        Scanner reader = new Scanner(f);

        
        ArrayList<String> strings = new ArrayList<String>();

        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            
            strings.add(line);
        }

        reader.close();
        return strings;
    }

    public void save(String file, String text) throws FileNotFoundException, IOException {
         FileWriter writer = new FileWriter(file);
         writer.write(text);
         writer.close();
    }

    public void save(String file, ArrayList<String> texts) throws FileNotFoundException, IOException {
        FileWriter writer = new FileWriter(file);
        StringBuilder stringBuilder = new StringBuilder();
        for (String string : texts) {
            stringBuilder.append(string).append("\n");
        }
        writer.write(stringBuilder.toString());
        writer.close();
    }
    
}