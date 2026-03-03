package dynamicProgramming;


import java.util.ArrayList;
import java.util.List;

public class PascalTriangleIterative {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        // Quick check for edge case
        if (numRows <= 0) return result;

        // Step 1: Initialize the first row [1]
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);

        // Step 2: Build rows 2 through numRows
        for (int i = 1; i < numRows; i++) {
            List<Integer> newRow = new ArrayList<>();
            newRow.add(1); // Left boundary

            // Step 3: Use the previous row to fill middle values
            List<Integer> previousRow = result.get(i - 1);
            for (int j = 1; j < i; j++) {
                int sum = previousRow.get(j - 1) + previousRow.get(j);
                newRow.add(sum);
            }

            newRow.add(1); // Right boundary
            result.add(newRow);
        }

        return result;
    }

    public static void main(String[] args) {
        PascalTriangleIterative solver = new PascalTriangleIterative();
        List<List<Integer>> triangle = solver.generate(6);

        // Print the output line by line
        for (List<Integer> row : triangle) {
            System.out.println(row);
        }
    }
}