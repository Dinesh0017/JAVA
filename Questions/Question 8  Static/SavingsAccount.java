public class SavingsAccount {
    private static double annualInterestRate;
    private double savingsBalance;

    public SavingsAccount(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    //getter setter method for saving balance
    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    //calculate the monthly Interest Rate
    public void calculateMonthlyInteres(){
        double monthlyInterest=(savingsBalance*annualInterestRate)/12;
        savingsBalance+=monthlyInterest;
    }

    public static void modifyIntereste(double newIntereste){
        annualInterestRate=newIntereste;
    }
}
