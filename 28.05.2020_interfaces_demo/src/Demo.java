import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Demo {

    public static void main(String[] args) {
        Faxable fax = new FaxDevice();

        Faxable fax2 = new Faxable() {
            @Override
            public void sendFax(String message) {
                System.out.println("Sending a message " + message);
            }

            @Override
            public String receiveFax() {
                String received = "received something";
                System.out.println(received);
                return received;
            }
        };
        fax2.receiveFax();
        fax2.sendFax("Hello World");
        System.out.println("---------------------");

        Comparator<Integer> c = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1>o2) {
                    return 1;
                }
                if(o1<o2) {
                    return -1;
                }
                return 0;
            }
        };
        System.out.println(c.compare(10,5));
        System.out.println("---------------------");

        FaxDevice fd = new FaxDevice() {
            private String someField = "test";

            public void sendFax(String message) {
                System.out.println("Sending message: " + message + " - " + someField);
            }
        };
        fd.sendFax("test");
        System.out.println("---------------------");

        Device d = new Device() {
            @Override
            public void doCopy() {
                System.out.println("Copying...");
            }
        };

        List<String> strings = new LinkedList<>();
        LinkedList<String> strings2 = new LinkedList<>();// если нужно перенести определнные функции линкед

        LengthCounter lc = new LengthCounter() {
            @Override
            public int count(String string) {
                return string.length();
            }
        };
        LengthCounter lc2 = s -> s.length();

        Comparator<String> c1 = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (Integer.valueOf(o1.length()).compareTo(Integer.valueOf(o2.length())));
            }
        };
        Comparator<String> c2 = (String o1,String o2) -> {
            return (Integer.valueOf(o1.length()).compareTo(Integer.valueOf(o2.length())));
        };
        Comparator<String> c3 = (o1, o2) -> Integer.valueOf(o1.length()).compareTo(Integer.valueOf(o2.length()));

        Predicate<Integer> p1 = i -> i > 0;
        System.out.println(p1.test(10));
        System.out.println("---------------------");
        Predicate<String> p2 = s -> s.length()>0;
        System.out.println(p2.test("west"));
        System.out.println(p2.test(""));
        System.out.println("---------------------");
        Predicate<String> p3 = s -> !s.isBlank();
        System.out.println(p3.test("west"));
        System.out.println(p3.test(""));
        System.out.println("---------------------");
        Predicate<String> p4 = s -> !s.isEmpty();
        System.out.println(p4.test("west"));
        System.out.println(p4.test(""));
        System.out.println("---------------------");

        Predicate<Person> personPredicate = person -> person.getAge() > 21;
        Person person = new Person("Ivan", 27);
        System.out.println(person.getName() + " is older then 21: " + personPredicate.test(person));
        System.out.println("---------------------");

        Function<Integer, Integer> f1 = t -> t*t;
        System.out.println(f1.apply(10));
        System.out.println("---------------------");

        Function<String, Integer> f2 = s -> s.length();
        //Function<String, Integer> f2 = String::length;
        System.out.println(f2.apply("abc"));
        System.out.println(f2.apply("abcde"));
        System.out.println("---------------------");

        Function<String, String> f3 = s -> s.toUpperCase();
        System.out.println(f3.apply("abc"));
        System.out.println(f3.apply("klmn"));
        System.out.println("---------------------");

        Consumer<String> consumer = s -> System.out.println(s);
        //Consumer<String> consumer = System.out::println;

        Supplier<String> supplier = () -> "Hello World";

        Function<String,String> toUpper = s -> s.toUpperCase();
        System.out.println(stringManipulator(toUpper, "hello world"));
        System.out.println(stringManipulator(s -> s.toUpperCase(), "hello world"));
        System.out.println(stringManipulator(String::toUpperCase, "hello world"));

    }

    public static String stringManipulator(Function<String, String> f, String s) {
        return "!" + f.apply(s) + "!";
    }

    public static String tranform(String text, Predicate<String> p, Function<String, String> f) {

        return null;
    }

}
