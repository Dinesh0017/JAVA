import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        float fah,cel;
        Scanner value=new Scanner(System.in);

        System.out.println("Enter Fahrenheit degrees: ");
        fah=value.nextFloat();

        cel=(fah-32)*5/9;

        System.out.println("Value of Celsius: "+cel);
    }
}