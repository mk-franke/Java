public class Person implements Comparable<Person> {

    String firstName;
    String lastName;
    int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        return this.firstName.compareTo(o.firstName);
    }

    @Override
    public String toString() {
        return "Person {" + firstName + " " + lastName +
                ", age = " + age +
                '}';
    }

}
