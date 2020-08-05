package com.telran;

import java.util.*;
import java.util.stream.Collectors;

public class UniqueElement {

    /**
     * The method accept a list which contains numbers with a pair except one
     * @param list integer numbers
     * @return number with no pair
     */

    public int getUnique(List<Integer> list) {
        Map<Integer, Integer> occurrenceByNumber = new HashMap<>();
        for (int n : list) {
            occurrenceByNumber.computeIfPresent(n, (key, value) -> value+1);
            occurrenceByNumber.putIfAbsent(n, 1);
        }
        for (int n : occurrenceByNumber.keySet()) {
            if (occurrenceByNumber.get(n)%2 == 1) {
                return n;
            }
        }
        return Integer.MIN_VALUE;
    }

    public int findUnique(List<Integer> list) {
        Map<Integer, Long> occurrenceByNumber = list.stream()
                                                    .collect(Collectors.groupingBy((n -> n), Collectors.counting()));
        return occurrenceByNumber.keySet().stream()
                                            .filter(key -> occurrenceByNumber.get(key)%2 == 1)
                                            .findFirst().orElseThrow();
    }

    public int find(List<Integer> list) {
        int res = 0;
        for (int n : list) {
            res  ^= n;
        }
        return res;
    }

}
