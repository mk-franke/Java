import java.util.*;

public class Main {

    public static void main(String[] args) {

        String str = "Hello";
        System.out.println(str);

        System.out.println(inverse(str));
        System.out.println(inverse2(str));

        System.out.println(changeCase(str));

        List<Integer> numbers = Arrays.asList(-8, 1, -5, 1, 2, 7, 2, 1);
        System.out.println(numbers);
        System.out.println(getDuplicates(numbers));

    }

    public static String inverse(String s) {
        StringBuilder newStr = new StringBuilder(s);
        return newStr.reverse().toString();
    }

    public static String inverse2(String s) {
        StringBuilder newStr = new StringBuilder();
        for (int i = s.length()-1; i >= 0; i--) {
            newStr.append(s.charAt(i));
        }
        return newStr.toString();
    }

    public static String changeCase(String s) {
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (Character.isUpperCase(arr[i])) {
                arr[i] = Character.toLowerCase(arr[i]);
            } else if (Character.isLowerCase(arr[i])) {
                arr[i] = Character.toUpperCase(arr[i]);
            }
        }
        return new String(arr);
    }

    public static List<Integer> getDuplicates(List<Integer> numbers) {
        Set<Integer> withoutDuplicates = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        for (Integer n:numbers) {
            if (!withoutDuplicates.add(n)) {
                duplicates.add(n);
            }
        }
        return new ArrayList<>(duplicates);
    }

}
