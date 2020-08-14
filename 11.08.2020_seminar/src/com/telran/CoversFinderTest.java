package com.telran;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CoversFinderTest {

    CoversFinder cover = new CoversFinder();

    Segment s1 = new Segment(2,5);
    Segment s2 = new Segment(1,4);
    Segment s3 = new Segment(3,10);
    Segment s4 = new Segment(5,7);
    Segment s5 = new Segment(3,8);
    Segment s6 = new Segment(6,9);

    List<Segment> segments = Arrays.asList(s1, s2, s3, s4, s5, s6);

    @Test
    public void testGetNumCovers() {
        assertEquals(Arrays.asList(2, 4, 4, 3), cover.getNumCovers(Arrays.asList(2, 4, 6, 8), segments));
    }

    @Test
    public void testFind() {
        assertEquals(Arrays.asList(2, 4, 4, 3), cover.find(Arrays.asList(2, 4, 6, 8), segments));
    }

}
