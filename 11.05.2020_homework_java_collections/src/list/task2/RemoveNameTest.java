package list.task2;

import org.junit.Test;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class RemoveNameTest {

    @Test
    public void testRemoveName() {
        List<String> nameList = new LinkedList<>();
        Collections.addAll(nameList, "Ivan", "Maria", "Stephan", "John", "Amelia");

        List<String> expected = new LinkedList<>();
        Collections.addAll(expected, "Maria", "Stephan", "Amelia");

        List<String> actual = Name.removeNameWithLength4(nameList);
        assertEquals(expected, actual);
    }

}
