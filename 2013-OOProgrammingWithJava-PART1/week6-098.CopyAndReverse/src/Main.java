
import java.util.Arrays;



public class Main {

    public static void main(String[] args) {
        // write testcode here
    }
    
    public static int[] copy(int[] array){
        int[] newArray = new int[array.length];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = array[i];
        }
//        // Alternative way
//        int[] array2 = Arrays.copyOf(array, array.length);
        return newArray;
    }
    
    public static int[] reverseCopy(int[] array){
        int[] newArray = new int[array.length];
        for (int i = 0; i < newArray.length; i++) {
            newArray[newArray.length - i - 1] = array[i];
        }
        return newArray;
    }
    
}
