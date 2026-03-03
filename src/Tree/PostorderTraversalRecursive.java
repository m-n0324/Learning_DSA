package Tree;

import java.util.ArrayList;
import java.util.List;

public class PostorderTraversalRecursive {

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        helper(root, list);
        return list;
    }

    private void helper(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }

        // 1. Traverse Left
        helper(root.left, result);
        // 2. Traverse Right
        helper(root.right, result);
        // 3. Visit Root
        result.add(root.val);
    }

    public static void main(String[] args) {
        PostorderTraversalRecursive solver = new PostorderTraversalRecursive();

        // Constructing tree:
        //      1
        //     / \
        //    2   3
        //   / \
        //  4   5
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        List<Integer> result = solver.postorderTraversal(root);
        System.out.println("Recursive Postorder: " + result);
        // Expected Output: [4, 5, 2, 3, 1]
    }
}