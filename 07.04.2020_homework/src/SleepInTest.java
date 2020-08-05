import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SleepInTest {

    @Test
    public void testSleepIn_1() {
        SleepIn s = new SleepIn();
        boolean b = s.sleepIn(true, false);
        assertFalse(b);
    }

    @Test
    public void testSleepIn_2() {
        SleepIn s = new SleepIn();
        boolean b = s.sleepIn(false, false);
        assertTrue(b);
    }

    @Test
    public void testSleepIn_3() {
        SleepIn s = new SleepIn();
        boolean b = s.sleepIn(true, true);
        assertTrue(b);
    }

    @Test
    public void testSleepIn_4() {
        SleepIn s = new SleepIn();
        boolean b = s.sleepIn(false, true);
        assertTrue(b);
    }

}
