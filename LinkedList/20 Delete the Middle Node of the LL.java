problem link -> [https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/]
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = null;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }
        if(prev!=null){
            prev.next = slow.next;
        }
        return head;
    }
}
