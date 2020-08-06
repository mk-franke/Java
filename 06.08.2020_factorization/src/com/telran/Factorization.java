package com.telran;

import java.util.List;

public class Factorization {

    public int find(List<Integer> numbers) {
        int count = 0;
        for (Integer n : numbers) {
            int x = 1;
            do {
                if (x * (x + 1) == n) {
                    count++;
                }
                x++;
            } while (x < Math.sqrt(n));
        }
        return count;
    }

}
