import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        String name = reader.nextLine();
        System.out.println(reverseName(name));
        //System.out.println(reverseName1(name));
    }

    private static String reverseName(String name) {
        String result = "";
        for(int i = 0; i < name.length(); i++){
            result = name.charAt(i) + result;
        }
        return result;
    }

    private static String reverseName1(String name) {
        return new StringBuilder(name).reverse().toString();
        
    }
}
