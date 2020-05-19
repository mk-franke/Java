import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ComparePersonTest {

    @Test
    public void testComparePerson_1() {
        Person Ivan = new Person("Ivan", "Ivanov", 35);
        Person Andrey = new Person("Andrey", "Petrov", 41);
        Person Piotr = new Person("Piotr", "Grishin", 28);
        Person Anna = new Person("Anna", "Makarovna", 55);
        Person Igor = new Person("Igor", "Medvedev", 29);
        List<Person> persons = new ArrayList<>();
        Collections.addAll(persons, Ivan, Andrey, Piotr, Anna, Igor);
        List<Person> expected = new ArrayList<>();
        Collections.addAll(expected, Andrey, Anna, Igor, Ivan, Piotr);
        List<Person> actual = Demo.sortByFirstName(persons);
        assertEquals(expected, actual);
    }

    @Test
    public void testComparePerson_2() {
        Person Ivan = new Person("Ivan", "Ivanov", 35);
        Person Andrey = new Person("Andrey", "Petrov", 41);
        Person Piotr = new Person("Piotr", "Grishin", 28);
        Person Anna = new Person("Anna", "Makarovna", 55);
        Person Igor = new Person("Igor", "Medvedev", 29);
        List<Person> persons = new ArrayList<>();
        Collections.addAll(persons, Ivan, Andrey, Piotr, Anna, Igor);
        List<Person> expected = new ArrayList<>();
        Collections.addAll(expected, Piotr, Ivan, Anna, Igor, Andrey);
        List<Person> actual = Demo.sortByLastName(persons);
        assertEquals(expected, actual);
    }

    @Test
    public void testComparePerson_3() {
        Person Ivan = new Person("Ivan", "Ivanov", 35);
        Person Andrey = new Person("Andrey", "Petrov", 41);
        Person Piotr = new Person("Piotr", "Grishin", 28);
        Person Anna = new Person("Anna", "Makarovna", 55);
        Person Igor = new Person("Igor", "Medvedev", 29);
        List<Person> persons = new ArrayList<>();
        Collections.addAll(persons, Ivan, Andrey, Piotr, Anna, Igor);
        List<Person> expected = new ArrayList<>();
        Collections.addAll(expected, Piotr, Igor, Ivan, Andrey, Anna);
        List<Person> actual = Demo.sortByAge(persons);
        assertEquals(expected, actual);
    }

}
