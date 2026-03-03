package linkedList;

public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null) {
            if (slow == fast) {
                return true; // Cycle detected
            }
            slow = slow.next;        // Moves 1 step
            fast = fast.next.next;   // Moves 2 steps
        }

        return false; // Reached the end of the list
    }

    public static void main(String[] args) {
        LinkedListCycle solver = new LinkedListCycle();

        // 1. Create a list: 3 -> 2 -> 0 -> -4
        ListNode head = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node0 = new ListNode(0);
        ListNode node4 = new ListNode(-4);

        head.next = node2;
        node2.next = node0;
        node0.next = node4;

        // 2. Create a cycle: -4 points back to 2
        node4.next = node2;

        System.out.println("Has Cycle? " + solver.hasCycle(head)); // Should print true
    }
}