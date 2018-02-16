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

    private BankAccount bankAccount;

    private JFrame frame = new JFrame("BankAccountUI");
    private JTextField usernameField = new JTextField();
    private JPasswordField passwordField = new JPasswordField();
    private JButton login = new JButton("Login");

    public BankAccountUI(BankAccount bankAccount) {
        this.bankAccount = bankAccount;

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        // initialize buttons and shit
        usernameField.addActionListener(this);
        frame.add(usernameField, BorderLayout.NORTH);

        passwordField.addActionListener(this);
        frame.add(passwordField, BorderLayout.CENTER);

        login.addActionListener(this);
        frame.add(login, BorderLayout.SOUTH);

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
        if (e.getSource().equals(usernameField)) {
            System.out.println(e.getActionCommand());
        }
        if (e.getSource().equals(passwordField)) {
            System.out.println(e.getActionCommand());
        }
        if (e.getSource().equals(login)) {
            System.out.println(e.getActionCommand());
        }
    }

    public static void main(String[] args) {
        new BankAccountUI(new BankAccount("erich", "passw0rd", 100, .01));
    }
}
