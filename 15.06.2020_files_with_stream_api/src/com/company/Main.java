package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {

        String fileName = "people.csv";

        List<Person> listOfPersons = getListOfPersons(fileName);

        listOfPersons.forEach(System.out::println);
        System.out.println("---------------");
        System.out.println(getYoungestPerson(listOfPersons));
        System.out.println("---------------");
        System.out.println(getOldestPerson(listOfPersons));
        System.out.println("---------------");
        System.out.println(getPersonsByAge(listOfPersons, 40));

    }

    private static Person createPersonsFromString(String string) {
        String[] ArrayOfPersons = string.replaceAll("\\p{P}", " ").split("\\s+");
        return new Person(ArrayOfPersons[0], ArrayOfPersons[1], Integer.parseInt(ArrayOfPersons[2]));
    }

    public static List<Person> getListOfPersons(String fileName) throws IOException {
        Stream<String> stream = Files.lines(Paths.get(fileName));
        return stream.map(Main::createPersonsFromString).collect(Collectors.toList());
    }

    public static Person getYoungestPerson(List<Person> list) {
        return list.stream()
                .min(Comparator.comparing(Person::getAge))
                .orElseThrow();
    }

    public static Person getOldestPerson(List<Person> list) {
        return list.stream()
                .max(Comparator.comparing(Person::getAge))
                .orElseThrow();
    }

    public static List<Person> getPersonsByAge(List<Person> list, int age) {
        return list.stream()
                    .filter(person -> person.getAge() == age)
                    .collect(Collectors.toList());
    }

}
