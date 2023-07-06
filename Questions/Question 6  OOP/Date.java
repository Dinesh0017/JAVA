public class Date {
    private int day;
    private int month;
    private int year;

    //constructor of this variables
    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    //getter setter method for day
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    //getter setter method for month
    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    //getter setter method for year
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void displayDate(){
        System.out.println(month + "/" + day + "/" + year);
    }
}
