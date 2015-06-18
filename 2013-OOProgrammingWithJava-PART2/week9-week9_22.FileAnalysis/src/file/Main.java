package file;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        // test your code here

        
        File file = new File("test/testfile.txt");
//        Scanner reader = new Scanner(file);
//        while(reader.hasNextLine()){
//            System.out.println(reader.nextLine());
//        }
        Analysis analysis = new Analysis(file);
        //analysis.printText();
        System.out.println("Lines: " + analysis.lines());
        System.out.println("Characters: " + analysis.characters());
    }
}
