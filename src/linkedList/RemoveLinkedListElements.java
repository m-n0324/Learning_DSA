package linkedList;

/**
 * Logic: Use a dummy node to handle deletions at the head seamlessly.
 */
public class RemoveLinkedListElements {

    public ListNode removeElements(ListNode head, int val) {
        // Dummy node acts as a precursor to the head
        ListNode dummy = new ListNode();
        dummy.next = head;

        ListNode temp = dummy;
        while (temp.next != null) {
            if (temp.next.val == val) {
                // Skip the node with the target value
                temp.next = temp.next.next;
            } else {
                // Only move forward if we didn't delete a node
                temp = temp.next;
            }
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        RemoveLinkedListElements solver = new RemoveLinkedListElements();

        // Create list: 1 -> 2 -> 6 -> 3 -> 4 -> 5 -> 6
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(6,
                new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6)))))));

        int valToRemove = 6;
        ListNode result = solver.removeElements(head, valToRemove);

        // Print result: 1 -> 2 -> 3 -> 4 -> 5
        System.out.print("Result: ");
        while (result != null) {
            System.out.print(result.val + (result.next != null ? " -> " : ""));
            result = result.next;
        }
    }
}