package com.company;

import java.util.List;

public class Order {

    private List<Item> items;
    private Person person;

    public Order(List<Item> items, Person person) {
        this.items = items;
        this.person = person;
    }

    public List<Item> getItems() {
        return items;
    }

    public Person getPerson() {
        return person;
    }

    @Override
    public String toString() {
        return "Order{" +
                "items=" + items +
                ", person=" + person +
                '}';
    }

    public double getSumOfOrder() {
        return items.stream()
                    .mapToDouble(Item::getPrice)
                    .sum();
    }

}
