
public class MyDate {

    private int day;
    private int month;
    private int year;
    
    private static final int DAYS_IN_MONTH = 30;
    private static final int MONTHS_IN_YEAR = 12;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }
    
    public boolean earlier2(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.month < compared.month) {
            return true;
        }

        if (this.day < compared.day) {
            return true;
        }

        return false;
    }
    
     public void advance(int numberOfDays){
         for (int i = 0; i < numberOfDays; i++) {
             advance();
             
         }
     }
     
     public void advance(){
         if(this.day == DAYS_IN_MONTH){
            this.day = 1;
        } else{
            this.day++;
        }
         if (this.day == 1) {
            if(this.month == MONTHS_IN_YEAR){
                this.month = 1;
            } else{
                this.month++;
            }
            if (this.month == 1) {
                this.year++;
            }
        }
     }
     
     public MyDate afterNumberOfDays(int days){
        MyDate newMyDate = new MyDate(this.day, this.month, this.year);

        // some code here
        newMyDate.advance(days);

        return newMyDate;
    }

}