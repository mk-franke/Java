package set.task2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class GetDuplicatesTest {

    @Test
    public void testRemoveDuplicates() {
        List<String> nameList = new ArrayList<>();
        Collections.addAll(nameList, "Ivan", "Maria", "Piotr", "Anna", "Maria", "Ivan");
        List<String> expected = new ArrayList<>();
        Collections.addAll(expected, "Maria", "Ivan");
        List<String> actual = GetDuplicates.getDuplicates(nameList);
        assertEquals(expected, actual);
    }

}
