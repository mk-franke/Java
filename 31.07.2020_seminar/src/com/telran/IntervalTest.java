package com.telran;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IntervalTest {

    Interval interval = new Interval();
    List<Double> list = Arrays.asList(0.1, 0.3, 0.35, 0.4, 0.5, 0.57, 0.7);
    List<Integer> list2 = Arrays.asList(-10, -8,-7, -5, -4, -3, -1, 0, 1, 2, 4, 5, 8, 9, 10);

    @Test
    public void testPointsOnInterval_noPoints_zero() {
        List<Double> numbers = Collections.emptyList();
        assertEquals(0, interval.findPointsOnInterval(numbers, 0.1));
    }

    @Test
    public void testPointsOnInterval_onePoints_zero() {
        List<Double> numbers = Collections.singletonList(3.14);
        assertEquals(1, interval.findPointsOnInterval(numbers, 0.1));
    }

    @Test
    public void testFindInterval_severalPoints_four() {
        assertEquals(4, interval.findPointsOnInterval(list, 0.2));
    }

    @Test
    public void testFindInterval_severalPoints_seven() {
        assertEquals(7, interval.findPointsOnInterval2(list2, 7));
    }

}
