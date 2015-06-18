
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        // write testcode here
        int[] array = {3, 4, 8 , 1};
         //  This will print memory reference 
        //System.out.println(array);
        // This will print the array
        System.out.println(Arrays.toString(array));
    }
    
    public static int smallest(int[] array) {
    // write the code here
        int small = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] < small){
                small = array[i];
            }
            
        }
        return small;
    }
    
    public static int indexOfTheSmallest(int[] array) {
    // code goes here
        int small = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] < small){
                small = array[i];
                index = i;
            }
            
        }
        return index;
    }
    
    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int small = array[index];
        int ind = index;
        for (int i = index; i < array.length; i++) {
            if(array[i] < small){
                small = array[i];
                index = i;
            }
            
        }
        return index;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            swap(array, i, indexOfTheSmallestStartingFrom(array, i));
            System.out.println(Arrays.toString(array));
        }
    }
    
}
