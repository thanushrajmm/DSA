class Demo{
    private static Node deleteEL(Node head, int el){
        if(head=null) return head;
        if(head.data==el){
            Node temp = head;
            head = head.next;
            return head;
        }
        Node temp = head;
        Node prev = null;
        while(temp != null){
            if(temp.data == el){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }    
        return head;
    }
