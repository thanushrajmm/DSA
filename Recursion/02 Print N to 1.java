Input:
N = 10
Output: 10 9 8 7 6 5 4 3 2 1

class Solution {
    public void print(int N){
        if(N<1) return;
        System.out.print(N + " ");
        print(N-1);
    }
    void printNos(int N) {
        print(N);
    }
}
----------------------------------------------------------------
//using Backtracking
class Solution {
public void print(int i, int N){
    if(i>N) return;
    print(i+1,N);
    System.out.print(i+" ");
}
    void printNos(int N) {
        print(1,N);
        
    }
}
