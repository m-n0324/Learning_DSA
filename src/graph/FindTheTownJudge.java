package graph;

public class FindTheTownJudge {

    public int findJudge(int n, int[][] trust) {
        // We use n + 1 because the people are labeled 1 to n
        int[] count = new int[n + 1];

        for (int[] relation : trust) {
            // Person A trusts Person B
            count[relation[0]]--; // Outdegree: A loses a point for trusting
            count[relation[1]]++; // Indegree: B gains a point for being trusted
        }

        for (int i = 1; i <= n; i++) {
            // The judge must have a score of n - 1
            if (count[i] == n - 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        FindTheTownJudge solver = new FindTheTownJudge();

        // Example 2: n = 3, trust = [[1,3],[2,3]]
        int[][] trust1 = {{1, 3}, {2, 3}};
        System.out.println("Judge is: " + solver.findJudge(3, trust1)); // Output: 3

        // Example 3: n = 3, trust = [[1,3],[2,3],[3,1]]
        int[][] trust2 = {{1, 3}, {2, 3}, {3, 1}};
        System.out.println("Judge is: " + solver.findJudge(3, trust2)); // Output: -1
    }
}