import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BankAccountUI implements ActionListener{
    BankAccount bankAccount;

    JFrame frame = new JFrame("BankAccountUI");

    public BankAccountUI(BankAccount bankAccount) {
        this.bankAccount = bankAccount;

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        // add buttons and shit
        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);
    }

    private double deposit(double amount) {
        return bankAccount.setBalance(bankAccount.getBalance() + amount);
    }

    private double withdraw(double amount) {
        return bankAccount.setBalance(bankAccount.getBalance() - amount);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {

    }
}
