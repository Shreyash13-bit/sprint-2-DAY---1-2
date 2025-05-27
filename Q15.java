import java.util.Optional;
class Employee {
    private String firstName;
    private String lastName;
    private Optional<String> address;
    public Employee(String firstName, String lastName, Optional<String> address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address != null ? address : Optional.empty();
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public Optional<String> getAddress() {
        return address;
    }
    public String getAddressOrDefault() {
        return address.orElse("123 Default St, Default City, 00000");
    }
    @Override
    public String toString() {
        return firstName + " " + lastName + ", Address: " + getAddressOrDefault();
    }
}
public class Q15 {
    public static void main(String[] args) {
        Employee empWithAddress = new Employee("John", "Doe", Optional.of("456 Elm St, Springfield"));
        Employee empWithoutAddress = new Employee("Alice", "Smith", Optional.empty());
        System.out.println(empWithAddress);
        System.out.println(empWithoutAddress);
    }
}
