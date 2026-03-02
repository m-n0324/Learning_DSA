package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InorderTraversalIterative {

    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> result = new ArrayList<>();
        TreeNode curr = root;

        while (curr != null || !stack.isEmpty()) {
            // Reach the left most Node of the curr Node
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }

            // Current must be null at this point
            curr = stack.pop();
            result.add(curr.val); // Add the node value

            // We have visited the node and its left subtree.
            // Now, it's right subtree's turn
            curr = curr.right;
        }
        return result;
    }

    public static void main(String[] args) {
        InorderTraversalIterative solver = new InorderTraversalIterative();

        // Creating a test tree:
        //      1
        //       \
        //        2
        //       /
        //      3
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        List<Integer> result = solver.inorderTraversal(root);
        System.out.println("Inorder Traversal: " + result); // Output: [1, 3, 2]
    }
}