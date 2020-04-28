import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CustomLinkedListTest {

    @Test
    public void testSizeZero() {
        CustomLinkedList cll = new CustomLinkedList();
        assertEquals(0, cll.size());
    }

    @Test
    public void testSizeNotZero() {
        int[] arr = {1, 2, 3};
        CustomLinkedList<Integer> cll = new CustomLinkedList<>();
        for(int a:arr) {
            cll.append(a);
        }
        assertEquals(3, cll.size());
    }

    @Test
    public void appendOneElement() {
        CustomLinkedList<String> cll = new CustomLinkedList<>();
        cll.append("test");
        assertEquals("size", 1, cll.size());
    }

    @Test
    public void testGetAll() {
        int[] arr = {1, 2, 3};
        CustomLinkedList<Integer> cll = new CustomLinkedList<>();
        for(int a:arr) {
            cll.append(a);
        }
        for(int i = 0; i < arr.length; i++) {
            assertEquals(arr[i], cll.get(i).intValue());
        }
    }

    @Test
    public void testRemoveById() {
        String[] input = {"aa", "bb", "cc", "dd"};
        CustomLinkedList<String> cll = new CustomLinkedList<>();
        for(String a:input) {
            cll.append(a);
        }
        String expectedDeletedItem = cll.removeById(2);
        String[] expected = {"aa", "bb", "dd"};
        for(int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], cll.get(i));
        }
        assertEquals(3, cll.size());
        assertEquals("cc", expectedDeletedItem);
    }

    @Test
    public void testRemoveByElement() {
        String[] input = {"aa", "bb", "cc", "dd"};
        CustomLinkedList<String> cll = new CustomLinkedList<>();
        for(String a:input) {
            cll.append(a);
        }
        boolean isRemoved = cll.remove("cc");
        String[] expected = {"aa", "bb", "dd"};
        for(int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], cll.get(i));
        }
        assertEquals(3, cll.size());
        assertTrue(isRemoved);
    }

}
