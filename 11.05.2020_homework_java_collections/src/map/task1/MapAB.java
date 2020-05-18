package map.task1;

import java.util.HashMap;
import java.util.Map;

public class MapAB {

    public static Map<String, String> mapAB(Map<String, String> map) {
        Map<String, String> newMap = new HashMap<>();
        if (map.containsKey("a")) {
            newMap.put("a", map.get("a"));
        }
        if (map.containsKey("b")) {
            newMap.put("b", map.get("b"));
        }
        if (map.containsKey("a") && map.containsKey("b")) {
            newMap.put("ab", map.get("a") + map.get("b"));
        }
        return newMap;
    }

}
