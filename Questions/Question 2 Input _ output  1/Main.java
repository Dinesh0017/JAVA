import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int nu1,nu2,nu3,product;
        Scanner numbers=new Scanner(System.in);

        System.out.println("Enter 1st Number: ");
        nu1=numbers.nextInt();

        System.out.println("Enter 2nd Number: ");
        nu2=numbers.nextInt();

        System.out.println("Enter 3rd NUmber: ");
        nu3=numbers.nextInt();

        product=nu1*nu2*nu3;

        System.out.println("Product of Three Numbers is "+product);
    }
}