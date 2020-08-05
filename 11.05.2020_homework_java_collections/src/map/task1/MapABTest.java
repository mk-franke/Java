package map.task1;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class MapABTest {

    @Test
    public void testMapAB_1() {
        Map<String, String> map = new HashMap<>();
        map.put("a", "Hi");
        map.put("b", "There");
        Map<String, String> expected = new HashMap<>();
        expected.put("a", "Hi");
        expected.put("ab", "HiThere");
        expected.put("b", "There");
        Map<String, String> actual = MapAB.mapAB(map);
        assertEquals(expected, actual);
    }

    @Test
    public void testMapAB_2() {
        Map<String, String> map = new HashMap<>();
        map.put("a", "Hi");
        Map<String, String> expected = new HashMap<>();
        expected.put("a", "Hi");
        Map<String, String> actual = MapAB.mapAB(map);
        assertEquals(expected, actual);
    }

    @Test
    public void testMapAB_3() {
        Map<String, String> map = new HashMap<>();
        map.put("b", "There");
        Map<String, String> expected = new HashMap<>();
        expected.put("b", "There");
        Map<String, String> actual = MapAB.mapAB(map);
        assertEquals(expected, actual);
    }

}
