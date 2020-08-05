package map.task4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountName {

    public static Map<String, Integer> countName(List<String> nameList, String name) {
        Map<String, Integer> newMap = new HashMap<>();
        for (String n:nameList) {
            if (name.equals(n)) {
                if (newMap.containsKey(n)) {
                    newMap.put(n, newMap.get(n) + 1);
                } else {
                    newMap.put(n, 1);
                }
            }
        }
        return newMap;
    }

}
