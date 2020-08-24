package de.telran;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        List<Result> resultList = new ArrayList<>();

        Thread mascha = new StandardEmployee(100, 200, "Mascha", 20, resultList);
        Thread petya = new StandardEmployee(100, 300, "Petya", 20, resultList);
        Thread vasya = new InspiredLazyEmployee(200, 300, "Vasya", 20, resultList, 100, 150, 30);

        mascha.start();
        petya.start();
        vasya.start();

        mascha.join();
        petya.join();
        vasya.join();

        for (Result result : resultList) {
            String toPrint = String.format("The employee %s completed the work in %d", result.getName(), result.getDuration());
            System.out.println(toPrint);
        }

    }

}
