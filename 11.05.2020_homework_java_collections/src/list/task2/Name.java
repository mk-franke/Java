package list.task2;

import java.util.LinkedList;
import java.util.List;

public class Name {

    public static List<String> removeNameWithLength4(List<String> namesList) {
        List<String> newNameList = new LinkedList<>(namesList);
        for (int i = 0; i < newNameList.size(); i++) {
            if (newNameList.get(i).length() == 4) {
                newNameList.remove(i);
                i--;
            }
        }
        return newNameList;
    }

}
