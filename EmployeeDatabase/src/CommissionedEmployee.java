/**
 * Erich Ostendarp
 * 2/21/18
 *
 */
public class CommissionedEmployee extends Employee {
    private double totalSales;

    public CommissionedEmployee(String firstName, String lastName, String address, String city, String state, String phone, double totalSales) {
        super(firstName, lastName, address, city, state, phone);
        this.totalSales = totalSales;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CommissionedEmployee that = (CommissionedEmployee) o;
        return Double.compare(that.totalSales, totalSales) == 0;
    }
}
