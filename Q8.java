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
    public String getLastName() {
        return lastName;
    }
}
public class Q8 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", "Smith"),
            new Employee("Bob", "Johnson"),
            new Employee("Charlie", "Brown")
        );
        String concatenatedNames = employees.stream()
            .map(e -> e.getFirstName() + e.getLastName())
            .collect(Collectors.joining("|"));
        System.out.println(concatenatedNames);
    }
}
