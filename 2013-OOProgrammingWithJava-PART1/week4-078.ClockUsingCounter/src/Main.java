
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // write here code to ensure that BoundedCounter works as expected
        // before starting 78.3 remove the extra code and use the skeleton ahown
        // in assignment
//        BoundedCounter minutes = new BoundedCounter(59);
//        BoundedCounter hours = new BoundedCounter(23);
//
//        int i = 0;
//        while ( i < 121 ) {
//            System.out.println( hours + ":" + minutes);   // the current time printed
//            // advance minutes
//            // if minutes become zero, advance hours
//            minutes.next();
//            if(minutes.getValue() == 0){
//                hours.next();
//            }
//            i++;
//        }
        BoundedCounter seconds = new BoundedCounter(59);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);

        System.out.print("seconds: ");
        int s = Integer.parseInt(reader.nextLine());// ask the initial value of seconds from the user
        System.out.print("minutes: ");
        int m = Integer.parseInt(reader.nextLine());// ask the initial value of minutes from the user
        System.out.print("hours: ");
        int h = Integer.parseInt(reader.nextLine());// ask the initial value of hours from the user

        seconds.setValue(s);
        minutes.setValue(m);
        hours.setValue(h);

        int i = 0;
        while ( i < 121 ) {
          // like in previous but seconds taken into account
            System.out.println( hours + ":" + minutes + ":" + seconds );
            seconds.next();
            if(seconds.getValue() == 0){
                minutes.next();
                if(minutes.getValue() == 0){
                    hours.next();
                }
            }
            
            i++;
        }
        
}
}
