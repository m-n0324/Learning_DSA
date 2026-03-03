package linkedList;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        // Handle edge case for 0 rows
        if (numRows <= 0) return result;

        List<Integer> prev = new ArrayList<>();
        prev.add(1);
        result.add(prev);

        for (int i = 1; i < numRows; i++) {
            List<Integer> curr = new ArrayList<>();
            curr.add(1); // Left boundary

            // Calculate middle elements based on the previous row
            for (int j = 1; j < prev.size(); j++) {
                int val = prev.get(j) + prev.get(j - 1);
                curr.add(val);
            }

            curr.add(1); // Right boundary
            result.add(curr);
            prev = curr; // Move to the next row
        }
        return result;
    }

    public static void main(String[] args) {
        PascalTriangle solver = new PascalTriangle();
        int rows = 5;
        List<List<Integer>> triangle = solver.generate(rows);

        System.out.println("Pascal's Triangle for " + rows + " rows:");
        for (List<Integer> row : triangle) {
            System.out.println(row);
        }
    }
}