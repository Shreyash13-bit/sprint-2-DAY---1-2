import java.util.*;
public class Q17 {
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
    public static void main(String[] args) {
        List<Address> addresses = Arrays.asList(
            new Address("Paris", "France"),
            new Address("Lyon", "France"),
            new Address("Berlin", "Germany"),
            new Address("Munich", "Germany"),
            new Address("Paris", "USA")
        );
        addresses.sort(Comparator.comparing(Address::getCity)
                                 .thenComparing(Address::getCountry));
        for (Address address : addresses) {
            System.out.println(address);
        }
    }
}
