import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Erich Ostendarp
 * 2/2/18
 * BankAccount stuff
 */
public class BankAccount implements ActionListener {
    private final int COMPOUND_TIME = 1000; // 1 second

    private double balance;
    private double rate;

    private Timer timer = new Timer(COMPOUND_TIME, this);

    public BankAccount(double balance, double rate) {
        this.balance = balance;
        this.rate = rate;
        timer.start();
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
    public double addInterest() {
        balance += balance * rate;
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
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(timer)) {
            System.out.println(addInterest());
        }
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
