package list.task1;

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

}
