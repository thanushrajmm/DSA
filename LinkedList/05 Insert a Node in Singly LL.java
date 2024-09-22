class Demo{
    private static Node insertBefVa(Node head, int el, int val){
        if(head==null) return null;
        if(head.data== val){
            return new Node(el,head);
        }
        Node temp = head;
        while(temp.next != null){
            if(temp.next.data == val){
                Node x = new Node(el,temp.next);
                temp.next = x;
                break;
            }
            temp = temp.next;
        }    
        return head;
    }
