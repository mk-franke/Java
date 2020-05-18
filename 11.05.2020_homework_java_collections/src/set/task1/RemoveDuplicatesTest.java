package set.task1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class RemoveDuplicatesTest {

    @Test
    public void testRemoveDuplicates(){
        List<String> nameList = new ArrayList<>();
        Collections.addAll(nameList, "Ivan", "Maria", "Piotr", "Anna", "Maria", "Ivan");
        List<String> expected = new ArrayList<>();
        Collections.addAll(expected, "Ivan", "Maria", "Piotr", "Anna");
        List<String> actual = RemoveDuplicates.removeDuplicates(nameList);
        assertEquals(expected, actual);
    }

}
