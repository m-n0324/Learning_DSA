package linkedList;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {}
    public TreeNode(int val) { this.val = val; }

    public static void main(String[] args) {
        // 1. Nodes create
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);

        // 2. Tree ko print use traversal
        System.out.println("In-order Traversal of the Tree:");
        printInOrder(root);
    }

    // In-order: Left -> Root -> Right
    public static void printInOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        printInOrder(node.left);
        System.out.print(node.val + " ");
        printInOrder(node.right);
    }
}