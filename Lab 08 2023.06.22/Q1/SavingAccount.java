public class SavingAccount extends BankAccount{
    private final double interest =0.12;

    @Override
    public double calculateInterest() {
        return getBalance()*interest;

    }
}
