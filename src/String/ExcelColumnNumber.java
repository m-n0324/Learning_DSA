package String;

public class ExcelColumnNumber {

    /**
     * Converts an Excel title to its corresponding number.
     * Logic: Positional notation in Base-26.
     */
    public int titleToNumber(String columnTitle) {
        int result = 0;
        int len = columnTitle.length();

        // Multi-variable for loop: i tracks the character index, pow tracks the exponent
        for (int i = len - 1, pow = 0; i >= 0; i--, pow++) {
            char c = columnTitle.charAt(i);
            int digit = c - 'A' + 1;

            // Adding (digit * 26^pow) to the total
            result += digit * Math.pow(26, pow);
        }
        return result;
    }

    public static void main(String[] args) {
        ExcelColumnNumber solver = new ExcelColumnNumber();

        // Testing different scenarios
        String test1 = "A";   // Expected: 1
        String test2 = "AB";  // Expected: 28
        String test3 = "ZY";  // Expected: 701

        System.out.println("Title: " + test1 + " -> Number: " + solver.titleToNumber(test1));
        System.out.println("Title: " + test2 + " -> Number: " + solver.titleToNumber(test2));
        System.out.println("Title: " + test3 + " -> Number: " + solver.titleToNumber(test3));
    }
}