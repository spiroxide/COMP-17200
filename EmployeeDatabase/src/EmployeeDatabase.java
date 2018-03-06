import java.util.ArrayList;

/**
 * Erich Ostendarp
 * 2/21/18
 *
 */
public class EmployeeDatabase {
    private ArrayList<Employee> employees;

    public EmployeeDatabase() {
    }

    public EmployeeDatabase(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void hireEmployee(Employee employee) {
        employees.add(employee);
    }

    public void fireEmployee(Employee employee) {
        employees.remove(employee);
    }

    public static void main(String[] args) {
        Employee bob = new SalariedEmployee("Bob", "Saget", "216 Foo St.", "Fuckersville", "VA", "1-900-490-FREAK", 250000);
        Employee amy = new WagedEmployee("Amy", "Ross", "", "", "", "", 20, 40, 43);
        Employee bruce = new CommissionedEmployee("Bruce", "Springsteen", "", "", "", "", 1000000);
        EmployeeDatabase employeeDatabase = new EmployeeDatabase();
        employeeDatabase.hireEmployee(bob);
        employeeDatabase.hireEmployee(amy);
        employeeDatabase.hireEmployee(bruce);
    }
}
