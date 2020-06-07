import java.time.LocalDate;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.*;

public class Demo2 {

    public static void main(String[] args) {

        Predicate<String> p1 = s -> s.length()%2 == 0;
        System.out.println(p1.test("abcd"));
        System.out.println(p1.test("abcde"));
        System.out.println(p1.test("a"));
        System.out.println(p1.test("aa"));
        System.out.println(p1.test("aabbdd"));

        LocalDate now = LocalDate.now();
        System.out.println(now);

        Supplier<LocalDate> today = () -> LocalDate.now();
        System.out.println(today.get());
        Supplier<LocalDate> yesterday = () -> LocalDate.now().minusDays(1);
        System.out.println(yesterday.get());

        //method reference to the static method
        Function<String, Integer> getLength = Demo2::getLength;
        System.out.println(getLength.apply("abcdef"));

        Function<String, Integer> doubleLength = Demo2::getDoubleLength;

        doSomething(Demo2::getLength);

        //method reference to an instance method of an object
        Person person = new Person("Piotr", 21);
        Supplier<Integer> getAge1 = person::getAge;
        System.out.println(getAge1.get());

        Function<Person, Integer> getAge2 = Person::getAge;
        System.out.println(getAge2.apply(person));

        BiFunction<String, Integer, Person> newPerson1 = (s, i) -> new Person(s, i);
        BiFunction<String, Integer, Person> newPerson2 = Person::new;
        Person ivan = newPerson2.apply("Ivan", 40);

        List<String> names = Arrays.asList("ivan", "anna", "piotr", "sergey", "natalia");

        for (String n : names) {
            System.out.println(n);
        }

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        names.stream().forEach(System.out::println);

    }

    public static int getLength(String str) {
        System.out.println("Calling getLength");
        return str.length();
    }

    public static int getDoubleLength(String str) {
        int l = str.length();
        System.out.println(l);
        return l*2;
    }

    public static void doSomething(Function<String, Integer> f) {
        System.out.println(f.apply("Hello World"));
    }

}
