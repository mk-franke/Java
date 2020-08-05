package list.task5;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ReversedList {

    public static List<Integer> reverseList(List<Integer> numbers) {
        List<Integer> revList = new LinkedList<>(numbers);
        Collections.reverse(revList);
        return revList;
    }

}
