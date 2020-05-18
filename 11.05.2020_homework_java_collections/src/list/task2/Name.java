package list.task2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Name {

    public static List<String> removeNameWithLength4(List<String> namesList) {
        List<String> newNameList = new LinkedList<>(namesList);
        Iterator<String> iterator = newNameList.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            if (name.length() == 4) {
                iterator.remove();
            }
        }
        return newNameList;
    }

}
