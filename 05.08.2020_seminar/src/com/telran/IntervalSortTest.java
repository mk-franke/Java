package com.telran;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IntervalSortTest {

    IntervalSort intervalSort = new IntervalSort();
    List<Integer> numbers = Arrays.asList(8, 0, 3, -3, 10, -5, -1);
    List<Integer> expected = Arrays.asList(-3, -5, -1, 8, 0, 3, 10);

    @Test
    public void testSpecialSort_1method() {
        assertEquals(expected, intervalSort.specialSort(numbers));
    }

    @Test
    public void testSpecialSort_2method() {
        assertEquals(expected, intervalSort.sort(numbers));
    }

}
