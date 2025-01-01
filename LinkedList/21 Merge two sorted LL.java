
class Solution {
    public static ListNode convertArrToLL(ArrayList<Integer> arr){
        ListNode dummyNode = new ListNode(-1);
        ListNode temp = dummyNode;
        int n = arr.size();
        for(int i = 0; i<n; i++){
            temp.next = new ListNode(arr.get(i));
            temp = temp.next;
        }
        return dummyNode.next;
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ArrayList<Integer> arr = new ArrayList<>();

        while(list1 != null){
            arr.add(list1.val);
            list1 = list1.next;
        }
        while(list2 != null){
            arr.add(list2.val);
            list2 = list2.next;
        }
        Collections.sort(arr);
        return convertArrToLL(arr);
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
