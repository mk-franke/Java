package strings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EndUpTest {

    @Test
    public void testEndUp_1() {
        EndUp e = new EndUp();
        String ne = e.endUp("learning");
        assertEquals(ne, "learnING");
    }

    @Test
    public void testEndUp_2() {
        EndUp e = new EndUp();
        String ne = e.endUp("sky");
        assertEquals(ne, "SKY");
    }

    @Test
    public void testEndUp_3() {
        EndUp e = new EndUp();
        String ne = e.endUp("ab");
        assertEquals(ne, "AB");
    }

}
