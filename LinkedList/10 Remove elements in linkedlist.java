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
        ListNode temp1 = null;
        ListNode temp2 = head;
        while(temp2 != null){
            if(temp2.val == val){
                if(temp1 == null){
                    if(head.next == null){
                        return null;
                    }
                    head = head.next;
                    temp2 = head;
                }
                else if(temp2.next == null){
                    temp1.next = null;
                    break;
                }
                else{
                    temp2 = temp2.next;
                    temp1.next = temp2;
                }
            }
            else{
                temp1 = temp2;
                temp2 = temp1.next;
            }
        }
        return head;
    }
}
