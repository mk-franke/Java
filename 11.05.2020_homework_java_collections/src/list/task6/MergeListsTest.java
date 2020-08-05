package list.task6;

import org.junit.Test;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class MergeListsTest {

    @Test
    public void testMergeLists() {
        List<Integer> list1 = new LinkedList<>();
        Collections.addAll(list1, 1, 2, 3, 4);
        List<Integer> list2 = new LinkedList<>();
        Collections.addAll(list2, 5, 6, 7, 8);

        List<Integer> expected = new LinkedList<>();
        Collections.addAll(expected, 1, 2, 3, 4, 5, 6, 7, 8);

        List<Integer> actual = MergeLists.mergeTwoLists(list1, list2);

        assertEquals(expected, actual);
    }

}
