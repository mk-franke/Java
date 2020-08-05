package map.task4;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class CountNameTest {

    @Test
    public void testCountName_1() {
        List<String> nameList = Arrays.asList("Ivan", "Maria", "Piotr", "Anna", "Maria", "Ivan", "Ivan");
        String name = "Ivan";
        Map<String, Integer> expected = new HashMap<>();
        expected.put("Ivan", 3);
        Map<String, Integer> actual = CountName.countName(nameList, name);
        assertEquals(expected, actual);
    }

    @Test
    public void testCountName_2() {
        List<String> nameList = Arrays.asList("Ivan", "Maria", "Piotr", "Anna", "Maria", "Ivan", "Ivan");
        String name = "Maria";
        Map<String, Integer> expected = new HashMap<>();
        expected.put("Maria", 2);
        Map<String, Integer> actual = CountName.countName(nameList, name);
        assertEquals(expected, actual);
    }

    @Test
    public void testCountName_3() {
        List<String> nameList = Arrays.asList("Ivan", "Maria", "Piotr", "Anna", "Maria", "Ivan", "Ivan");
        String name = "Anna";
        Map<String, Integer> expected = new HashMap<>();
        expected.put("Anna", 1);
        Map<String, Integer> actual = CountName.countName(nameList, name);
        assertEquals(expected, actual);
    }

}
