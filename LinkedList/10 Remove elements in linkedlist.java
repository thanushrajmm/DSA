problem link -> [https://leetcode.com/problems/remove-linked-list-elements/description/]
Example 1:
Input: head = [1,2,6,3,4,5,6], val = 6
Output: [1,2,3,4,5]
Example 2:

Input: head = [], val = 1
Output: []
Example 3:

Input: head = [7,7,7,7], val = 7
Output: []

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        // Handle edge case where head itself contains the value to be removed
        while (head != null && head.val == val) {
            head = head.next;
        }
        ListNode current = head;
        // Traverse through the list and remove matching elements
        while (current != null && current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next;  // Skip the node
            } else {
                current = current.next;  // Move to the next node
            }
        }
        return head;
    }
}

