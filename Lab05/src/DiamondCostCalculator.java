/**
 * Erich Ostendarp
 * 2/20/18
 * Calculates the base and final price of a diamond given its weight, flawlessness and color.
 */
public class DiamondCostCalculator {
    private double caratWeight;
    private boolean flawless;
    private String color;
    private double basePrice;
    private double finalPrice;

    public DiamondCostCalculator(double caratWeight, boolean flawless, String color) {
        this.caratWeight = caratWeight;
        this.flawless = flawless;
        this.color = color;
    }

    /**
     * Determines the base price of a diamond and returns its value.
     * @return base price of a diamond
     */
    public double determineBasePrice() {
        return basePrice = Math.round(caratWeight * 32000 * 100) / 100.0;
    }

    /**
     * Determines the final price of a diamond and returns its value.
     * @return final price of a diamond
     */
    public double determineFinalPrice() {
        double temp = basePrice;
        if (flawless) {
            temp *= 2;
        }
        if (color.equals("T")) {
            temp *= .55;
        }
        else if (color.equals("K")) {
            temp *= .8;
        }
        return finalPrice = Math.round(temp * 100) / 100.0;
    }
}
