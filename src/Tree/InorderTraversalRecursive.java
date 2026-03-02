package Tree;

import java.util.ArrayList;
import java.util.List;


public class InorderTraversalRecursive {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        helper(root, result);
        return result;
    }

    private void helper(TreeNode root, List<Integer> result) {
        if (root == null) return;

        // 1. Traverse Left
        helper(root.left, result);

        // 2. Visit Root
        result.add(root.val);

        // 3. Traverse Right
        helper(root.right, result);
    }

    public static void main(String[] args) {
        InorderTraversalRecursive solver = new InorderTraversalRecursive();

        // Creating a test tree:
        //      4
        //     / \
        //    2   6
        //   / \
        //  1   3
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        List<Integer> result = solver.inorderTraversal(root);
        System.out.println("Inorder (Recursive): " + result);
        // Expected Output: [1, 2, 3, 4, 6]
    }
}