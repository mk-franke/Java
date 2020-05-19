import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        Integer[] arr = {1, 3, 2 ,5 ,4};
        System.out.println(arr[0] < arr[1]);

        List<Integer> arrInteger = Arrays.asList(arr);
        System.out.println(arrInteger);
        Collections.sort(arrInteger);
        System.out.println(arrInteger);

        String[] arrString = {"aa", "bb", "xx", "yy", "ab", "ya"};
        List<String> list = Arrays.asList(arrString);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        Person Ivan = new Person("Ivan", 40);
        Person Piotr = new Person("Piotr", 22);
        Person Anna = new Person("Anna", 50);

        List<Person> people = Arrays.asList(Ivan, Piotr, Anna);
        System.out.println(people);
        System.out.println(sortByName(people));

        List<Person> peopleSortedByNameAndAge = new ArrayList<>(sortByName(people));
        Collections.sort(peopleSortedByNameAndAge, new PersonByAgeComparator());
        System.out.println(peopleSortedByNameAndAge);
    }

    public static List<Person> sortByName(List<Person> people) {
        List<Person> ret = new ArrayList<>(people);
        Collections.sort(ret);
        return ret;
    }

}
