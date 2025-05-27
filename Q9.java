import java.util.*;
class Employee {
    private String firstName;
    private String lastName;
    private String department;
    public Employee(String firstName, String lastName, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
    }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getDepartment() { return department; }
}
public class Q9 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Emp1", "Last1", "HR"),
            new Employee("Emp2", "Last2", "IT"),
            new Employee("Emp3", "Last3", "Finance"),
            new Employee("Emp4", "Last4", "IT"),
            new Employee("Emp5", "Last5", "HR"),
            new Employee("Emp6", "Last6", "Finance"),
            new Employee("Emp7", "Last7", "IT"),
            new Employee("Emp8", "Last8", "HR"),  // 8th employee (index 7)
            new Employee("Emp9", "Last9", "IT"),
            new Employee("Emp10", "Last10", "Finance")
        );
        if (employees.size() >= 8) {
            Employee eighth = employees.get(7);
            String fullName = eighth.getFirstName() + " " + eighth.getLastName();
            String department = eighth.getDepartment();

            System.out.println("Full Name: " + fullName);
            System.out.println("Department: " + department);
        } else {
            System.out.println("Less than 8 employees in the list.");
        }
    }
}
