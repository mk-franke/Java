package com.telran;

import java.util.LinkedList;
import java.util.List;

public class TwoDivisors {

    public boolean isDivisor(List<Integer> nums, int N) {
        LinkedList<Integer> buffer = new LinkedList<>(nums);
        while (buffer.size() >= 2) {
            int multiple = buffer.getFirst() * buffer.getLast();
            if (multiple < N) {
                buffer.removeFirst();
            } else if (multiple > N) {
                buffer.removeLast();
            } else {
                return true;
            }
        }
        return false;
    }

    public boolean isDivided(List<Integer> list, int num) {
        int[] arr = list.stream().mapToInt(Integer::intValue).toArray();
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] * arr[j] == num) {
                    return true;
                }
            }
        }
        return false;
    }

}
