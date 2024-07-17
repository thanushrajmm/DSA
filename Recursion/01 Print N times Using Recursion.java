Input:
5
Output:
GFG GFG GFG GFG GFG;
//With Global Variable
class Solution {
    int count = 1; //global variable;
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
---------------------------------------------------------------------
//without Global variable
class Solution {

    public void print(int i,int N){
        if(i>N) return;
        System.out.print("GFG ");
        print(i+1,N);
    }
    void printGfg(int N) {
        // code here
        print(1,N);       //including parameter;
    }
}
