Input:
5
Output:
GFG GFG GFG GFG GFG;

class Solution {
    int count = 1;
    public void print(int N){
        if(count > N) return;
        System.out.print("GFG ");
        count++;
        print(N);
    }
    void printGfg(int N) {
        print(N);
    }
}
