package list.task3;

import java.util.LinkedList;
import java.util.List;

public class YesOrNo {

    public static List<String> compareNumberByIndex(List<Integer> list1, List<Integer> list2) {
        List<String> yesNoList = new LinkedList<>();
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) == list2.get(i)) {
                yesNoList.add("Yes");
            } else {
                yesNoList.add("No");
            }
        }
        return yesNoList;
    }

}
