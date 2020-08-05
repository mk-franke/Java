package list.task7;

import java.util.LinkedList;
import java.util.List;

public class ListWithoutHigherThenNumber {

    public static List<Integer> removeHigherThenNumber(List<Integer> numbers, int number) {
    List<Integer> newList = new LinkedList<>(numbers);
        for (int i = 0; i < newList.size(); i++) {
            if (newList.get(i) > number) {
                newList.remove(i);
                i--;
            }
        }
        return newList;
    }

}
