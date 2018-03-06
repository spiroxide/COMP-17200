import java.util.Scanner;

/**
 * Erich Ostendarp
 * 2/26/18
 * User interface for DiamondCostCalculator
 */
public class DiamondCostCalculatorUI {
    private static double checkWeight() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the diamond's carat weight: ");
        double weight = sc.nextDouble();
        while (weight <= 1) {
            System.out.print("Enter a valid diamond carat weight: ");
            weight = sc.nextDouble();
        }
        return weight;
    }

    private static boolean checkFlawlessness() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 'true' if the diamond is flawless and 'false' otherwise: ");
        String temp = sc.next();
        while (!temp.equals("true") && !temp.equals("false")) {
            System.out.print("Enter 'true' or 'false': ");
            temp = sc.next();
        }
        return Boolean.parseBoolean(temp);
    }

    private static String checkColor() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the diamond's color rating: ");
        String color = sc.next();
        while (!color.equals("D") && !color.equals("K") && !color.equals("T")) {
            System.out.print("Enter a valid color rating: ");
            color = sc.next();
        }
        return color;
    }

    public static void main(String[] args) {
        DiamondCostCalculator dcc = new DiamondCostCalculator(checkWeight(), checkFlawlessness(), checkColor());
        System.out.println(dcc.determineBasePrice() + " " + dcc.determineFinalPrice());
    }
}
