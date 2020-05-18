package map.task5;

import java.util.*;

public class MostCommonWord {

    static List<String> prepositions = Arrays.asList("в", "без", "до", "из", "к", "на", "по", "о", "от", "перед", "при", "через", "с", "у", "за", "над", "об", "под", "про", "для", "и");
    //добавил союз "и" в список предлогов, так как чаще всего именно этот союз чаще всего встречается в текстах

    public static Map<String, Integer> mostCommonWordCount(String text) {
        Map<String, Integer> newMap = new HashMap<>();
        List<String> textAsList = new ArrayList<>(Arrays.asList(text.split("\\s*(\\s|,|!|\\.)\\s*")));
        for (String s:textAsList) {
            if (!prepositions.contains(s.toLowerCase())) {
                if (newMap.containsKey(s)) {
                    newMap.put(s, newMap.get(s) + 1);
                } else {
                    newMap.put(s, 1);
                }
            }
        }
        Map.Entry mostCommonWord = Collections.max(newMap.entrySet(), Comparator.comparingInt(Map.Entry::getValue));
        newMap.clear();
        newMap.put((String) mostCommonWord.getKey(), (Integer) mostCommonWord.getValue());
        return newMap;
    }

}
