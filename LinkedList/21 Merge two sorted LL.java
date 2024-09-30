problem link -> [ https://bit.ly/3vjuaGQ ]
public class Solution {
	public static LinkedListNode<Integer> sortTwoLists(LinkedListNode<Integer> first, LinkedListNode<Integer> second) {
		// Write your code here.
        LinkedListNode<Integer> t1 = first;
        LinkedListNode<Integer> t2 = second;
        LinkedListNode<Integer> dummyNode = new LinkedListNode<Integer>(-1);
        LinkedListNode<Integer> temp = dummyNode;

        while (t1 != null && t2 != null){
            if(t1.data < t2.data){
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

        if(t1!=null) temp.next = t1;
        else temp.next = t2;
        return dummyNode.next;
        
	}
}
-----------------------------------------------------------------------------------------------------------------------------------
problem link -> [ https://leetcode.com/problems/merge-two-sorted-lists/ ]

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        ListNode temp = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val > list2.val) {
                temp.next = list2;
                list2 = list2.next;
            } else {
                temp.next = list1;
                list1 = list1.next;
            }
            temp = temp.next;
        }
      
        temp.next = (list1 != null) ? list1 : list2;
        return dummy.next;        
    }
}
