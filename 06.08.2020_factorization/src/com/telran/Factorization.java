package com.telran;

import java.util.List;

public class Factorization {

    public int find(List<Integer> list) {
        int[] arr = list.stream().mapToInt(Integer::intValue).toArray();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int x = 1;
            do {
                if (x*(x+1) == arr[i]) {
                    count++;
                }
                x++;
            } while (x < Math.sqrt(arr[i]));
        }
        return count;
    }

}
