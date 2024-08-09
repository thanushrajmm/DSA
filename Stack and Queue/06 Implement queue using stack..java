problem link -> [https://leetcode.com/problems/implement-queue-using-stacks/]
class MyQueue {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    public MyQueue() {
        
    }
    
    public void push(int x) {
        s1.add(x);
    }
    
    public int pop() {
        while(!s1.isEmpty()){
            s2.add(s1.pop());
        } 
        int removed = s2.pop();

        while(!s2.isEmpty()){
            s1.add(s2.pop());
        }
        return removed;
    }
    
    public int peek() {
        while(!s1.isEmpty()){
            s2.add(s1.pop());
        } 
        int top = s2.peek();

        while(!s2.isEmpty()){
            s1.add(s2.pop());
        }
        return top;
    }
    
    public boolean empty() {
        return s1.isEmpty();
    }
}
