package list.task3;

import org.junit.Test;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class YesOrNoTest {

    @Test
    public void testYesOrNo() {
        List<Integer> list1 = new LinkedList<>();
        Collections.addAll(list1, 1, 2, 3, 4);
        List<Integer> list2 = new LinkedList<>();
        Collections.addAll(list2, 5, 2, 3, 8);

        List<String> expectedList = new LinkedList<>();
        Collections.addAll(expectedList, "No", "Yes", "Yes", "No");

        List<String> actualList = YesOrNo.compareNumberByIndex(list1, list2);
        assertEquals(expectedList, actualList);
    }

}
