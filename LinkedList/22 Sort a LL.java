problem link -> [https://leetcode.com/problems/sort-list/]
class Solution {
    public static ListNode findMiddle(ListNode head){
        ListNode slow = head;
        ListNode fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static ListNode mergeTwo(ListNode list1, ListNode list2){
        ListNode dummyNode = new ListNode(-1);
        ListNode temp = dummyNode;

        ListNode t1 = list1;
        ListNode t2 = list2;

        while(t1 != null && t2 != null){
            if(t1.val < t2.val){
                temp.next = t1;
                temp = t1;
                t1 = t1.next;
            }
            else{
                temp.next = t2;
                temp = t2;
                t2 = t2.next;
            }
        }
        if(t1 != null){
            temp.next = t1;
        }
        else temp.next = t2;

        return dummyNode.next;
    }

    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode left = head;
        ListNode middle = findMiddle(head);
        ListNode right = middle.next;
        middle.next = null;

        left = sortList(left);
        right = sortList(right);
        return mergeTwo(left,right);
    }
}
