package recursion;


import java.util.ArrayList;
import java.util.List;

public class PascalTriangleModular {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            // We pass the previous row to the generator to avoid re-calculating the whole tree
            List<Integer> prevRow = (i == 0) ? null : result.get(i - 1);
            result.add(generateRow(i + 1, prevRow));
        }
        return result;
    }

    private List<Integer> generateRow(int rowNumber, List<Integer> prevRow) {
        List<Integer> currRow = new ArrayList<>();
        currRow.add(1); // Start

        if (rowNumber > 1) {
            // Fill middle using the prevRow we passed in
            for (int i = 1; i < rowNumber - 1; i++) {
                currRow.add(prevRow.get(i - 1) + prevRow.get(i));
            }
            currRow.add(1); // End
        }

        return currRow;
    }

    public static void main(String[] args) {
        PascalTriangleModular solver = new PascalTriangleModular();
        System.out.println(solver.generate(5));
    }
}