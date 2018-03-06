import java.util.Objects;

/**
 * Erich Ostendarp
 * 2/21/18
 *
 */
public class WagedEmployee extends Employee {
    private double wage, overtime, hoursWorked;

    public WagedEmployee(String firstName, String lastName, String address, String city, String state, String phone, double wage, double overtime, double hoursWorked) {
        super(firstName, lastName, address, city, state, phone);
        this.wage = wage;
        this.overtime = overtime;
        this.hoursWorked = hoursWorked;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getOvertime() {
        return overtime;
    }

    public void setOvertime(double overtime) {
        this.overtime = overtime;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        WagedEmployee that = (WagedEmployee) o;
        return Double.compare(that.wage, wage) == 0 &&
                Double.compare(that.overtime, overtime) == 0 &&
                Double.compare(that.hoursWorked, hoursWorked) == 0;
    }
}
