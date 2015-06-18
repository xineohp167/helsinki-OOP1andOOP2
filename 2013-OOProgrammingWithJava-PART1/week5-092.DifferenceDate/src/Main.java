
public class Main {

    public static void main(String[] args) {
        // write testcode here
        MyNumber myNum1 = new MyNumber(12);
        MyNumber myNum2 = new MyNumber(12);
        MyNumber myNum3 = new MyNumber(10);
        MyNumber myNum4 = new MyNumber(16);
        
        System.out.println(myNum4.difference(myNum1));
        System.out.println(myNum1.difference(myNum4));
    }
}
