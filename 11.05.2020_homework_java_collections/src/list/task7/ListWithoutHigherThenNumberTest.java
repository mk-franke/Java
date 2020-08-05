package list.task7;

import org.junit.Test;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ListWithoutHigherThenNumberTest {

    @Test
    public void testListWithoutHigherThenNumber() {
        List<Integer> numbersList = new LinkedList<>();
        Collections.addAll(numbersList, 1, 2, 3, 4, 5, 6);
        int number = 4;

        List<Integer> expected = new LinkedList<>();
        Collections.addAll(expected, 1, 2, 3, 4);

        List<Integer> actual = ListWithoutHigherThenNumber.removeHigherThenNumber(numbersList, number);
        assertEquals(expected, actual);
    }

}
