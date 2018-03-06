import java.util.Objects;

/**
 * Erich Ostendarp
 * 2/21/18
 *
 */
public class SalariedEmployee extends Employee {
    private double salary;

    public SalariedEmployee(String firstName, String lastName, String address, String city, String state, String phone, double salary) {
        super(firstName, lastName, address, city, state, phone);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SalariedEmployee that = (SalariedEmployee) o;
        return Double.compare(that.salary, salary) == 0;
    }
}
