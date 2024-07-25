Problem Link ->https://tinyurl.com/kvdu6t2s 
Sample Input 1 :
3 4 5 2 6 1 9 -1
Sample Output 1 :
7
public class Solution {
    public static int length(Node head){
        //Your code goes here
        int count = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            count++;
        }
        return count;
    }
}
