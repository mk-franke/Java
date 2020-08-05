package numbs;

public class IntMax {

    public int intMax(int a, int b, int c) {
        int max = ((a > b) && (a > c)) ? a : ((b > c) ? b : c);
        return max;
    }

}
