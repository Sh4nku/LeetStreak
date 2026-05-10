/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0)
            return head;

        ListNode tail = head;
        int length = 1;
        while (tail.next != null) {
            tail = tail.next;
            length++; // Length of Linekd List
        }
        k = k % length; // For example length == 5 , k = 2

        if (k == 0)
            return head;

        tail.next = head; // Circular Linked List

        int newTailSteps = length - k; // For example : newTailSteps = 5-2 : 3

        ListNode newTail = head;

        for (int i = 1; i < newTailSteps; i++) {   // Find New Tail till count is 3 
            newTail = newTail.next;
        }
        ListNode newHead = newTail.next; // Set new Head i.e index 4
        newTail.next = null; // Set new Tail next as null 

        return newHead;
    }
}