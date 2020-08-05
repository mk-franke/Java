package list.task5;

import org.junit.Test;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ReversedListTest {

    @Test
    public void testReversedList() {
        List<Integer> originalList = new LinkedList<>();
        Collections.addAll(originalList, 1, 2, 3, 4, 5);

        List<Integer> expected = new LinkedList<>();
        Collections.addAll(expected, 5, 4, 3, 2, 1);

        List<Integer> actual = ReversedList.reverseList(originalList);
        assertEquals(expected, actual);
    }

}
