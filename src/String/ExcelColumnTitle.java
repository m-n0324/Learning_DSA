package String;

public class ExcelColumnTitle {

    public String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();

        while (columnNumber > 0) {
            // Adjust to 0-indexed for modulo math
            columnNumber--;

            int rem = columnNumber % 26;
            char c = (char) ('A' + rem);
            result.append(c);

            columnNumber /= 26;
        }

        // Reverse because we built it from right to left
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        ExcelColumnTitle solver = new ExcelColumnTitle();

        System.out.println("1: " + solver.convertToTitle(1));      // A
        System.out.println("28: " + solver.convertToTitle(28));    // AB
        System.out.println("701: " + solver.convertToTitle(701));  // ZY
    }
}