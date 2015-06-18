
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
        this.year = year;
    }

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

    public int differenceInYears(MyDate comparedDate) {
        int result = 0;
        MyDate greater;
        MyDate less;
        if (this.earlier(comparedDate)) {
            greater = new MyDate(comparedDate.day, comparedDate.month, comparedDate.year);
             less = new MyDate(this.day, this.month, this.year);
             
        } else{
             greater = new MyDate(this.day, this.month, this.year);
             less = new MyDate(comparedDate.day, comparedDate.month, comparedDate.year);
        }
        result = greater.year - less.year;
        MyDate third = new MyDate(greater.day, greater.month, greater.year - result);
        if(less.earlier(third)){
            return result;
        }
        if(less.month == third.month && less.day == third.day){
            return result;
        } else{
            return result-1;
        }
        

}

}
