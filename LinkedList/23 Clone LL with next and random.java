problem link -> [https://leetcode.com/problems/copy-list-with-random-pointer/]

1. brute force approach : using Hashmap
class Solution {
    public Node copyRandomList(Node head) {
        Node temp = head;
        HashMap<Node,Node> map = new HashMap<>(); 
       
        while(temp != null){
            Node newNode = new Node(temp.val);
            map.put(temp, newNode);
            temp = temp.next;
        }

        temp = head; 

        while(temp != null){
            Node copyNode = map.get(temp);
            copyNode.next = map.get(temp.next);
            copyNode.random = map.get(temp.random);
            temp = temp.next;
        }
        return map.get(head);
    }
}  
