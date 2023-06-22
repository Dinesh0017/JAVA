public class CheckingAccount extends BankAccount{
    private final double interest=0.02;

    @Override
    public double calculateInterest() {
        return getBalance()*interest;
    }
}
