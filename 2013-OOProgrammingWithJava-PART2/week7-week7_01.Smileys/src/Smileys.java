
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        printWithSmileys("Method");
        printWithSmileys("Beerbottle");
        printWithSmileys("Interface");
    }

    private static void printWithSmileys(String characterString) {
        int numOfSmiles = smilesNumber(characterString);
        System.out.println(printSmiles(numOfSmiles));
        System.out.println(printSmileWithText(characterString));
        System.out.println(printSmiles(numOfSmiles));

    }

    private static int smilesNumber(String characterString) {
        int number = 0;
        if(characterString.length() % 2 == 0){
            number = (characterString.length() + 2) / 2 + 2;
        }else{
            number = (characterString.length() + 3) / 2 + 2;
        }
        return number;

    }

    private static String printSmiles(int numOfSmiles) {
        String smiles = "";
        for (int i = 0; i < numOfSmiles; i++) {
            smiles += ":)";
        }
        return smiles;
    }

    private static String printSmileWithText(String characterString) {
        if(characterString.length() % 2 == 0){
            return ":) " + characterString + " :)";
        }else{
            return ":) " + characterString + "  :)";
        }
    }

}
