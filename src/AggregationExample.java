/*
In Java, aggregation is a type of association between two classes where one class contains a reference to another class.
 It represents a "has-a" relationship, where one class "has" another class as a part or component.
  Unlike composition, in aggregation, the child object can exist independently of the parent object.
*/
class Address {
    private String street;
    private String city;
    private String state;
    private String zipCode;

    public Address(String street, String city, String state, String zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipCode() {
        return zipCode;
    }
}

class Person {
    private String name;
    private Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public String getAddressDetails() {
        return "Name: " + name + "\nAddress: " + address.getStreet() + ", " +
                address.getCity() + ", " + address.getState() + " " + address.getZipCode();
    }
}

public class AggregationExample {
    public static void main(String[] args) {
        Address address= new Address("Kphb main road", "Hyderabad", "Telangana", "500085");
        Person person = new Person("Arun", address);

        System.out.println(person.getAddressDetails());
    }
}

