package linkedList;

public class IntersectionOfTwoLists {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // Base cases
        if (headA == null || headB == null) return null;

        ListNode first = headA;
        ListNode second = headB;

        // Traverse both lists
        while (first != second) {
            // If pointer reaches end, switch to the head of the OTHER list
            first = (first == null) ? headB : first.next;
            second = (second == null) ? headA : second.next;
        }

        // Either the intersection node or null
        return first;
    }

    public static void main(String[] args) {
        IntersectionOfTwoLists solver = new IntersectionOfTwoLists();

        // Create Intersection: 8 -> 4 -> 5
        ListNode intersect = new ListNode(8, new ListNode(4, new ListNode(5)));

        // List A: 4 -> 1 -> [8 -> 4 -> 5]
        ListNode headA = new ListNode(4, new ListNode(1, intersect));

        // List B: 5 -> 6 -> 1 -> [8 -> 4 -> 5]
        ListNode headB = new ListNode(5, new ListNode(6, new ListNode(1, intersect)));

        ListNode result = solver.getIntersectionNode(headA, headB);
        if (result != null) {
            System.out.println("Intersection at node with value: " + result.val);
        } else {
            System.out.println("No intersection.");
        }
    }
}