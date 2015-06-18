import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    /**  The length of the password */
    private int length;
    private Random gen;
    /** The symbols which will be used for the password */
    private static final String SYMBOLS = "abcdefghijklmnopqrstuvwxyz";

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
        gen = new Random();
    }

    public String createPassword() {
        // write code that returns a randomized password
        String password = "";
        for (int i = 0; i < this.length; i++) {
            password += SYMBOLS.charAt(gen.nextInt(SYMBOLS.length()));
        }
        return password;
    }
}
