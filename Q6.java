import java.util.*;
import java.util.stream.*;
class Employee {
    private String firstName;
    private String lastName;
    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
public class Q6 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Charlie", "Brown"),
            new Employee("Alice", "Johnson"),
            new Employee("Bob", "Smith")
        );
        List<Employee> sortedByFirstName = employees.stream()
            .sorted(Comparator.comparing(Employee::getFirstName))
            .collect(Collectors.toList());
        sortedByFirstName.forEach(System.out::println);
    }
}
