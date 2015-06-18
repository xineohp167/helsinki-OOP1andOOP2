
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<Person>();
        people.add(new Person("Matti", 150000));
        people.add(new Person("Pekka", 3000));
        people.add(new Person("Mikko", 300));
        people.add(new Person("Arto", 10));
        people.add(new Person("Merja", 500));
        people.add(new Person("Pertti", 80));
        people.add(new Person("Tester", 3000));

        System.out.println(people);

        /*
         * When you have implemented the compareTo-method, remove comment below.
         */
        Collections.sort(people);
        System.out.println(people);
        
        // Testing binary search
        Person person1 = new Person("Name", 500);
        int index = Collections.binarySearch(people, person1);
        if (index >= 0) {
            System.out.println("Index " + index);
            System.out.println("name: " + people.get(index).getName());
        }
        
        Person person2 = new Person("Name", 3000);
        int index2 = Collections.binarySearch(people, person2);
        if (index2 >= 0) {
            System.out.println("Index " + index2);
            System.out.println("name: " + people.get(index2).getName());
        }
        

    }
}
