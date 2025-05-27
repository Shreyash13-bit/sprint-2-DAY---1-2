import java.util.*;

class Employee {
    private String firstName;
    private String lastName;
    private Optional<String> department;
    private double salary;
    public Employee(String firstName, String lastName, Optional<String> department, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department != null ? department : Optional.empty();
        this.salary = salary;
    }
    public Optional<String> getDepartment() {
        return department;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return firstName + " " + lastName + ", Dept: " + department.orElse("N/A") + ", Salary: " + salary;
    }
}
public class Q16 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", "Smith", Optional.of("IT"), 70000),
            new Employee("Bob", "Johnson", Optional.of("HR"), 65000),
            new Employee("Charlie", "Brown", Optional.of("IT"), 72000),
            new Employee("David", "Wilson", Optional.empty(), 60000)
        );
        double increment = 5000;
        employees.forEach(emp -> 
            emp.getDepartment().ifPresent(dept -> {
                if (dept.equalsIgnoreCase("IT")) {
                    emp.setSalary(emp.getSalary() + increment);
                }
            })
        );
        employees.forEach(System.out::println);
    }
}
