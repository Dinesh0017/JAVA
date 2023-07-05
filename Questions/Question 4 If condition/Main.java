import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int nu1,nu2,nu3,tot,product;
        float avge;

        Scanner numbers=new Scanner(System.in);

        System.out.println("Enter 1st Number: ");
        nu1=numbers.nextInt();

        System.out.println("Enter 2nd Number: ");
        nu2=numbers.nextInt();

        System.out.println("Enter 3rd Number: ");
        nu3=numbers.nextInt();

        tot=nu1+nu2+nu3;
        System.out.println("Sum of given Three Numbers is "+tot);

        product=nu1*nu2*nu3;
        System.out.println("Product of given Three Numbers is "+product);

        avge=tot/3.0f;
        System.out.println("Average of given Three NUmbers is "+avge);

    //checking largest number
        if(nu1>nu2 && nu1>nu3){
            System.out.println("Number 1 is Largest !");
        }
        else if(nu2>nu1 && nu2>nu3){
            System.out.println("Number 2 is Largest !");
        }else{
            System.out.println("Number 3 is Largest !");
        }

    //checking smallest number
        if(nu1<nu2 && nu1<nu3){
            System.out.println("Number 1 is Smallest !");
        }
        else if(nu2<nu1 && nu2<nu3){
            System.out.println("Number 2 is Smallest !");
        }else{
            System.out.println("Number 3 is Smallest !");
        }
    }
}