
import containers.ProductContainerRecorder;


public class Main {

    public static void main(String[] args) {
        // write test code here
        ProductContainerRecorder mtv = new ProductContainerRecorder("olut", 10, 2);
        System.out.println(mtv.history());
        System.out.println("--------------------------------");
        ProductContainerRecorder juice = new ProductContainerRecorder("Juice", 1000.0, 1000.0);
        juice.takeFromTheContainer(11.3);
        System.out.println(juice.getName()); // Juice
        juice.addToTheContainer(1.0);
        System.out.println(juice);           // Juice: volume = 989.7, free space 10.3
        
        // history() does not work properly, yet:
        System.out.println(juice.history()); // [1000.0]
    }

}
