import java.util.*;
import java.util.stream.*;
class Employee {
    private String name;
    private String department;
    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }
    public String getDepartment() {
        return department;
    }
}
public class Q2 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", "HR"),
            new Employee("Bob", "IT"),
            new Employee("Charlie", "IT"),
            new Employee("David", "Finance"),
            new Employee("Eve", "HR")
        );
        Map<String, Long> departmentCounts = employees.stream()
            .collect(Collectors.groupingBy(
                Employee::getDepartment, Collectors.counting()
            ));
        departmentCounts.forEach((dept, count) -> 
            System.out.println(dept + ": " + count)
        );
    }
}
