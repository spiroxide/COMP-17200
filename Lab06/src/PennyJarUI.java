import java.util.Scanner;

/**
 * Erich Ostendarp
 * 2/27/18
 * PennyJar user interface and driver class.
 */
public class PennyJarUI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // require a valid size input
        System.out.print("Is your jar a 'gallon', 'half gallon', 'quart' or 'pint': ");
        String sizeString = sc.next();
        while (!(sizeString.equals("gallon") || sizeString.equals("half gallon") || sizeString.equals("quart") || sizeString.equals("pint"))) {
            System.out.print("Enter a valid jar size: ");
            sizeString = sc.next();
        }

        int jarSize;
        if (sizeString.equals("gallon")) {
            jarSize = 7000;
        }
        else if (sizeString.equals("half gallon")) {
            jarSize = 3500;
        }
        else if (sizeString.equals("quart")) {
            jarSize = 1750;
        }
        else {
            jarSize = 875;
        }
        PennyJar pennyJar = new PennyJar(jarSize);
        // main loop
        boolean running = true;
        while (running) {
            System.out.print("Would you like to 'add' pennies, 'remove' pennies, 'check' the number of pennies, see the amount in 'dollars', or 'quit': ");
            String userOption = sc.next();
            while (!(userOption.equals("add") || userOption.equals("remove") || userOption.equals("check") || userOption.equals("dollars") || userOption.equals("quit"))) {
                System.out.print("Enter a valid option: ");
                userOption = sc.next();
            }

            if (userOption.equals("quit")) {
                sc.close();
                System.out.println("Goodbye.");
                running = false;
            }
            else if (userOption.equals("check")) {
                System.out.println("There are " + pennyJar.getNumberOfPennies() + " pennies in the jar.");
            }
            else if (userOption.equals("dollars")){
                System.out.println("There are " + pennyJar.getAmountInDollars() + " dollars in pennies in the jar.");
            }
            else {
                System.out.print("Enter an number of pennies: ");
                String amountString = sc.next();
                int amount = -1;
                boolean invalid = true;
                while (invalid) {
                    try {
                        amount = Integer.parseInt(amountString);
                        if (amount < 1) {
                            System.out.print("You must enter an integer greater than 0: ");
                            amountString = sc.next();
                        }
                        else {
                            invalid = false;
                        }
                    }
                    catch (NumberFormatException e) {
                        System.out.print("You must enter an integer: ");
                        amountString = sc.next();
                    }
                }

                if (userOption.equals("add")) {
                    if (!pennyJar.addPennies(amount)) {
                        System.out.println("The jar is full.");
                    }
                }
                else {
                    if(!pennyJar.removePennies(amount)) {
                        System.out.println("The jar is empty.");
                    }
                }
            }
        }
    }
}
