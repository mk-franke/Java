import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    Palindrome palindrome = new Palindrome();

    @Test
    public void testIsPalindrome_1() {
        assertTrue(palindrome.isPalindrome(10201));
    }

    @Test
    public void testIsPalindrome_2() {
        assertTrue(palindrome.isPalindrome(12388321));
    }

    @Test
    public void testIsPalindrome_3() {
        assertFalse(palindrome.isPalindrome(102011));
    }

}
