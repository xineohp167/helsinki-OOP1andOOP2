
public class Main {

    public static void main(String[] args) {
        // test method here
        int[] array = {5, 1, 3, 4, 2};
        //System.out.println(sum(array));
        // methods are executed from left to right
        String test = "Abc";
        //System.out.println(test.toUpperCase().toLowerCase());
        int[] arr = {1, 2, 3, 4};
        System.out.println(arr.length);
        // Cannot assign a value to a final variable
        //arr.length = 5;
    }

    public static int sum(int[] array) {
        // Write code here
        int result = 0;
        for (int i : array) {
            result += i;
        }
        return result;
    }
}
