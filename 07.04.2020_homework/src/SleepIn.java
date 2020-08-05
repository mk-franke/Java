public class SleepIn {

    public boolean sleepIn(boolean weekday, boolean vacation) {
        boolean b = false;
        if (vacation == true || weekday == false) {
            b = true;
        } else if (weekday == true) {
            b = false;
        }
        return b;
    }

}
