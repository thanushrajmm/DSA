class MyStack {
    private int[] arr;
    private int top;

    public MyStack() {
        arr = new int[1000];
        top = -1;
    }

    public void push(int x) {
        // Your Code
        if(top >= 1000) System.out.print("Stack size Exceeds");
        else{
            top = top + 1;
            arr[top] = x;
        }
    }

    public int pop() {
        // Your Code
       if(top == -1) return -1;
       return arr[top--];
    }
}
