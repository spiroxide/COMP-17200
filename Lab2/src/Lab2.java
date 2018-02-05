import java.util.Scanner;

/**
 * Erich Ostendarp
 * 1/25/18
 *
 */
public class Lab2 {
    private double distance;
    private double mpg;
    private double mpm; // maintenance cost per mile
    private double gasCost;
    private double ticketCost;

    public Lab2(double distance, double mpg, double mpm, double gasCost, double ticketCost) {
        this.distance = distance;
        this.mpg = mpg;
        this.mpm = mpm;
        this.gasCost = gasCost;
        this.ticketCost = ticketCost;
    }

    /**
     * Returns "Drive to work" if the cost to drive is less than a train ticket and returns "Take the train" otherwise.
     * @return whether to drive or take the train to work
     */
    public String driveOrTrain() {
        double driveCost = distance * ((gasCost / mpg) + mpm);
        if (driveCost < ticketCost) {
            return "Drive to work.";
        }
        return "Take the train.";
    }

    public static void main(String[] args) {
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
        Lab2 myLab2 = new Lab2(distance, mpg, mpm, gasCost, ticketCost);
        System.out.println(myLab2.driveOrTrain());
    }
}
