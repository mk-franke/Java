package com.telran;

import java.util.List;

public class Factorization {

    /**
     * The method counts all numbers inside the interval from a to b which can be composed as a multiplication x(x+1)
     * @param two numbers, start and end of the interval
     * @return counts
     */

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

    public int find2(int a, int b) {
        int res = 0;
        for (int i = (int) Math.sqrt(a); i <= (int) Math.sqrt(b); i++) {
            if (i*(i+1) >= a && i*(i+1) <= b) {
                res++;
            }
        }
        return res;
    }

}
