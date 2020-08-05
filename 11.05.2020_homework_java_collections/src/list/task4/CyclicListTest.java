package list.task4;

import org.junit.Test;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CyclicListTest {

    @Test
    public void testListCyclic_true() {
        List<String> list1 = new LinkedList<>();
        Collections.addAll(list1, "aa", "bb", "cc", "dd");
        List<String> list2 = new LinkedList<>();
        Collections.addAll(list2, "cc", "dd", "aa", "bb");
        boolean actual = CyclicList.isListCyclicаlOfAnother(list1, list2);
        assertTrue(actual);
    }

    @Test
    public void testListCyclic_false() {
        List<String> list1 = new LinkedList<>();
        Collections.addAll(list1, "dd", "ee", "ff");
        List<String> list2 = new LinkedList<>();
        Collections.addAll(list2, "dd", "ff", "ee");
        boolean actual = CyclicList.isListCyclicаlOfAnother(list1, list2);
        assertFalse(actual);
    }

}
