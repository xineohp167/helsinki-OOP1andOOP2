
public class Main {

    public static void main(String[] args) {
        // test your code here
        
//        MyDate myDate = new MyDate(29, 12, 2011);
//        System.out.println(myDate);
//        myDate.advance();
//        System.out.println(myDate);
//        myDate.advance();
//        
//        System.out.println(myDate);
        
        MyDate date1 = new MyDate(29, 10, 2010);
        MyDate date2 = new MyDate(29, 10, 2010);
        MyDate date3 = new MyDate(29, 10, 2012);
        MyDate date4 = new MyDate(29, 8, 2010);
        MyDate date5 = new MyDate(20, 10, 2010);
        
        boolean test1 = date2.earlier(date5);
        boolean test2 = date2.earlier2(date5);
        System.out.println(test1);
        System.out.println(test2);
    }
}
