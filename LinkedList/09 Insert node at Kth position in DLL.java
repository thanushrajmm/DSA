problem link -> [https://www.geeksforgeeks.org/problems/insert-a-node-in-doubly-linked-list/1]
class GfG
{
    //Function to insert a new node at given position in doubly linked list.
    void addNode(Node head_ref, int pos, int data)
	{
		// Your code here
		Node temp = head_ref;
		Node newNode = new Node(data);
		int count = 1;
		while(count <=pos){
		    temp = temp.next;
		    count++;
		}
		Node ptr = temp.next;
		
		newNode.prev = temp;
		temp.next = newNode;
		newNode.next = ptr;
		ptr.prev = newNode;
	}
}
