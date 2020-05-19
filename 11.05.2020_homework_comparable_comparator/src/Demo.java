import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo {

    public static void main(String[] args) {

        Person Ivan = new Person("Ivan", "Ivanov", 35);
        Person Andrey = new Person("Andrey", "Petrov", 41);
        Person Piotr = new Person("Piotr", "Grishin", 28);
        Person Anna = new Person("Anna", "Makarovna", 55);
        Person Igor = new Person("Igor", "Medvedev", 29);

        List<Person> people = Arrays.asList(Ivan, Andrey, Piotr, Anna, Igor);

        System.out.println("---Unsorted People----------");
        System.out.println(people);
        System.out.println();

        System.out.println("---------ComparePersonByFirstName----------");
        System.out.println(sortByFirstName(people));
        System.out.println();

        System.out.println("---------ComparePersonByLastName----------");
        System.out.println(sortByLastName(people));
        System.out.println();

        System.out.println("---------ComparePersonByAge----------");
        System.out.println(sortByAge(people));
        System.out.println();

    }

    public static List<Person> sortByFirstName(List<Person> people) {
        List<Person> listOfPersons = new ArrayList<>(people);
        Collections.sort(listOfPersons);
        return listOfPersons;
    }

    public static List<Person> sortByLastName(List<Person> people) {
        List<Person> listOfPersons = new ArrayList<>(people);
        Collections.sort(listOfPersons, new PersonByLastNameComparator());
        return listOfPersons;
    }

    public static List<Person> sortByAge(List<Person> people) {
        List<Person> listOfPersons = new ArrayList<>(people);
        Collections.sort(listOfPersons, new PersonByAgeComparator());
        return listOfPersons;
    }

}
