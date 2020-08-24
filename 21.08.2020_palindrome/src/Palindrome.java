public class Palindrome {

    public boolean isPalindrome(int number) {
        String num = String.valueOf(number);
        return num.equals(new StringBuilder(num).reverse().toString());
    }

}
