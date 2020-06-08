package com.company;

import java.time.LocalDate;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {

//        Given an integer, return a power of integer: 5 -> 25
        Function<Integer, Integer> power2 = i -> i*i;
        System.out.println(power2.apply(5));
        System.out.println("-------------");

//        Given a string, return modulo 2 of string length: "abcde" -> 1
        Function<String, Integer> modulo2 = s -> s.length()%2;
        System.out.println(modulo2.apply("abcde"));
        System.out.println("-------------");

//        Given a string, return its in upper case: "ivan" -> "IVAN"
        Function<String, String> upper = s -> s.toUpperCase();
        System.out.println(upper.apply("ivan"));
        System.out.println("-------------");

//        Given 2 strings, return a sum of their lengths: "abc", "de" -> 5
        BiFunction<String, String, Integer> sumLength = (s1, s2) -> s1.length() + s2.length();
        System.out.println(sumLength.apply("abc", "de"));
        System.out.println("-------------");

//        Given 2 strings, print a sum of their lengths.
        BiConsumer<String, String> printSumLength = (s1, s2) -> System.out.println(s1.length() + s2.length());
        printSumLength.accept("abc", "de");
        System.out.println("-------------");

//        Return a date of one week prior to today: "2020-05-30"
        Supplier<LocalDate> oneWeekPrior = () -> LocalDate.now().minusWeeks(1);
        System.out.println(oneWeekPrior.get());
        System.out.println("-------------");

//        Given a string, return a string, which consists of a first half of its character, if length is even, returns an empty string otherwise: "abcde" -> "ab", "abcde" -> "".
        Function<String, String> halfOrEmpty = s -> s.length()%2==0 ? s.substring(0, s.length()/2) : "";
        System.out.println(halfOrEmpty.apply("abcdef"));
        System.out.println(halfOrEmpty.apply("abcde"));
        System.out.println("-------------");

//        Return a random number
        Supplier<Double> random = () -> Math.random();
        System.out.println(random.get());
        System.out.println("-------------");

//        Given a string, return a reversed string: "abc" ->"cba"
        Function<String, String> reversedString = s -> new StringBuilder(s).reverse().toString();
        System.out.println(reversedString.apply("abc"));
        System.out.println("-------------");

 //       Given a number, return a reversed number: 12345 -> 54321
        Function<Integer, Integer> reversedNumber = i -> Integer.valueOf(new StringBuilder(i.toString()).reverse().toString());
        System.out.println(reversedNumber.apply(12345));
        System.out.println("-------------");

//        Given a number, return true if it is even, false otherwise: 6 -> true, 25 -> false
        Predicate<Integer> checkEven = i -> i%2==0;
        System.out.println(checkEven.test(6));
        System.out.println(checkEven.test(25));
        System.out.println("-------------");

//        Given a string, return true, if its length is more than 3, false otherwise: "ab" -> false, "abc" -> true
        Predicate<String> moreThen3 = s -> s.length()>=3;
        System.out.println(moreThen3.test("ab"));
        System.out.println(moreThen3.test("abc"));
        System.out.println("-------------");

//        Given a string and a number x. Return true, if length of string is more than x, false otherwise. Hint: BiPredicate.
        BiPredicate<String, Integer> moreThenX = (s, i) -> s.length()>i;
        System.out.println(moreThenX.test("abcd", 3));
        System.out.println(moreThenX.test("abcd", 5));
        System.out.println("-------------");

//        Print a given string
        Consumer<String> print = System.out::println;
        print.accept("abcdef");
        System.out.println("-------------");

//        Given a string, return a lower case string
        Function<String, String> lower = String::toLowerCase;
        System.out.println(lower.apply("ABCD"));
        System.out.println("-------------");

//        Given a number, return a square root from the number
        Function<Integer, Double> squareRoot = Math::sqrt;
        System.out.println(squareRoot.apply(25));
        System.out.println("-------------");

//        Implement solution 7 from above as a method reference
        System.out.println("-------------");

//        Given a class Employee with name and salary. Return an employee salary using 1. Supplier, 2. Function.
        Employee e1 = new Employee("Ivan", 3000);
        Supplier<Integer> supplierSalary = e1::getSalary;
        System.out.println(supplierSalary.get());
        Function<Employee, Integer> functionSalary = Employee::getSalary;
        System.out.println(functionSalary.apply(e1));
        System.out.println("-------------");

    }

}
