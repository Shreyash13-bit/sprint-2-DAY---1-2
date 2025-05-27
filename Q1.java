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
public class Q1 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("John", "Doe"),
            new Employee("Jane", "Smith")
        );
        Optional<String> fullName = employees.stream()
            .findFirst()
            .map(e -> e.getFirstName() + " " + e.getLastName());
        fullName.ifPresent(System.out::println);
    }
}
