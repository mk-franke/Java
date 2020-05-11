package list.task1;

import org.junit.Test;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class GetAddressesTest {

    @Test
    public void getAddressesTest() {
        Address a1 = new Address("Friedrichstraße", 2);
        Address a2 = new Address("Leipziger Straße", 4);
        Address a3 = new Address("Karl-Marx-Allee", 6);
        Address a4 = new Address("Unter den Linden", 8);
        Address a5 = new Address("Kurfürstendamm", 9);

        List<Person> personList = new LinkedList<>();
        personList.add(new Person("Ivan", a1));
        personList.add(new Person("Maria", a2));
        personList.add(new Person("Anna", a3));
        personList.add(new Person("Piotr", a4));
        personList.add(new Person("Mikhail", a5));

        List<Address> expAddressList = new LinkedList<>();
        Collections.addAll(expAddressList, a1, a2, a3, a4, a5);

        List<Address> actAddressList = Person.getAddresses(personList);

        assertEquals(expAddressList, actAddressList);
    }

}
