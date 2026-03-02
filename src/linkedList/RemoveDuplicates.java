package linkedList;

public class RemoveDuplicates {

    /**
     * Given a sorted linked list, delete all duplicates.
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public ListNode deleteDuplicates(ListNode head) {
        // Start from the head of the list
        ListNode current = head;

        // Traverse the list until we reach the end
        while (current != null && current.next != null) {
            // If current value matches the next value
            if (current.val == current.next.val) {
                // Skip the next node (effectively deleting the duplicate)
                current.next = current.next.next;
            } else {
                // Only move forward if no duplicate was found
                current = current.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        RemoveDuplicates solver = new RemoveDuplicates();

        // Manual setup: 1 -> 1 -> 2 -> 3 -> 3
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);

        System.out.print("Before: ");
        display(head);

        ListNode result = solver.deleteDuplicates(head);

        System.out.print("After:  ");
        display(result);
    }

    // Helper method to print the list
    public static void display(ListNode node) {
        while (node != null) {
            System.out.print(node.val + (node.next != null ? " -> " : ""));
            node = node.next;
        }
        System.out.println();
    }
}