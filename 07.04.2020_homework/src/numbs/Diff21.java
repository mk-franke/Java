package numbs;

public class Diff21 {

    public int diff21(int n) {
        if (n<=21) {
            return 21-n;
        } else {
            return Math.abs((n-21)*2);
        }
    }

}
