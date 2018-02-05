import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Erich Ostendarp
 * 2/5/18
 * BankAccountUI stuff
 */
public class BankAccountUI implements ActionListener {

    BankAccount bankAccount;

    JFrame frame = new JFrame("BankAccountUI");
    // add buttons and shit

    public BankAccountUI(BankAccount bankAccount) {
        this.bankAccount = bankAccount;

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        // initialize buttons and shit
        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);
    }

    /**
     *
     * @param amount
     * @return
     */
    private double deposit(double amount) {
        if (amount > 0) {
            return bankAccount.setBalance(bankAccount.getBalance() + amount);
        }
        System.out.println("Oh fuck. I can't believe you've done this.");
        return -1;
    }

    /**
     *
     * @param amount
     * @return
     */
    private double withdraw(double amount) {
        if (amount > 0) {
            return bankAccount.setBalance(bankAccount.getBalance() - amount);
        }
        System.out.println("Oh fuck. I can't believe you've done this.");
        return -1;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        BankAccountUI bankAccountUI = new BankAccountUI(new BankAccount(100, 1));
    }
}
