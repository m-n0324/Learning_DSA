package linkedList;

/**
 * Definition for singly-linked list.
 */

public class MergeTwoSortedList {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Create a dummy node to act as the starting point
        ListNode dummy = new ListNode();
        ListNode temp = dummy;

        // Traverse both lists while they both have nodes
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                temp.next = list1;
                list1 = list1.next;
            } else {
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }

        // Attach the remaining nodes of the non-empty list
        temp.next = (list1 != null) ? list1 : list2;

        return dummy.next;
    }

    public static void main(String[] args) {
        MergeTwoSortedList solver = new MergeTwoSortedList();

        // List 1: 1 -> 2 -> 4
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        // List 2: 1 -> 3 -> 4
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        ListNode result = solver.mergeTwoLists(l1, l2);

        System.out.print("Merged List: ");
        printList(result);
    }

    private static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + (node.next != null ? " -> " : ""));
            node = node.next;
        }
        System.out.println();
    }
}