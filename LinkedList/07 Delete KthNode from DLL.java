Problem link -> [https://tinyurl.com/ytau6hwn]
public class Solution {
       private static Node deleteHead(Node head) {
           if (head == null) {
            return null;
        }
        if (head.next == null) {
            return null; // List has only one element, becomes empty
        }

        head = head.next;
        head.prev = null; // Set 'prev' pointer of the new head to null
        return head;
    
    }
    private static Node deleteTail(Node head) {
         if (head == null || head.next == null) {
            return null; // List is empty or has only one element
        }

        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }

        Node newTail = tail.prev;
        newTail.next = null; // Disconnect the last node
        return head;
    }
    public static Node deleteNode(Node head, int k) {
        // Write Your Code Here.
        if (head == null) return null;
        if (k <= 0) return head; // Invalid position

        Node temp = head;
        int count = 1;

        while (temp != null && count < k) {
            temp = temp.next;
            count++;
        }

        if (temp == null) return head; // k is greater than the number of nodes

        if (temp.prev == null) {
            return deleteHead(head); // Node to delete is the head
        }
        if (temp.next == null) {
            return deleteTail(head); // Node to delete is the tail
        }

        // Node is in the middle
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;

        return head;
    }
}
