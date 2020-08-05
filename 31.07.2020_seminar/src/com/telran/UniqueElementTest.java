package com.telran;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UniqueElementTest {

    UniqueElement unique = new UniqueElement();
    List<Integer> list1 = Arrays.asList(7);
    List<Integer> list2 = Arrays.asList(-5, 7, -5);
    List<Integer> list3 = Arrays.asList(5, 5, 5);
    List<Integer> list4 = Arrays.asList(5, 5, 5, 9, 9);
    List<Integer> list5 = Arrays.asList(2, 2, 1, 3, 4, 4, 3, 2, 2);

    @Test
    public void testGetUnique_oneNumber_returnSingleNumber() {
        assertEquals(7, unique.getUnique(list1));
    }

    @Test
    public void testGetUnique_singleNumberAndPairs_returnNumber() {
        assertEquals(7, unique.getUnique(list2));
    }

    @Test
    public void testGetUnique_threeSameNumbers_returnNumber() {
        assertEquals(5, unique.getUnique(list3));
    }

    @Test
    public void testGetUnique_5ThreeTimesAnd9Times_5() {
        assertEquals(5, unique.getUnique(list4));
    }

    @Test
    public void testGetUnique_1method() {
        assertEquals(1, unique.getUnique(list5));
    }

    @Test
    public void testGetUnique_2method() {
        assertEquals(1, unique.findUnique(list5));
    }

    @Test
    public void testGetUnique_3method() {
        assertEquals(1, unique.find(list5));
    }

}
