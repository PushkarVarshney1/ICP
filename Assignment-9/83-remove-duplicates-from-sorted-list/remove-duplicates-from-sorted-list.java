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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        // `curr` will be our main pointer, traversing the list.
        ListNode curr = head;
        while (curr != null && curr.next != null) {
            // it means we found a duplicate.
            if (curr.val == curr.next.val) {
                // To remove the duplicate (curr.next), we bypass it.
                // We make `curr.next` point to `curr.next.next`, effectively
                // removing `curr.next` from the list..
                curr.next = curr.next.next;
            } else {
                // If there's no duplicate (curr.val is different from curr.next.val),
                // then `curr` is unique (so far) and we can safely move `curr` to the next node.
                curr = curr.next;
            }
        }
        return head;
    }
}