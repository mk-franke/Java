package list.task1;

import java.util.LinkedList;
import java.util.List;

public class Person {

    private String name;
    Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person {" + name + ",  " + address +
                '}';
    }

    public static List<Address> getAddresses(List<Person> persons) {
        List<Address> addressList = new LinkedList<>();
        for (Person p:persons) {
            addressList.add(p.address);
        }
        return addressList;
    }

}
