/**
 * Erich Ostendarp
 * 2/2/18
 * BankAccount stuff
 */
public class BankAccount {
    private double balance;
    private double rate;

    public BankAccount(double balance, double rate) {
        this.balance = balance;
        this.rate = rate;
    }

    public BankAccount() {
        this(0, 0);
    }

    /**
     *
     * @return
     */
    public double getBalance() {
        return balance;
    }

    /**
     *
     * @param balance
     */
    public double setBalance(double balance) {
        this.balance = balance;
        return balance;
    }

    /**
     *
     * @return
     */
    public double getRate() {
        return rate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BankAccount that = (BankAccount) o;
        return Double.compare(that.balance, balance) == 0 && Double.compare(that.rate, rate) == 0;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                ", rate=" + rate +
                '}';
    }

    public static void main(String[] args) {
        new BankAccount();
    }
}
