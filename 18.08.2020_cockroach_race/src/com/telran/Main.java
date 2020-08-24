package com.telran;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        List<Score> score = new ArrayList<>();

        Cockroach[] cockroaches = new Cockroach[10];
        for (int i = 0; i < cockroaches.length; i++) {
            Cockroach cockroach = new Cockroach(String.valueOf(i), 10, score);
            cockroaches[i] = cockroach;
        }

        for (Cockroach cockroach : cockroaches) {
            cockroach.start();
        }

        for (Cockroach cockroach : cockroaches) {
            cockroach.join();
        }

        int i = 0;
        for (Score s : score) {
            String res = String.format("%d, the cockroach %s ran %d milliseconds", ++i, s.getName(), s.getResult());
            System.out.println(res);
        }

    }

}
