import java.util.*;
import java.util.stream.*;
class Employee {
    private String name;
    private String gender;
    public Employee(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }
    public String getGender() {
        return gender;
    }
}
public class Q11 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", "Female"),
            new Employee("Bob", "Male"),
            new Employee("Carol", "Female"),
            new Employee("David", "Male"),
            new Employee("Eve", "Female")
        );
        Map<String, Long> genderCount = employees.stream()
            .collect(Collectors.groupingBy(
                Employee::getGender,
                Collectors.counting()
            ));

        genderCount.forEach((gender, count) -> 
            System.out.println(gender + ": " + count)
        );
    }
}
