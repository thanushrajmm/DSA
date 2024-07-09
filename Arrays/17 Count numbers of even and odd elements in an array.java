class Demo{
    public static void main(String[] args) {
        int[] arr = {1,2,6,3,7,8,9};
        int n = arr.length;
        int even=1,odd=1;
        int totalEven=0;
        int totalOdd=0;
        for(int i = 0; i<n; i++){
            if(arr[i]%2==0)
            totalEven = even++;
            else
            totalOdd = odd++;
        }
        System.out.println("total even "+ totalEven);
        System.out.println("total odd "+ totalOdd);
}
}
O/P:
total even 3
total odd 4
