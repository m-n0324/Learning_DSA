package Tree;

/**
 * Given the root of a binary tree and an integer
 * targetSum, return true if the tree has a
 * root-to-leaf path such that adding up all
 * the values along the path equals targetSum.
 *
 * A leaf is a node with no children.
 *
 * Example 1:
 * 1
 * 2 3
 *
 * Input: root = [1,2,3], targetSum = 5
 * Output: false
 * Explanation: There two root-to-leaf paths in the tree:
 * (1 --> 2): The sum is 3.
 * (1 --> 3): The sum is 4.
 * There is no root-to-leaf path with sum = 5.
 *
 * Input: root = [1,2,3], targetSum = 3
 * Output: true
 *
 * Example 2:
 * Input: root = [], targetSum = 0
 * Output: false
 * Explanation: Since the tree is empty, there
 * are no root-to-leaf paths.
 *
 *
 * Constraints:
 * The number of nodes in the tree is in the
 * range [0, 5000].
 * -1000 <= Node.val <= 1000
 * -1000 <= targetSum <= 1000
 */

public class PathSum {

    public boolean hasPathSum(TreeNode root, int targetSum) {
        // 1. If the node is null, there is no path
        if (root == null)
            return false;

        // 2. If it's a leaf node, check if the value matches the remaining sum
        if (isLeaf(root) && root.val == targetSum)
            return true;

        // 3. Recurse down with the updated target sum
        int newTargetSum = targetSum - root.val;
        return hasPathSum(root.left, newTargetSum) ||
                hasPathSum(root.right, newTargetSum);
    }

    private boolean isLeaf(TreeNode node) {
        return node.left == null && node.right == null;
    }

    public static void main(String[] args) {
        PathSum solver = new PathSum();

        // Create a test tree:
        //      5
        //     / \
        //    4   8
        //   /
        //  11
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);

        // Path 5 -> 4 -> 11 = 20
        System.out.println("Has Path Sum 20? " + solver.hasPathSum(root, 20)); // true
        System.out.println("Has Path Sum 5?  " + solver.hasPathSum(root, 5));  // false (5 is not a leaf)
    }
}