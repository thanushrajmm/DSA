1. Find GCD
class Main {
    public static int gcd(int a, int b){
    if(b==0){
        return a;
    }
    return gcd(b,a%b);
}
    public static void main(String[] args) {
        System.out.print(gcd(48,18));
    }
}
2. Find Tower of hanoi
    class Main {
    public static void toh(int n, char A, char B, char C){
        if(n>0){
            toh(n-1,A,C,B);
            System.out.println("from "+A+" to "+C);
            toh(n-1,B,A,C);
        }
    }
    public static void main(String[] args) {
        toh(3,'A','B','C');
    }
}
