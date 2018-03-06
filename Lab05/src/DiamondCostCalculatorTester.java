/**
 * Erich Ostendarp
 * 2/20/18
 * DiamondCostCalculator test suite
 */
public class DiamondCostCalculatorTester {
    public static void main(String[] args) {
        DiamondCostCalculator dcc1 = new DiamondCostCalculator(1.5, true, "D");
        DiamondCostCalculator dcc2 = new DiamondCostCalculator(1.5, false, "D");
        DiamondCostCalculator dcc3 = new DiamondCostCalculator(1.5, false, "K");
        DiamondCostCalculator dcc4 = new DiamondCostCalculator(1.5, false, "T");

        if (dcc1.determineBasePrice() != 48000) {
            System.out.println("There was an error.");
        }
        else if (dcc1.determineFinalPrice() != 96000) {
            System.out.println("There was an error.");
        }
        else if (dcc2.determineBasePrice() != 48000) {
            System.out.println("There was an error.");
        }
        else if (dcc2.determineFinalPrice() != 48000) {
            System.out.println("There was an error.");
        }
        else if (dcc3.determineBasePrice() != 48000) {
            System.out.println("There was an error.");
        }
        else if (dcc3.determineFinalPrice() != 38400) {
            System.out.println("There was an error.");
        }
        else if (dcc4.determineBasePrice() != 48000) {
            System.out.println("There was an error.");
        }
        else if (dcc4.determineFinalPrice() != 26400) {
            System.out.println("There was an error.");
        }
        else {
            System.out.println("No errors.");
        }
    }
}
