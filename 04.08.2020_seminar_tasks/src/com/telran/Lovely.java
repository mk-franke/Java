package com.telran;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

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

    public boolean isLovely2(long number) {
        Map<Character, Integer> occurrenceByDigit = new HashMap<>();
        char[] digits = String.valueOf(number).toCharArray();
        for (char d : digits) {
            occurrenceByDigit.computeIfPresent(d, (key, oldValue) -> oldValue+1);
            occurrenceByDigit.putIfAbsent(d, 1);
            if (occurrenceByDigit.get(d) > 2) {
                return false;
            }
        }
        return true;
    }

    public boolean isLovely3(long number) {
        return String.valueOf(number).chars()
                                    .boxed()
                                    .collect(Collectors.groupingBy(digit -> digit, Collectors.counting()))
                                    .values()
                                    .stream()
                                    .allMatch(occurrence -> occurrence <= 2);
    }

}
