import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int n1,n2,ans;
        System.out.println("Enter First Number: ");
        n1=a.nextInt();

        System.out.println("Enter Second Number: ");
        n2=a.nextInt();
        try{
            ans=n1/n2;
            System.out.println("Answer is "+ans);
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }

    }
}