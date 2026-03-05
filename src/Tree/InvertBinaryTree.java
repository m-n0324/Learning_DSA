/**
 * Given the root of a binary tree, invert the
 * tree, and return its root.
 *
 * Example 1:
 * 4 4
 * 2 7 7 2
 * 1 3 6 9 9 6 3 1
 *
 * Input: root = [4,2,7,1,3,6,9]
 * Output: [4,7,2,9,6,3,1]
 *
 * Example 2:
 * Input: root = []
 * Output: []
 *
 * Constraints:
 * The number of nodes in the tree is in the
 * range [0, 100].
 * -100 <= Node.val <= 100
 */
package Tree;

public class InvertBinaryTree {

    public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return null;

        // Swap the left and right children
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        // Recursively invert the subtrees
        invertTree(root.left);
        invertTree(root.right);

        return root;
    }

    public static void main(String[] args) {
        InvertBinaryTree solver = new InvertBinaryTree();

        // Create Tree: [4, 2, 7, 1, 3, 6, 9]
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        root.right = new TreeNode(7, new TreeNode(6), new TreeNode(9));

        System.out.println("Inverting Tree...");
        TreeNode invertedRoot = solver.invertTree(root);

        // Visual check: the new left child of 4 should be 7
        System.out.println("New root.left value: " + invertedRoot.left.val); // Expected: 7
        System.out.println("New root.right value: " + invertedRoot.right.val); // Expected: 2
    }
}