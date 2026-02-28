package linkedList;

/**
 * Definition for singly-linked list.
 */
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class MergeTwoSortedList {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Create a dummy node to act as the starting point
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }

        // Attach the remaining nodes of the non-empty list
        tail.next = (list1 != null) ? list1 : list2;

        return dummy.next;
    }

    // --- Helper Methods for Testing ---

    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + (curr.next != null ? " -> " : ""));
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MergeTwoSortedList messenger = new MergeTwoSortedList();

        // Create List 1: 1 -> 2 -> 4
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));

        // Create List 2: 1 -> 3 -> 4
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        System.out.print("List 1: ");
        printList(l1);
        System.out.print("List 2: ");
        printList(l2);

        ListNode mergedHead = messenger.mergeTwoLists(l1, l2);

        System.out.print("Merged List: ");
        printList(mergedHead);
    }
}