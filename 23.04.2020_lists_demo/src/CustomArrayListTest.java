import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CustomArrayListTest {

    @Test
    public void testSizeZero() {
        CustomArrayList cal = new CustomArrayList();
        assertEquals(0, cal.size());
    }

    @Test
    public void testSizeNotZero() {
        int[] arr = {1, 2, 3};
        CustomArrayList<Integer> cal = new CustomArrayList<>();
        for(int a:arr) {
            cal.append(a);
        }
        assertEquals(3, cal.size());
    }

    @Test
    public void testGetAll() {
        int[] arr = {1, 2, 3};
        CustomArrayList<Integer> cal = new CustomArrayList<>();
        for(int a:arr) {
            cal.append(a);
        }
        for(int i = 0; i < arr.length; i++) {
            assertEquals(arr[i], cal.get(i).intValue());
        }
    }

    @Test
    public void testRemoveById() {
        String[] input = {"aa", "bb", "cc", "dd"};
        CustomArrayList<String> cal = new CustomArrayList<>();
        for(String a:input) {
            cal.append(a);
        }
        String expectedDeletedItem = cal.removeById(2);
        String[] expected = {"aa", "bb", "dd"};
        for(int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], cal.get(i));
        }
        assertEquals(3, cal.size());
        assertEquals("cc", expectedDeletedItem);
    }

    @Test
    public void testRemoveByElement() {
        String[] input = {"aa", "bb", "cc", "dd"};
        CustomArrayList<String> cal = new CustomArrayList<>();
        for(String a:input) {
            cal.append(a);
        }
        boolean isRemoved = cal.remove("cc");
        String[] expected = {"aa", "bb", "dd"};
        for(int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], cal.get(i));
        }
        assertEquals(3, cal.size());
        assertTrue(isRemoved);
    }

}