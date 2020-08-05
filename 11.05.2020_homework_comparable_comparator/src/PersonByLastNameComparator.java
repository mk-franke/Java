import java.util.Comparator;

public class PersonByLastNameComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.lastName.compareTo(o2.lastName);
    }

}
