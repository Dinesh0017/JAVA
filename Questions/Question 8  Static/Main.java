import java.text.DecimalFormat;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        SavingsAccount s1=new SavingsAccount(2000.00);
        SavingsAccount s2=new SavingsAccount(3000.00);

        // annual interest 4%
        SavingsAccount.modifyIntereste(0.04);

        s1.calculateMonthlyInteres();
        s2.calculateMonthlyInteres();

        DecimalFormat de=new DecimalFormat("#0.000");
        
        String saver1=de.format(s1.getSavingsBalance());
        System.out.println("Saver 1 balance after 1 month: $"+saver1);

        String saver2=de.format(s2.getSavingsBalance());
        System.out.println("Saver 2 balance after 1 month: $"+saver2);

        //annual interest 5%
        SavingsAccount.modifyIntereste(0.05);

        s1.calculateMonthlyInteres();
        s2.calculateMonthlyInteres();

        String Saver1= de.format(s1.getSavingsBalance());
        System.out.println("Saver 1 balance after 1 month: $"+Saver1);

        String Saver2= de.format(s2.getSavingsBalance());
        System.out.println("Saver 2 balance after 1 month: $"+Saver2);

    }
}