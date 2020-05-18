package map.task2;

import java.util.HashMap;
import java.util.Map;

public class WordMultiple {

    public static Map<String, Boolean> wordMultiple(String[] letters) {
        Map<String, Boolean> newMap = new HashMap<>();
        for (String l:letters) {
            newMap.computeIfPresent(l, (k, v) -> true);
            newMap.putIfAbsent(l, false);
        }
        return newMap;
    }

}
