import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[] {6, 9, -2, 7, 2, 1, 5};
        int n = 10;

        int[] res = find(arr, n);
        System.out.println(Arrays.toString(res));

        int[] res1 = find2(arr, n);
        System.out.println(Arrays.toString(res1));

        int[] res2 = find3(arr, n);
        System.out.println(Arrays.toString(res2));
    }

    private static int[] find(int[] arr, int n) {
        int[] res = new int[2];
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == n) {
                    res[0] = arr[i];
                    res[1] = arr[j];
                    return res;
                }
            }
        }
        System.out.println("No such elements");
        return res;
    }

    private static int[] find2(int[] arr, int n) {
        int[] res = new int[2];
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(new Integer(n - arr[i]))) {
                res[0] = arr[i];
                res[1] = n - arr[i];

            } else {
                set.add(arr[i]);
            }
        }
       return res;
    }

    private static int[] find3(int[] arr, int n) {
        int[] res = new int[2];
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length-1;
        while (left<right) {
            int sum = arr[left] + arr[right];
            if (sum == n) {
                res[0] = arr[left];
                res[1] = arr[right];
                return res;
            } else {
                if (sum>n) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return res;
    }

}
