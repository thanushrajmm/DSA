class Solution {
    Node constructDLL(int arr[]) {
        // Code here
        Node head = new Node(arr[0]);
        Node prev = head;
        for(int i = 1; i<arr.length; i++){
            Node temp = new Node(arr[i]);
         temp.prev = prev;
            prev.next = temp;
            prev = temp;
        }
        return head;
    }
}
