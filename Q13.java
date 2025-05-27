import java.util.*;
import java.util.stream.*;
class Employee {
    private String name;
    private double salary;
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
    @Override
    public String toString() {
        return name + " - " + salary;
    }
}
public class Q13 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", 75000),
            new Employee("Bob", 50000),
            new Employee("Charlie", 60000)
        );
        List<Employee> sorted = employees.stream()
            .sorted(Comparator.comparing(Employee::getSalary))
            .collect(Collectors.toList());
        sorted.forEach(System.out::println);
    }
}
