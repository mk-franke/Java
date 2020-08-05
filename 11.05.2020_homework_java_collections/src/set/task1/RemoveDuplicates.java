package set.task1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

    public static List<String> removeDuplicates(List<String> input) {
        Set<String> set = new HashSet<>(input);
        return new ArrayList<>(set);
    }

}
