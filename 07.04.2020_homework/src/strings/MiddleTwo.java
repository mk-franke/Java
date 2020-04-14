package strings;

public class MiddleTwo {

    public String middleTwo(String str) {
        int len = str.length();
        int mid = len/2;
        String m = str.substring(mid-1, mid+1);
        return m;
    }

}
