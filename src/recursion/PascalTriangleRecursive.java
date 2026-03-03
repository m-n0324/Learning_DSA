package recursion;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleRecursive {

    public List<List<Integer>> generate(int numRows) {
        // Handle 0 rows to prevent errors
        if (numRows <= 0) return new ArrayList<>();

        // Base Case: The first row is always [[1]]
        if (numRows == 1) {
            List<List<Integer>> result = new ArrayList<>();
            List<Integer> firstRow = new ArrayList<>();
            firstRow.add(1);
            result.add(firstRow);
            return result;
        }

        // Recursive Call: Get the triangle with (n-1) rows
        List<List<Integer>> previousRows = generate(numRows - 1);

        // Use the last row of the previous result to build the new row
        List<Integer> lastRow = previousRows.get(previousRows.size() - 1);
        List<Integer> newRow = new ArrayList<>();

        newRow.add(1); // Start with 1

        // Calculate middle elements
        for (int i = 1; i < numRows - 1; i++) {
            newRow.add(lastRow.get(i - 1) + lastRow.get(i));
        }

        newRow.add(1); // End with 1

        // Add the new row to the list and return
        previousRows.add(newRow);
        return previousRows;
    }

    public static void main(String[] args) {
        PascalTriangleRecursive solver = new PascalTriangleRecursive();
        System.out.println(solver.generate(5));
    }
}