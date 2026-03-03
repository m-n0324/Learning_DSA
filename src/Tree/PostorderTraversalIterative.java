package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostorderTraversalIterative {

    public List<Integer> iterativePostorder(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();
        s1.push(root);

        // Process nodes from s1 and move to s2
        while (!s1.isEmpty()) {
            TreeNode temp = s1.pop();
            s2.push(temp);

            // Push left then right so that right is popped first from s1
            if (temp.left != null) {
                s1.push(temp.left);
            }
            if (temp.right != null) {
                s1.push(temp.right);
            }
        }

        // Pop from s2 to get the final Postorder: Left -> Right -> Root
        while (!s2.isEmpty()) {
            result.add(s2.pop().val);
        }

        return result;
    }

    public static void main(String[] args) {
        PostorderTraversalIterative solver = new PostorderTraversalIterative();

        // Sample Tree:
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

        List<Integer> result = solver.iterativePostorder(root);
        System.out.println("Postorder Traversal: " + result);
        // Expected: [4, 5, 2, 3, 1]
    }
}