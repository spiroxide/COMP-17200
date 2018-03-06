import java.util.Scanner;

public class TripCostCalculator {

    private double distance;
    private double mpg;
    private double mpm;
    private double gasCost;
    private double ticketCost;

    public TripCostCalculator(double distance, double mpg, double mpm, double gasCost, double ticketCost) {
        this.distance = distance;
        this.mpg = mpg;
        this.mpm = mpm;
        this.gasCost = gasCost;
        this.ticketCost = ticketCost;
    }

    /**
     * Returns the cost to drive to work in dollars rounded to the nearest hundredth
     * @return the cost to drive to work in dollars rounded to the nearest hundredth
     */
    public double costToDrive() {
        return Math.round(distance * ((gasCost / mpg) + mpm) * 100) / 100.0;
    }

    /**
     * Returns whether to drive to work or take the train depending on which is cheaper
     * @param carCost cost to drive to work
     * @return whether to drive to work or take the train depending on which is cheaper
     */
    public String carOrTrain(double carCost) {
        if (carCost < ticketCost) {
            return "Drive to work.";
        }
        return "Take the train.";
    }

    public static void main(String[] args) {
        TripCostCalculator tcc1 = new TripCostCalculator(50, 25, .05, 4, 7);
        System.out.println("Expected result: 10.5");
        System.out.println("Actual result: " + tcc1.costToDrive());
        System.out.println(tcc1.carOrTrain(tcc1.costToDrive()));

        System.out.println();

        TripCostCalculator tcc2 = new TripCostCalculator(50, 25, .05, 2, 7);
        System.out.println("Expected result: 6.5");
        System.out.println("Actual result: " + tcc2.costToDrive());
        System.out.println(tcc2.carOrTrain(tcc2.costToDrive()));

        System.out.println();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the distance from work in miles: ");
        double distance = input.nextDouble();
        System.out.print("Enter the fuel efficiency of your car in mpg: ");
        double mpg = input.nextDouble();
        System.out.print("Enter the maintenance cost of your car per mile: ");
        double mpm = input.nextDouble();
        System.out.print("Enter the cost of gas in dollars per gallon: ");
        double gasCost = input.nextDouble();
        System.out.print("Enter the cost of a train ticket: ");
        double ticketCost = input.nextDouble();
        input.close();
        TripCostCalculator tripCostCalculator = new TripCostCalculator(distance, mpg, mpm, gasCost, ticketCost);
        System.out.println("Cost to drive: " + tripCostCalculator.costToDrive());
        System.out.println(tripCostCalculator.carOrTrain(tripCostCalculator.costToDrive()));
    }
}
