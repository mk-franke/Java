package map.task2;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class WordMultipleTest {

    @Test
    public void testWordMultiple_1() {
        String[] letters = {"a", "b", "a", "c", "b"};
        Map<String, Boolean> expected = new HashMap<>();
        expected.put("a", true);
        expected.put("b", true);
        expected.put("c", false);
        Map<String, Boolean> actual = WordMultiple.wordMultiple(letters);
        assertEquals(expected, actual);
    }

    @Test
    public void testWordMultiple_2() {
        String[] letters = {"c", "b", "a"};
        Map<String, Boolean> expected = new HashMap<>();
        expected.put("c", false);
        expected.put("b", false);
        expected.put("a", false);
        Map<String, Boolean> actual = WordMultiple.wordMultiple(letters);
        assertEquals(expected, actual);
    }

    @Test
    public void testWordMultiple_3() {
        String[] letters = {"c", "c", "c", "c"};
        Map<String, Boolean> expected = new HashMap<>();
        expected.put("c", true);
        Map<String, Boolean> actual = WordMultiple.wordMultiple(letters);
        assertEquals(expected, actual);
    }

}
