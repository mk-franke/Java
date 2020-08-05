package com.telran;

import java.util.HashMap;
import java.util.Map;

public class Lovely {

    public boolean isLovely(long number) {
        Map<Integer, Integer> map = new HashMap<>();
        int remainder = 0;
        while (number > 0) {
            remainder = (int) (number%10);
            map.computeIfPresent(remainder, (key, value) -> value+1);
            map.putIfAbsent(remainder, 1);
            number = number/10;
        }
        for (int n : map.keySet()) {
            if (map.get(n) > 2) {
                return false;
            }
        }
        return true;
    }

}
