import java.util.*;
import java.util.stream.*;

class Employee {
    private int empId;
    private String name;
    public Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }
    public int getEmpId() {
        return empId;
    }
    @Override
    public String toString() {
        return empId + " - " + name;
    }
}
public class Q7 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee(101, "Alice"),
            new Employee(205, "Bob"),
            new Employee(150, "Charlie")
        );
        Optional<Employee> highestEmpIdEmployee = employees.stream()
            .max(Comparator.comparingInt(Employee::getEmpId));
        highestEmpIdEmployee.ifPresent(System.out::println);
    }
}
