// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Date d=new Date(07,06,2023);
        System.out.print("Date is ");
        d.displayDate();


        d.setMonth(8);
        d.setDay(12);
        d.setYear(2023);

        System.out.print("Update Date is ");
        d.displayDate();
    }
}