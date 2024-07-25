Problem link -> [https://tinyurl.com/2aady8f7]
public class Solution {
    public static Node deleteNode(Node head, int k) {
        // Write Your Code Here.
        int count = 0;
        Node temp = head;
   
    while(temp.next!=null){
        count++;
        if(count==k) break;
        temp = temp.next;
    }

        if(temp.next == null){
            temp.prev.next = null;
            temp.prev = null;
            return head;
        }
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
        temp.next = null;
        temp.prev = null;
        return head;
    }
}
