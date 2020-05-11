package list.task4;

import java.util.Collections;
import java.util.List;

public class CyclicList {

    public static boolean isListCyclicаlOfAnother(List<String> list1, List<String> list2) {
        if (list1.size() == list2.size()) {
            for (int i = 0; i < list1.size(); i++) {
                Collections.rotate(list1, 1);
                if (list1.equals(list2)) {
                    return true;
                }
            }
        }
        return false;
    }

}
