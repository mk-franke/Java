package com.telran;

import java.util.*;

public class Interval {

    /**
     * The method counts the max numbers of points covered by a segment of the length l
     * @param list of sorted numbers
     * @param l positive double number
     * @return max covered points
     */

    public int findPointsOnInterval(List<Double> list, double l) {
        Deque<Double> interval = new ArrayDeque<>();
        int res = 0;
        for (double n : list) {
            double beginning = n - l;
            interval.addLast(n);
            while (interval.getFirst() < beginning) {
                interval.removeFirst();
            }
            if (res < interval.size()) {
                res = interval.size();
            }
        }
        return res;
    }

    public int findPointsOnInterval2(List<Integer> list, double l) {
        Deque<Double> interval = new ArrayDeque<>();
        int res = 0;
        for (double n : list) {
            double beginning = n - l;
            interval.addLast(n);
            while (interval.getFirst() < beginning) {
                interval.removeFirst();
            }
            if (res < interval.size()) {
                res = interval.size();
            }
        }
        return res;
    }

}
