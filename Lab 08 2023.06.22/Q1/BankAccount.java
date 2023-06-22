abstract public class BankAccount {
    private int accountNumber;
    private double balance;


    //getter of accnumber
    public int getAccountNumber() {
        return accountNumber;
    }
    //setter of accnumber
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    //getter of blance
    public double getBalance() {
        return balance;
    }
    //setter of balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public abstract double calculateInterest();

}
