package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person("Ivan");
        Person p2 = new Person("Piotr");
        Person p3 = new Person("Vasya");

        Item i1 = new Item("table", 100);
        Item i2 = new Item("TV", 1200);
        Item i3 = new Item("microwave", 90);
        Item i4 = new Item("couch", 560);
        Item i5 = new Item("book", 30);

        List<Item> list1 = Arrays.asList(i1, i2, i3, i4, i5);
        List<Item> list2 = Arrays.asList(i1, i3, i4);
        List<Item> list3 = Arrays.asList(i2, i3, i5);

        Order listP1 = new Order(list1, p1);
        Order listP2 = new Order(list2, p2);
        Order listP3 = new Order(list3, p3);

        List<Order> orders = Arrays.asList(listP1, listP2, listP3);

        System.out.println(listP1.getSumOfOrder());

        System.out.println(getPersonsWhoPaidMore(orders, 1200));
        System.out.println(getItemsFromOrder(orders));
        System.out.println("------------------");

        System.out.println(getPersonsWhoPaidMore2(orders, o -> o.getSumOfOrder()>1200));
        System.out.println(getPersonsWhoPaidMore2(orders, o -> o.getItems().size()>2));

    }

    public static List<Person> getPersonsWhoPaidMore(List<Order> orders, double sum) {
        return orders.stream()
                    .filter(o -> o.getSumOfOrder()>sum)
                    .map(Order::getPerson)
                    .collect(Collectors.toList());
    }

    public static List<Item> getItemsFromOrder(List<Order> orders) {
        return orders.stream()
                    .flatMap(o -> o.getItems().stream())
                    .collect(Collectors.toList());
    }

    public static List<Person> getPersonsWhoPaidMore2(List<Order> orders, Predicate<Order> filter) {
        return orders.stream()
                .filter(filter)
                .map(Order::getPerson)
                .collect(Collectors.toList());
    }

}
