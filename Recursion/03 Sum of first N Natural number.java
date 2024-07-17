//Functional Recursion
class Demo{
    public static int f(int n){
        if(n==0) return 0;
        return n+f(n-1);
    }
    public static void main(String[] args) {
        int n = 3;
        System.out.print(f(n));
    }

}
O/P = 6;
--------------------------------------------------------------------------------------
