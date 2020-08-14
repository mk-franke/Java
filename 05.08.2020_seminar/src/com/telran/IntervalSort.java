package com.telran;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntervalSort {

    /**
     * The method should give back a sorted interval, where all numbers below 0 move left, numbers above move right, with keeping the original order.
     * @param list of numbers
     * @return special sorted list of numbers
     */

    public List<Integer> specialSort(List<Integer> list) {
        int[] arr = list.stream().mapToInt(Integer::intValue).toArray();
        int j, temp;
        for (int i = 1; i < arr.length; i++) {
            temp = arr[i];
            if (temp >= 0) {
                continue;
            }
            j = i - 1;
            while (j >= 0 && arr[j] >= 0) {
                arr[j+1] = arr[j];
                j = j - 1;
            }
            arr[j+1] = temp;
        }
        return Arrays.stream(arr).boxed().collect(Collectors.toList());
    }

    public List<Integer> sort(List<Integer> list) {
        List<Integer> negatives = list.stream()
                .filter(number -> number<0)
                .collect(Collectors.toList());
        List<Integer> positives = list.stream()
                .filter(number -> number>=0)
                .collect(Collectors.toList());
        negatives.addAll(positives);
        return negatives;
    }

}
