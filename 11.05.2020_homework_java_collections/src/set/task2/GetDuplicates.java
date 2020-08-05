package set.task2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GetDuplicates {

    public static List<String> getDuplicates(List<String> input) {
        Set<String> listWithoutDuplicates = new HashSet<>();
        List<String> listOfDuplicates = new ArrayList<>();
        for (String i:input) {
            if (!listWithoutDuplicates.add(i)) {
                listOfDuplicates.add(i);
            }
        }
        return listOfDuplicates;
    }

}
