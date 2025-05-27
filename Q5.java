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

    @Override
    public String toString() {
        return name + " (" + department + ")";
    }
}
public class Q5 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", "HR"),
            new Employee("Bob", "IT"),
            new Employee("Charlie", "Finance"),
            new Employee("David", "IT")
        );
        String departmentToExclude = "IT";
        List<Employee> filtered = employees.stream()
            .filter(e -> !e.getDepartment().equalsIgnoreCase(departmentToExclude))
            .collect(Collectors.toList());
        filtered.forEach(System.out::println);
    }
}
