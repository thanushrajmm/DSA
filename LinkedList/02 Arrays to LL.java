problem link -> [https://tinyurl.com/55cy4jtd]
public class Solution {
        
     public static void printLinkedList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
    public static Node constructLL(int []arr) {
        // Write your code here
           if (arr == null || arr.length == 0) {
            return null;
        }
        
        Node head = new Node(arr[0]);
        Node mover = head;
        
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        
        return head;
    }
}
