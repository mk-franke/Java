package com.company;

import java.util.List;

public class Person {

    private String name;
    private int age;
    private Address address;
    private List<BankAccount> account;

    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Person(String name, List<BankAccount> account) {
        this.name = name;
        this.account = account;
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    public List<BankAccount> getAccount() {
        return account;
    }

    @Override
    public String toString() {
        return "Person{" + name + ", " + age +
                ", " + address +
                '}';
    }

}
