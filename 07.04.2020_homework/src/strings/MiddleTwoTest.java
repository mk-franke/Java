package strings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MiddleTwoTest {

    @Test
    public void testMiddleTwo() {
        MiddleTwo m = new MiddleTwo();
        String nm = m.middleTwo("gaming");
        assertEquals(nm, "mi");
    }

}
