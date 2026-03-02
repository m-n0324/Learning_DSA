package linkedList;

/**
 * Definition for singly-linked list.
 * This file must be named ListNode.java
 */
public class ListNode {
    public int val;
    public ListNode next;

    // Constructors
    public ListNode() {}

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}