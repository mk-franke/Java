import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WordTransformerTest {

    @Test
    public void testWordTransform_3() {
        String input = "aaa bcDE eklm iii";
        String actual = WordTransformer.transform(input);
        String expected = "AAA bcDE eklm III";
        assertEquals("string length", expected.length(), actual.length());
        assertEquals(expected, actual);
    }

    @Test
    public void testWordTransform_5() {
        String input = "aaa bcDEF eklm iiiOP";
        String actual = WordTransformer.transform(input, new TransformRule5());
        String expected = "aaa bcdef eklm iiiop";
        assertEquals("string length", expected.length(), actual.length());
        assertEquals(expected, actual);
    }

}
