import java.util.*;
import java.util.stream.*;
class Employee {
    private String firstName;
    private String gender;
    public Employee(String firstName, String gender) {
        this.firstName = firstName;
        this.gender = gender;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getGender() {
        return gender;
    }
}
public class Q12 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("John", "Male"),
            new Employee("Mike", "Male"),
            new Employee("Alice", "Female"),
            new Employee("Lily", "Female")
        );
        Map<String, List<Employee>> grouped = employees.stream()
            .collect(Collectors.groupingBy(Employee::getGender));
        String maleNames = grouped.getOrDefault("Male", Collections.emptyList()).stream()
            .map(Employee::getFirstName)
            .collect(Collectors.joining("-"));
        String femaleNames = grouped.getOrDefault("Female", Collections.emptyList()).stream()
            .map(Employee::getFirstName)
            .collect(Collectors.joining("-"));
        String result = String.format("MALE: [%s], FEMALE: [%s]", maleNames, femaleNames);
        System.out.println(result);
    }
}
