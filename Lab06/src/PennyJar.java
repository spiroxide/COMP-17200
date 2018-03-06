/**
 * Erich Ostendarp
 * 2/27/18
 * A penny jar which keeps track of each time a user adds or removes pennies,
 * tells the user how many pennies are in the jar and how much money is in the jar in dollars,
 * and warns them when the jar is full and can’t hold any more pennies
 */
public class PennyJar {
    private int jarSize, numberOfPennies;
    private String pennyLog = "";

    public PennyJar(int jarSize) {
        this.jarSize = jarSize;
    }

    /**
     * Returns true if the jar is full and false otherwise.
     * @return true if the jar is full and false otherwise
     */
    private boolean isFull() {
        return numberOfPennies >= jarSize;
    }

    /**
     * Returns true if the jar is empty and false otherwise.
     * @return true if the jar is empty and false otherwise
     */
    private boolean isEmpty() {
        return numberOfPennies <= 0;
    }

    /**
     * Returns jarSize.
     * @return jarSize
     */
    public int getJarSize() {
        return jarSize;
    }

    /**
     * returns pennyLog.
     * @return pennyLog
     */
    public String getPennyLog() {
        return pennyLog;
    }

    /**
     * returns numberOfPennies.
     * @return numberOfPennies
     */
    public int getNumberOfPennies() {
        return numberOfPennies;
    }

    /**
     * Increments numberOfPennies by one, updates pennyLog and returns true if the jar is not full and returns false otherwise.
     * @return false if the jar is full and true otherwise
     */
    private boolean addPenny() {
        if (isFull()) {
            return false;
        }
        numberOfPennies++;
        return true;
    }

    /**
     * Increments numberOfPennies by one and updates pennyLog for as many pennies are given until the jar becomes full, returning false if the jar becomes full and true otherwise.
     * @param amount number of pennies to add
     * @return false if the jar becomes full and true otherwise
     */
    public boolean addPennies(int amount) {
        for (int i = 0; i < amount; i++) {
            if (!addPenny()) {
                return false;
            }
        }
        pennyLog += amount + " added    ";
        return true;
    }

    /**
     * Decrements numberOfPennies by one, updates pennyLog and returns true if the jar is not empty and returns false otherwise.
     * @return false if the jar is empty and true otherwise.
     */
    private boolean removePenny() {
        if (isEmpty()) {
            return false;
        }
        numberOfPennies--;
        return true;
    }

    /**
     * Decrements numberOfPennies by one and updates pennyLog for as many pennies are given until the jar becomes empty, returning false if the jar becomes empty and true otherwise.
     * @param amount number of pennies to remove
     * @return false if the jar becomes empty and true otherwise
     */
    public boolean removePennies(int amount) {
        for (int i = 0; i < amount; i++) {
            if (!removePenny()) {
                return false;
            }
        }
        pennyLog += amount + " removed    ";
        return true;
    }

    /**
     * Returns the amount of pennies in the jar in dollars.
     * @return amount in dollars
     */
    public double getAmountInDollars() {
        return numberOfPennies / 100.0;
    }
}
