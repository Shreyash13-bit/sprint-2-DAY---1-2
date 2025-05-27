import java.util.*;
import java.util.stream.*;
class Employee {
    private int empId;
    private String firstName;
    private String lastName;
    public Employee(int empId, String firstName, String lastName) {
        this.empId = empId;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public int getEmpId() {
        return empId;
    }
    @Override
    public String toString() {
        return empId + ": " + firstName + " " + lastName;
    }
}
public class Q10 {
    public static void main(String[] args) {
        List<Employee> allEmployees = Arrays.asList(
            new Employee(101, "Alice", "Smith"),
            new Employee(102, "Bob", "Johnson"),
            new Employee(103, "Charlie", "Brown"),
            new Employee(104, "David", "Wilson")
        );
        List<Integer> empIdsToFind = Arrays.asList(102, 104);
        List<Employee> matchingEmployees = allEmployees.stream()
            .filter(e -> empIdsToFind.contains(e.getEmpId()))
            .collect(Collectors.toList());
        matchingEmployees.forEach(System.out::println);
    }
}
