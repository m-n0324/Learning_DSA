package linkedList;

public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            // 1. Save the next node
            ListNode temp = current.next;
            // 2. Reverse the pointer
            current.next = prev;
            // 3. Move prev and current one step forward
            prev = current;
            current = temp;
        }

        return prev;
    }

    public static void main(String[] args) {
        ReverseLinkedList solver = new ReverseLinkedList();

        // Create: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3,
                new ListNode(4, new ListNode(5)))));

        System.out.print("Original: ");
        printList(head);

        ListNode reversed = solver.reverseList(head);

        System.out.print("Reversed: ");
        printList(reversed);
    }

    private static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + (node.next != null ? " -> " : ""));
            node = node.next;
        }
        System.out.println();
    }
}