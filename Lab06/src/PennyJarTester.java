/**
 * Erich Ostendarp
 * 2/27/18
 * PennyJar testing class.
 */
public class PennyJarTester {
    public static void main(String[] args) {
        int[] jarSizes = {7000, 3500, 1750, 875};
        PennyJar[] pennyJars = new PennyJar[4];

        boolean passed = true;
        for (int i = 0; i < pennyJars.length; i++) {
            pennyJars[i] = new PennyJar(jarSizes[i]);
            // addPennies test
            pennyJars[i].addPennies(jarSizes[i]);
            if (pennyJars[i].getNumberOfPennies() != jarSizes[i]) {
                System.out.println("Penny jar " + i + " failed addPennies test.");
                passed = false;
            }
            // getAmountInDollarsTest
            if (pennyJars[i].getAmountInDollars() != jarSizes[i] / 100.0) {
                System.out.println("Penny jar " + i + " failed getAmountInDollars test.");
                passed = false;
            }
            // overflowTest
            if (pennyJars[i].addPennies(1)) {
                System.out.println("Penny jar " + i + " failed overflow test.");
                passed = false;
            }
            // removePennies test
            pennyJars[i].removePennies(jarSizes[i]);
            if (pennyJars[i].getNumberOfPennies() != 0) {
                System.out.println("Penny jar " + i + " failed removePennies test.");
                passed = false;
            }
            // underflow test
            if (pennyJars[i].removePennies(1)) {
                System.out.println("Penny jar " + i + " failed underflow test.");
                passed = false;
            }
        }
        if (passed) {
            System.out.println("All tests passed.");
        }
    }
}
