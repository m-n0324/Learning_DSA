package Tree;

import java.util.ArrayList;
import java.util.List;

public class PreorderTraversalRecursive {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        helper(root, result);
        return result;
    }

    private void helper(TreeNode root, List<Integer> result) {
        if (root == null) return;

        // 1. Visit Root
        result.add(root.val);
        // 2. Traverse Left
        helper(root.left, result);
        // 3. Traverse Right
        helper(root.right, result);
    }

    public static void main(String[] args) {
        PreorderTraversalRecursive solver = new PreorderTraversalRecursive();

        // Tree:
        //      1
        //     / \
        //    2   3
        //   / \
        //  4   5
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2, new TreeNode(4), new TreeNode(5));
        root.right = new TreeNode(3);

        List<Integer> result = solver.preorderTraversal(root);
        System.out.println("Recursive Preorder: " + result);
        // Output: [1, 2, 4, 5, 3]
    }
}