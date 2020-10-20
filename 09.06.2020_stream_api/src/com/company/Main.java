package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Address a1 = new Address("Friedrichstraße", 56);
        Address a2 = new Address("Kurfürstendamm", 176);
        Address a3 = new Address("Landsberger Allee", 34);

        Person p1 = new Person("Ivan", 35, a1);
        Person p2 = new Person("Piotr", 23, a2);
        Person p3 = new Person("Alex", 16, a3);

        List<Person> listOfPersons = Arrays.asList(p1, p2, p3);

        System.out.println(getAddressForAgeOver17(listOfPersons));
        System.out.println("-------------------");

        List<String> listOfNames = Arrays.asList("Ivan", "Piotr", "Alex", "Ivan");
        List<Person> listOfPersons2 = Arrays.asList(p1, p2, p3, p1);

        System.out.println(Arrays.toString(listOfNames.toArray()));
        System.out.println(getNameListWithoutDuplicates(listOfNames));
        System.out.println(getNameListWithoutDuplicates2(listOfPersons2));
        System.out.println("-------------------");

        getMapOfPersonsByAge(listOfPersons).forEach((k, v) -> System.out.println(k + " " + v));
        System.out.println("-------------------");

        Person p11 = new Person("Ivan");
        Person p12 = new Person("Piotr");
        Person p13 = new Person("Alex");

        BankAccount ba1 = new BankAccount("DE89 3704 0044 0532 0130 00", p11);
        BankAccount ba2 = new BankAccount("GB29 NWBK 6016 1331 9268 19", p12);
        BankAccount ba3 = new BankAccount("CH93 0076 2011 6238 5295 7", p13);

        List<BankAccount> listOfBankAccounts = Arrays.asList(ba1, ba2, ba3);

        getMapOfBankAccountsByPerson(listOfBankAccounts).forEach((k, v) -> System.out.println(k + " " + v));
        System.out.println("-------------------");

        System.out.println(getBankNumberWithStars(listOfBankAccounts));
        System.out.println("-------------------");

        String text = "Once upon a midnight dreary, while I pondered, weak and weary,\n" +
                "Over many a quaint and curious volume of forgotten lore—\n" +
                "While I nodded, nearly napping, suddenly there came a tapping,\n" +
                "As of some one gently rapping, rapping at my chamber door.\n" +
                "“’Tis some visitor,” I muttered, “tapping at my chamber door —\n" +
                "            Only this and nothing more.”\n";

        System.out.println(getNumberOfWordsOfSpecifiedLetter(text, "w"));
        System.out.println("-------------------");

        String t = "432223";
        System.out.println(integerCheck(t));
        System.out.println("-------------------");

        BankAccount ba11 = new BankAccount("DE89 3704 0044 0532 0130 00");
        BankAccount ba12 = new BankAccount("GB29 NWBK 6016 1331 9268 19");
        BankAccount ba13 = new BankAccount("CH93 0076 2011 6238 5295 7");

        Person p21 = new Person("Ivan", Collections.singletonList(ba11));
        Person p22 = new Person("Piotr", Collections.singletonList(ba12));
        Person p23 = new Person("Alex", Collections.singletonList(ba13));

        List<Person> listOfPersons3 = Arrays.asList(p21, p22, p23);

        System.out.println(getBankNumberWithStarsForPersonList(listOfPersons3));
        System.out.println("-------------------");

        System.out.println(getSumOfAgeOver17(listOfPersons));
        System.out.println("-------------------");

        System.out.println(printPersonsForAgeOver17(listOfPersons));
        System.out.println("-------------------");

    }

    // Нужно написать функцию, которая по списку persons вернет список адресов тех людей, чей возраст больше 17 лет.

    public static List<Address> getAddressForAgeOver17(List<Person> list) {
        return list.stream()
                    .filter(person -> person.getAge() > 17)
                    .map(Person::getAddress)
                    .collect(Collectors.toList());
    }

    // Есть список имен, нужно написать функцию, которая вернет список имен без дупликатов.

    public static List<String> getNameListWithoutDuplicates(List<String> list) {
        return list.stream()
                    .distinct()
                    .collect(Collectors.toList());
    }

    public static List<String> getNameListWithoutDuplicates2(List<Person> list) {
        return list.stream()
                    .map(Person::getName)
                    .distinct()
                    .collect(Collectors.toList());
    }

    // Есть список людей, нужно написать функцию, которая вернет мапу, где ключом является возраст, а значением список людей этого возраста.

    public static Map<Integer, List<Person>> getMapOfPersonsByAge(List<Person> list) {
        return list.stream()
                    .collect(Collectors.groupingBy(Person::getAge));
    }

    // Нужно написать функцию, которая возвращает мапу, где значением является Person, а значением - список его банковских счетов.

    public static Map<Person, List<BankAccount>> getMapOfBankAccountsByPerson(List<BankAccount> list) {
        return list.stream()
                    .collect(Collectors.groupingBy(BankAccount::getOwner));
    }

    // Написать функцию, которая для списка счетов, возвращает список IBANNs, где в каждом IBANN символы после 3-го и до конца заменены звездочками.

    public static String replaceBankNumberWithStars(String number) {
        return number.substring(0, 3) + number.substring(3).replaceAll("\\w", "*");
    }

    public static List<String> getBankNumberWithStars(List<BankAccount> list) {
        return list.stream()
                    .map(BankAccount::getIBANN)
                    .map(Main::replaceBankNumberWithStars)
                    .collect(Collectors.toList());
    }

    // Написать функцию, которая принимает предложение, а возвращает количество слов, начинающихся на заданную букву.

    private static String[] textConverter(String text) {
        return text.toLowerCase()
                    .replaceAll("\\p{P}", " ")
                    .split("\\s+");
    }

    public static int getNumberOfWordsOfSpecifiedLetter(String text, String letter) {
        return (int) Arrays.stream(textConverter(text))
                            .filter(s -> s.startsWith(letter))
                            .count();
    }

    // Написать функцию, которая проверяет, является ли заданная строка целым числом. Подсказка - Character.isDigit() и Stream.allMatch().

    public static boolean integerCheck(String text) {
        return text.chars().allMatch(Character::isDigit);
    }

    // Написать функцию, которая по списку persons возвращает список их банковских счетов с звездочками с третьего символа. Подсказка - flatMap()

    public static List<String> getBankNumberWithStarsForPersonList(List<Person> list){
        return list.stream()
                    .flatMap(person -> person.getAccount().stream())
                    .map(BankAccount::getIBANN)
                    .map(Main::replaceBankNumberWithStars)
                    .collect(Collectors.toList());
    }

    // Для списка persons посчитать общий возраст тех, кому больше 17 лет. Подсказка - reduce()

    public static int getSumOfAgeOver17(List<Person> list) {
        return list.stream()
                    .filter(person -> person.getAge() > 17)
                    .map(Person::getAge)
                    .reduce(Integer::sum)
                    .orElse(0);
    }

    // Написать функцию, которая для списка persons напечатает для тех, кто старше 17 лет: In Germany <name1> and <name2> and ...<nameN> are of legal age. Подсказка - Collectors.joining();

    public static String printPersonsForAgeOver17(List<Person> list) {
        return list.stream()
                    .filter(person -> person.getAge() > 17)
                    .map(Person::getName)
                    .collect(Collectors.joining(" and ", "In Germany ", " are of legal age"));
    }

}
