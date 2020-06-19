public class Demo {

    public static void main(String[] args) {

        DivisionResult result = div(5, 0);

        if (result.isSuccess) {
            System.out.println(result.result);
        } else {
            System.out.println("Result is unknown (probably division by zero)");
        }

        String input = "abcdef";
        try {
            String resultString = processString(input);
            System.out.println("The string is processed: " + resultString);
        } catch (StringIsTooShortException ex) {
            System.out.println("Short: " + ex.getMessage());
        } catch (StringIsTooLongException ex) {
            System.out.println("Long: " + ex.getMessage());
        }

        System.out.println("The program is finished");

    }

    public static class DivisionResult {
        boolean isSuccess = true;
        double result;

        public DivisionResult(boolean isSuccess, double result) {
            this.isSuccess = isSuccess;
            this.result = result;
        }
    }

    public static DivisionResult div(int a, int b) {
        if(b == 0) {
            return new DivisionResult(false, 0);
        }
        return new DivisionResult(true, a/b);
    }

    public static double div2(int a, int b) {
        return a/b;
    }

    public static String processString(String input) throws StringIsTooShortException, StringIsTooLongException {
        if (input.length() > 3) {
            throw new StringIsTooLongException("String is too long: " + input.length());
        } else if (input.length() < 3) {
            throw new StringIsTooShortException("String is too short: " + input.length());
        } else {
            return input.toUpperCase();
        }
    }

}
