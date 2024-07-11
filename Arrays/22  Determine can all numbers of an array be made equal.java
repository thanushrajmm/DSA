class Main{

   static boolean isEqual(int arr1[], int n)
    {
        for(int i=0; i<n;i++){
            while(arr1[i]%2==0){
                arr1[i] /=2;    //divide the value by 2 till remainder becomes 0
            }
            
            while (arr1[i]%3==0) {
                arr1[i] /=3;    //divide the value by 3 till remainder becomes 0
            }
        }
            for(int i = 1; i<n; i++){
                    if(arr1[i]!=arr1[0]){  //if arr[i] is not equal to arr[0];
                        return false;      //return false
                    }
            }
            return true;                  //else return true
            }
    public static void main(String args[])
    {
        int[] arr1 = {50,75,100};
        int m = arr1.length;
        if(isEqual(arr1,m)){
            System.out.println("Yes");
        }
        else
            System.out.println("no");
        }
    }
