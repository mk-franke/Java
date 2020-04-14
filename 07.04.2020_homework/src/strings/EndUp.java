package strings;

public class EndUp {

    public String endUp(String str) {
        int l = str.length();
        String n = "";
        if (l >= 3) {
            n = str.substring(0, l-3) + str.substring(l-3, l).toUpperCase();
        } else {
            n = str.toUpperCase();
        }
        return n;
    }

}
