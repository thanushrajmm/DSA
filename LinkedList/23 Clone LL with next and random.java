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
---------------------------------------------------------------------------------------------
    2. Optimal approach:
class Solution {

    void printInBetween(Node head){
        Node temp = head;
        while(temp != null){
            Node nextElement = temp.next;
            Node copyNode = new Node(temp.val);
            copyNode.next = nextElement;
            temp.next = copyNode;
            temp = nextElement;
        }
    }

    void connectRandomPointers(Node head){
        Node temp = head;
        while(temp != null){

            Node copyNode = temp.next;

            if(temp.random != null){
                copyNode.random = temp.random.next;
            }
            else {
                copyNode.random = null;
            }

            temp = temp.next.next;
        }
    }
    
    public static Node connectNextPointers(Node head){
        Node temp = head;
        Node dummyNode = new Node(-1);
        Node res = dummyNode;
        while(temp != null){
            res.next = temp.next;
            res = res.next;

            temp.next = temp.next.next;
            temp = temp.next;
        }
        return dummyNode.next;
    }
    public Node copyRandomList(Node head) {
        printInBetween(head);
        connectRandomPointers(head);
        return connectNextPointers(head);
    }
}
