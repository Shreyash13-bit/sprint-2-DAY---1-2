import java.util.Optional;
class Employee {
    private String firstName;
    private Optional<String> middleName;  // optional
    private String lastName;
    private Optional<String> phoneNumber; // optional
    public Employee(String firstName, String lastName, Optional<String> middleName, Optional<String> phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName != null ? middleName : Optional.empty();
        this.phoneNumber = phoneNumber != null ? phoneNumber : Optional.empty();
    }
    public String getFirstName() {
        return firstName;
    }
    public Optional<String> getMiddleName() {
        return middleName;
    }
    public String getLastName() {
        return lastName;
    }
    public Optional<String> getPhoneNumber() {
        return phoneNumber;
    }
    public String getFullName() {
        return firstName + " " + middleName.orElse("") + (middleName.isPresent() ? " " : "") + lastName;
    }
}
public class Q14 {
    public static void main(String[] args) {
        Employee emp1 = new Employee(
            "John",
            "Doe",
            Optional.of("Michael"),
            Optional.empty()
        );
        Employee emp2 = new Employee(
            "Alice",
            "Smith",
            Optional.empty(),
            Optional.of("123-456-7890")
        );
        printEmployeeDetails(emp1);
        printEmployeeDetails(emp2);
    }
    private static void printEmployeeDetails(Employee emp) {
        System.out.println("Full Name: " + emp.getFullName());
        String phone = emp.getPhoneNumber().orElse("Phone number not provided");
        System.out.println("Phone: " + phone);
        emp.getMiddleName()
            .ifPresentOrElse(
                mn -> System.out.println("Middle Name: " + mn),
                () -> System.out.println("Middle Name: Not provided")
            );
        System.out.println("---------------------");
    }
}
