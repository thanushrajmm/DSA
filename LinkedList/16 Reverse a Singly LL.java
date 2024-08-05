problem link -> [https://leetcode.com/problems/reverse-linked-list/]
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode temp = head;

        while(temp!=null){
            ListNode front = temp.next; //
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev; 
        
    }
}
-----------------------------------------------------------------------------------
//using Recursion

public class Solution
{
    public static Node reverseLinkedList(Node head)
    {
        // Write your code here.
        if(head ==null || head.next == null){
            return head;
        }

        Node newHead = reverseLinkedList(head.next);
        Node front = head.next;
        front.next = head;
        head.next = null;
        return newHead;
    }
}
