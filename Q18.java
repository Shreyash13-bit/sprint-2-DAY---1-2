import java.util.*;
import java.util.stream.Collectors;

public class Q18 {
    static class Address {
        private String city;
        private String country;
        public Address(String city, String country) {
            this.city = city;
            this.country = country;
        }
        public String getCity() {
            return city;
        }
        public String getCountry() {
            return country;
        }
        @Override
        public String toString() {
            return city + ", " + country;
        }
    }
    static class Person {
        private String firstName;
        private String lastName;
        private Address address;
        public Person(String firstName, String lastName, Address address) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.address = address;
        }
        public String getFirstName() {
            return firstName;
        }
        public String getLastName() {
            return lastName;
        }
        public Address getAddress() {
            return address;
        }
    }
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
            new Person("John", "Doe", new Address("New York", "USA")),
            new Person("Jane", "Smith", new Address("London", "UK")),
            new Person("Alice", "Johnson", new Address("Paris", "France"))
        );
        Map<String, Address> map = people.stream()
            .collect(Collectors.toMap(
                person -> person.getFirstName() + person.getLastName(),
                Person::getAddress
            ));
        map.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}
