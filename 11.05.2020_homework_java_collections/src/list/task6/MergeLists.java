package list.task6;

import java.util.LinkedList;
import java.util.List;

public class MergeLists {

    public static <E> List<E> mergeTwoLists(List<E> list1, List<E> list2) {
        List<E> mergedList = new LinkedList<>(list1);
        mergedList.addAll(list2);
        return mergedList;
    }

}
