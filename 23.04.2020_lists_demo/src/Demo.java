import java.util.*;

public class Demo {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        for (String s:list) {
            System.out.println(s);
        }
        System.out.println(list);

        Iterator<String> iterator = getIterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        List<String> list2 = getList();

        List<String> list3 = new ArrayList<>();
        Collections.addAll(list3, "Hello", "World", "one", "two", "three");
        Collections.sort(list3);
        System.out.println(list3);

        List<String> strings = Arrays.asList("Hello", "World", "one", "two", "three");
        System.out.println(strings);

    }

    public static Iterator<String> getIterator() {
        List<String> list = new ArrayList<>();
//        List<String> list = new LinkedList<>();
//        Set<String> list = new TreeSet<>();
        list.add("Hello");
        list.add("World");
        return list.iterator();
    }

    public static List<String> getList() {
        ArrayList<String> list = new ArrayList<>();
//        LinkedList<String> list = new LinkedList<>();
        list.add("Hello");
        list.add("World");
        return list;
    }

}