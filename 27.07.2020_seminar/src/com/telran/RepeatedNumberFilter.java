package com.telran;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RepeatedNumberFilter {

    public List<Integer> removeRepeated(List<Integer> numbers) {
        Set<Integer> result = new HashSet<>();
        Set<Integer> occurred = new HashSet<>();
        for (Integer n:numbers) {
            if (occurred.contains(n)) {
                result.add(n);
            } else {
                occurred.add(n);
            }
        }
        return new ArrayList<>(result);
    }

}
