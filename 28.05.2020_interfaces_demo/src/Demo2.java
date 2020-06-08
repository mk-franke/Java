import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo2 {

    public static void main(String[] args) throws IOException {

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

        Stream<String> stream = names.stream();

        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6);
 //      List<Integer> integerList1 = Collections.emptyList();
 //       Stream<Integer> intStream = Stream.of(1, 2, 3, 4, 5, 6);

        long count = integerList.stream().count();
        System.out.println("amount of integers: " + count);
        int sum = integerList.stream().mapToInt(i -> i).sum();
        System.out.println(sum);

        Optional<Integer> sum2 = integerList.stream().reduce((a, b) -> a + b);
        if (sum2.isPresent()) {
            System.out.println(sum2.get());
        } else {
            System.out.println("no sum");
        }

        Integer integer = integerList.stream().reduce((a, b) -> a + b).orElse(0);
        System.out.println(integer);

        Integer integer1 = integerList.stream().filter(a -> a > 5).reduce((a, b) -> a + b).orElse(0);
        System.out.println("filtered sum " + integer1);

        String s = integerList.stream().map(String::valueOf).reduce((a, b) -> a + b).orElse("");
        System.out.println(s);
        String s1 = integerList.stream().map(String::valueOf).collect(Collectors.joining(", "));
        List<String> collect = integerList.stream().map(String::valueOf).collect(Collectors.toList());

        Map<Integer, List<String>> collect1 = names.stream().collect(Collectors.groupingBy(String::length));
        collect1.forEach((k, v) -> System.out.println(k + " " + v));

        List<Integer> intValue = Arrays.asList(1, 2, 3, 4, 5);
        intValue.stream().map(Demo2::intToDoubleString).reduce((a, b) -> a + b);
        intValue.stream().map(Demo2::intToDoubleString).map(Demo2::toUpperCase).reduce((a, b) -> a + b);
//        intValue.stream().map(Demo2::intToDoubleString).collect(Collectors.toList());

        Stream<String> lines = Files.lines(Paths.get("test.txt"));
        lines.forEach(System.out::println);

    }

    public static String toUpperCase(String s) {
        System.out.println("toUpperCase " + s);
        return s.toUpperCase();
    }

    public static String intToDoubleString(int i) {
        System.out.println("intToDoubleString " + i);
        String val = String.valueOf(i);
        return val + val;
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
