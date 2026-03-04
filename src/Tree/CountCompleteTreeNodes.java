package Tree;

public class CountCompleteTreeNodes {

    public int countNodes(TreeNode root) {
        if (root == null) return 0;
        // Post-order logic: root + left subtree + right subtree
        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    public static void main(String[] args) {
        CountCompleteTreeNodes solver = new CountCompleteTreeNodes();

        // Building the tree:
        //      1
        //     / \
        //    2   3
        //   / \
        //  4   5
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2, new TreeNode(4), new TreeNode(5));
        root.right = new TreeNode(3);

        System.out.println("Total nodes in tree: " + solver.countNodes(root));
    }
}