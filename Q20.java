import java.util.*;
import java.util.stream.*;

public class Q20 {

    static class Employee {
        private String name;
        private String department;
        private String email;

        public Employee(String name, String department, String email) {
            this.name = name;
            this.department = department;
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public String getDepartment() {
            return department;
        }

        public String getEmail() {
            return email;
        }
    }
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", "HR", "alice@company.com"),
            new Employee("Bob", "Engineering", "bob@company.com"),
            new Employee("Charlie", "HR", "charlie@company.com"),
            new Employee(null, "Finance", "finance@company.com"),
            new Employee("Eve", "Marketing", null)
        );
        boolean anyFromHR = employees.stream()
                .anyMatch(e -> "HR".equalsIgnoreCase(e.getDepartment()));
        boolean allHaveEmail = employees.stream()
                .allMatch(e -> e.getEmail() != null && !e.getEmail().isEmpty());
        boolean noneHasNullName = employees.stream()
                .noneMatch(e -> e.getName() == null);
        System.out.println("Any employee from HR? " + anyFromHR);
        System.out.println("All employees have email? " + allHaveEmail);
        System.out.println("No employee has null name? " + noneHasNullName);
    }
}
