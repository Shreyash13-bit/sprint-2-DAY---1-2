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
    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
public class Q3 {
    public static void main(String[] args) {
        Map<String, List<Employee>> departmentEmployees = new HashMap<>();
        departmentEmployees.put("HR", Arrays.asList(
            new Employee("Alice", "Johnson"),
            new Employee("Eva", "Brown")
        ));
        departmentEmployees.put("IT", Arrays.asList(
            new Employee("Bob", "Smith"),
            new Employee("Charlie", "Anderson")
        ));
        String search = "son"; 
        List<Employee> result = departmentEmployees.values().stream()
            .flatMap(List::stream)
            .filter(e -> {
                String searchLower = search.toLowerCase();
                return e.getFirstName().toLowerCase().contains(searchLower) ||
                       e.getLastName().toLowerCase().contains(searchLower);
            })
            .collect(Collectors.toList());
        result.forEac
