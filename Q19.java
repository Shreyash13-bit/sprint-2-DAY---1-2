import java.util.*;
import java.util.stream.*;
public class Q19 {
    static class Employee {
        private int id;
        private String name;
        public Employee(int id, String name) {
            this.id = id;
            this.name = name;
        }
        public int getId() {
            return id;
        }
        public String getName() {
            return name;
        }
        @Override
        public String toString() {
            return "Employee{id=" + id + ", name='" + name + "'}";
        }
    }
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee(101, "Alice"),
            new Employee(102, "Bob"),
            new Employee(103, "Charlie")
        );
        Optional<Employee> firstEmployee = employees.stream().findFirst();
        firstEmployee.ifPresent(emp -> System.out.println("First Employee: " + emp));
        Optional<Employee> anyEmployee = employees.stream().findAny();
        anyEmployee.ifPresent(emp -> System.out.println("Any Employee: " + emp));
    }
}
