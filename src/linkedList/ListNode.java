package linkedList;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {}
    public ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static void main(String[] args) {
        // 1. Nodes create karein
        ListNode node3 = new ListNode(30);
        ListNode node2 = new ListNode(20, node3); // node2 points to node3
        ListNode head = new ListNode(10, node2);  // head (node1) points to node2

        // 2. List ko print karke check karein
        System.out.println("Linked List items:");
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}