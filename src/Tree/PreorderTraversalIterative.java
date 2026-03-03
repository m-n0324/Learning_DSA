package Tree;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreorderTraversalIterative {

    public List<Integer> iterativePreorder(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            result.add(temp.val);

            // Push right first so left is processed first (LIFO)
            if (temp.right != null) {
                stack.push(temp.right);
            }
            if (temp.left != null) {
                stack.push(temp.left);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        PreorderTraversalIterative solver = new PreorderTraversalIterative();

        // Constructing a sample tree:
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

        List<Integer> result = solver.iterativePreorder(root);
        System.out.println("Preorder Traversal: " + result);
        // Expected: [1, 2, 4, 5, 3]
    }
}