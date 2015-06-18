public class BinarySearch {
    public static boolean search(int[] array, int searchedValue) {
        int beginning = 0;
        int end = array.length - 1;
        if(beginning == end && array[0] == searchedValue){
            return true;
        }

        while (beginning < end) {
            int middle = (beginning + end) / 2;
            if (array[middle] == searchedValue) {
                return true;
            }

            // restrict the search area 
            if (searchedValue > array[middle]) {
                beginning = middle+1;
            } else {
                end = middle;
            }
        }
        if(beginning == end && array[end] == searchedValue){
            return true;
        }
        return false;
    }
}
